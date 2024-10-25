package com.github.cao.awa.apsars.tree.statement.calculate;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsOperators;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeObjectAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.statement.result.instance.ApsNewInstanceStatementAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.LinkedList;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsCalculateAst extends ApsResultingStatementAst {
    private ApsResultPresentingAst left;
    private ApsSymbolAst symbol;
    private ApsResultPresentingAst right;
    private LinkedList<ApsCalculateAst> rights = ApricotCollectionFactor.linkedList();
    private boolean leftWithParen;
    private boolean rightWithParen;
    private boolean totalWithParen;
    private boolean doNotGroup;

    public ApsCalculateAst(LanguageAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("statement_type", "calculate");

        if (this.left != null) {
            JSONObject left = new JSONObject();
            this.left.generateStructure(left);
            json.put("left", left);
        }

        if (this.symbol != null) {
            json.put("symbol", this.symbol.symbol());

            JSONArray rights = new JSONArray();
            rights.add(this.right);

            if (this.rights != null) {
                for (ApsCalculateAst right : this.rights) {
                    JSONObject theRight = new JSONObject();
                    right.generateStructure(theRight);
                    rights.add(theRight);
                }
            }
            json.put("rights", rights);
        }
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void print(String ident) {
        String concat = this.symbol != null ? "|" : " ";

        System.out.println("Aps calculate" + (this.totalWithParen ? " with parenthesis" : "") + ": ");
        if (this.left != null) {
            System.out.print(ident + "|_ Left: ");
            this.left.print(ident + concat + "   ");
        }
        if (this.symbol != null) {
            System.out.println(ident + "|_ Symbol: " + this.symbol.symbol());
        }
        if (this.right != null || (this.rights != null && !this.rights.isEmpty())) {
            System.out.println(ident + "|_ Rights: ");
            int i = 0;
            System.out.print(ident + "    0: ");
            if (this.right != null) {
                this.right.print(ident + "    ");
                i++;
            }
            if (this.rights != null) {
                if (!this.rights.isEmpty()) {
                    for (ApsCalculateAst right : this.rights) {
                        System.out.print(ident + "    " + i++ + ": ");
                        right.print(ident + "    ");
                    }
                }
            }
        }
    }

    public ApsCalculateAst deepCalculate() {
        this.left = deepCalculateLeft();
        this.right = deepCalculateRight();

        if (!this.doNotGroup) {
            if (this.left != null && this.left.resultingStatement() instanceof ApsCalculateAst calculate) {
                calculate.deepCalculate();
            }

            if (this.right != null && this.right.resultingStatement() instanceof ApsCalculateAst calculate) {
                calculate.deepCalculate();
            }

            if (this.rights != null) {
                this.rights.forEach(ApsCalculateAst::deepCalculate);
            }
        }

        deepExtractRight();

        return this;
    }

    public ApsResultPresentingAst deepCalculateLeft() {
        if (this.left != null && this.left.resultingStatement() instanceof ApsCalculateAst calculate) {
            return ApsResultPresentingAst.statement(this, calculate.deepCalculate());
        }
        return this.left;
    }

    public ApsResultPresentingAst deepCalculateRight() {
        if (this.doNotGroup || this.rights == null || this.right == null || (this.left == null && this.right.resultingStatement() instanceof ApsCalculateAst calculate)) {
            return this.right;
        }

        int lastCalculateLevel = this.symbol != null ? this.symbol.level() : -1;

        boolean shouldRecalculateRight = false;
        boolean shouldDeliveryRight = false;

        LinkedList<ApsCalculateAst> rights = ApricotCollectionFactor.linkedList();
        LinkedList<ApsCalculateAst> removing = ApricotCollectionFactor.linkedList();
        if (this.right != null && this.right.resultingStatement() instanceof ApsCalculateAst calculate) {
            rights.add(calculate);
        } else {
            if (!this.rights.isEmpty()) {
                shouldDeliveryRight = true;
                rights.addAll(this.rights);
            }
        }
        for (ApsCalculateAst right : rights) {
            ApsSymbolAst rightSymbol = right.symbol();
            right = right.deepCalculate();
            if (rightSymbol != null) {
                if (!shouldRecalculateRight && rightSymbol.level() < lastCalculateLevel) {
                    this.left = ApsResultPresentingAst.statement(this, extractingRight(shouldDeliveryRight ? this.right : null, removing).totalWithParen(true));
                    if (shouldDeliveryRight) {
                        this.right = null;
                        this.symbol = null;
                    } else {
                        symbol(right.symbol());
                    }
                    removing.clear();
                    removing.add(right);
                    shouldRecalculateRight = true;
                } else if (rightSymbol.level() == lastCalculateLevel) {
                    removing.add(right);
                } else {
                    removing.add(right);
                }
            }
        }

        if (this.rights != null) {
            this.rights = ApricotCollectionFactor.linkedList();
            this.rights.addAll(removing);
        }

        if (shouldRecalculateRight) {
            deepCalculateRight();
        }

        return this.right;
    }

    public void deepExtractRight() {
        if (this.rights != null && !this.rights.isEmpty()) {
            if (this.right == null) {
                if (this.rights.size() == 1) {
                    ApsCalculateAst right = this.rights.removeFirst();
                    this.right = ApsResultPresentingAst.statement(this, right);
                    this.rights = null;
                } else {
                    ApsCalculateAst firstRight = this.rights.removeFirst();
                    this.right = firstRight.right();
                    this.symbol = firstRight.symbol();
                }
            }
        }

        if (this.left == null && this.right != null && this.right.resultingStatement() instanceof ApsCalculateAst calculate) {
            if (calculate.left() != null && calculate.right() == null) {
                left(calculate.left());
                this.right = null;
            }
        }
    }

    public ApsCalculateAst extractingRight(ApsResultPresentingAst currentRight, LinkedList<ApsCalculateAst> calculate) {
        ApsCalculateAst newLeft = new ApsCalculateAst(this);
        newLeft.left(this.left);
        newLeft.symbol(this.symbol);
        newLeft.right(currentRight);

        for (ApsCalculateAst right : calculate) {
            if (newLeft.right() == null) {
                newLeft.right(ApsResultPresentingAst.statement(newLeft, right));
            } else {
                newLeft.rights().add(right);
            }
        }

        return newLeft;
    }

    public void connectingSymbolsToRight() {
        if (this.right == null || this.rights == null || this.rights.size() < 2) {
            return;
        }

        if (this.right.resultingStatement() instanceof ApsCalculateAst calculate) {
            if (calculate.doNotGroup()) {
                return;
            }
        }

        LinkedList<ApsCalculateAst> rights = ApricotCollectionFactor.linkedList();

        ApsResultPresentingAst lastResult = this.right;

        for (ApsCalculateAst calculate : this.rights) {
            ApsResultPresentingAst theRight = calculate.right();
            rights.add(make(lastResult, calculate.symbol(), theRight));
            lastResult = theRight;
        }

        if (rights.size() == 1) {
            this.right = ApsResultPresentingAst.statement(this, rights.removeFirst().doNotGroup(true));
            this.rights = null;
            return;
        }

        ApsCalculateAst firstRight = new ApsCalculateAst(this);
        firstRight.left(ApsResultPresentingAst.statement(this, rights.removeFirst()));
        firstRight.symbol(ApsOperators.BREAKING_AND);
        firstRight.right(ApsResultPresentingAst.statement(this, rights.removeFirst()));
        firstRight.rights(ApricotCollectionFactor.linkedList());
        firstRight.doNotGroup(true);

        for (ApsCalculateAst calculateAst : rights) {
            ApsCalculateAst and = new ApsCalculateAst(this);
            and.symbol(ApsOperators.BREAKING_AND);
            and.right(ApsResultPresentingAst.statement(this, calculateAst));
            firstRight.rights.add(and);
        }

        this.right = ApsResultPresentingAst.statement(this, firstRight);
        this.rights = null;
    }

    public void connectingSymbols() {
        if (this.right == null) {
            return;
        }

        LinkedList<ApsCalculateAst> rights = ApricotCollectionFactor.linkedList();

        ApsResultPresentingAst lastResult = this.right;

        if (this.left != null) {
            if (this.left.resultingStatement() instanceof ApsCalculateAst calculate) {
                if (calculate.doNotGroup()) {
                    connectingSymbolsToRight();
                }
                return;
            }
            rights.add(make(this.left, this.symbol, lastResult));
        }

        if (this.rights != null) {
            for (ApsCalculateAst calculate : this.rights) {
                ApsResultPresentingAst theRight = calculate.right();
                rights.add(make(lastResult, calculate.symbol(), theRight));
                lastResult = theRight;
            }
        }

        if (rights.isEmpty()) {
            return;
        }

        this.doNotGroup = true;

        if (rights.size() == 1) {
            ApsCalculateAst right = rights.removeFirst();
            this.left = right.left();
            this.symbol = right.symbol();
            this.right = right.right();
            this.rights = null;
            return;
        }

        this.left = ApsResultPresentingAst.statement(this, rights.removeFirst());
        this.symbol = ApsOperators.BREAKING_AND;
        this.right = ApsResultPresentingAst.statement(this, rights.removeFirst());
        this.rights = ApricotCollectionFactor.linkedList();

        for (ApsCalculateAst calculateAst : rights) {
            ApsCalculateAst and = new ApsCalculateAst(this);
            and.symbol(ApsOperators.BREAKING_AND);
            and.right(ApsResultPresentingAst.statement(this, calculateAst));
            this.rights.add(and);
        }
    }

    public static ApsCalculateAst make(ApsResultPresentingAst left, ApsSymbolAst symbol, ApsResultPresentingAst right) {
        ApsCalculateAst connecting = new ApsCalculateAst(null);
        connecting.left(left);
        connecting.symbol(symbol);
        connecting.right(right);
        return connecting;
    }

    public boolean isSameSymbol(ApsCalculateAst calculate) {
        return this.symbol.equals(calculate.symbol());
    }

    public int getLevel() {
        if (this.symbol != null) {
            return this.symbol.level();
        }

        return -1;
    }

    public ApsCalculateAst dump(LanguageAst parent) {
        return new ApsCalculateAst(parent)
                .left(this.left)
                .symbol(this.symbol)
                .right(this.right)
                .rights(this.rights == null ? null : ApricotCollectionFactor.linkedList(this.rights))
                .leftWithParen(this.leftWithParen)
                .rightWithParen(this.rightWithParen)
                .totalWithParen(this.totalWithParen);
    }

    public void replaceAssignment() {
        ApsMethodBodyAst body = findAst(ApsMethodBodyAst.class);

        ApsRefReferenceAst reference = this.left.reference();

        ApsVariableAst variable = body.fieldVariable(reference.nameIdentity());

        ApsResultPresentingAst result;

        ApsCalculateAst calculate = new ApsCalculateAst(this);

        calculate.left(this.left);
        calculate.symbol(this.symbol.operatorSymbol());
        calculate.right(this.right);
        calculate.rights(this.rights);

        if (variable.type().referencePrimary().sync()) {
            ApsInvokeObjectAst invoke = new ApsInvokeObjectAst(body);

            invoke.objectName(reference.dump(invoke));
            invoke.reference(new ApsRefReferenceAst(invoke).nameIdentity("delegate").doNotProcess(true));
            invoke.addParam(ApsResultPresentingAst.statement(invoke, calculate));
            invoke.preprocess();

            result = ApsResultPresentingAst.statement(calculate, invoke);
        } else {
            ApsVariableAst assignment = new ApsVariableAst(body);
            assignment.reference(reference.dump(assignment));
            assignment.defining(false);
            assignment.assignment(ApsResultPresentingAst.statement(assignment, calculate));
            assignment.preprocess();

            ApsNewInstanceStatementAst newApsarsPrimary = new ApsNewInstanceStatementAst(body);
            newApsarsPrimary.reference(reference.dump(newApsarsPrimary).doNotProcess(true));

            body.replaceMe(
                    this,
                    assignment
            );

            return;
        }

        ApsNewInstanceStatementAst newApsarsPrimary = new ApsNewInstanceStatementAst(body);
        newApsarsPrimary.reference(reference.dump(newApsarsPrimary).doNotProcess(true));

        boolean replaced = body.replaceMe(
                this,
                result.resultingStatement()
        );

        if (!replaced) {
            this.left = result;
            this.symbol = null;
            this.right = null;
            this.rights = null;
            withEnd(false);
        }
    }

    @Override
    public void preprocess() {
        if (this.left != null) {
            this.left.parent(this);
            this.left.preprocess();
        }
        if (this.symbol != null) {
            this.symbol.parent(this);
            this.symbol.preprocess();
        }
        if (this.right != null) {
            this.right.parent(this);
            this.right.preprocess();

            if (!this.symbol.isAssigment()) {
                deepCalculate();
            } else {
                replaceAssignment();
            }
        } else {
            this.symbol = null;
        }

        if (this.rights != null) {
            for (ApsCalculateAst right : this.rights) {
                right.parent(this);
                right.preprocess();
            }
        }

        if (this.symbol != null && this.symbol.level() == 0) {
            if (this.left != null && this.left.resultingStatement() instanceof ApsCalculateAst leftCalculate) {
                leftCalculate.totalWithParen(true);
            }
            if (this.right != null && this.right.resultingStatement() instanceof ApsCalculateAst rightCalculate) {
                rightCalculate.totalWithParen(true);
            }
        }
    }

    @Override
    public void postprocess() {
        if (this.left != null) {
            this.left.postprocess();
        }
        if (this.symbol != null) {
            this.symbol.postprocess();
        }
        if (this.right != null) {
            this.right.postprocess();
        }

        if (this.rights != null) {
            for (ApsCalculateAst right : this.rights) {
                right.postprocess();
            }
        }
    }

    @Override
    public void consequence() {
        if (this.left != null) {
            this.left.consequence();
        }
        if (this.symbol != null) {
            this.symbol.consequence();
        }
        if (this.right != null) {
            this.right.consequence();
        }

        if (this.rights != null) {
            for (ApsCalculateAst right : this.rights) {
                right.consequence();
            }
        }
    }
}
