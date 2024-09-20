package com.github.cao.awa.apsars.tree.statement.calculate;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeObjectAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsCalculateAst extends ApsResultingStatementAst {
    private ApsResultPresentingAst left;
    private ApsSymbolAst symbol;
    private ApsResultPresentingAst right;
    private boolean leftWithParen;
    private boolean rightWithParen;
    private boolean totalWithParen;

    public ApsCalculateAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("statement_type", "calculate");

        JSONObject left = new JSONObject();
        this.left.generateStructure(left);
        json.put("left", left);

        if (this.symbol != null) {
            json.put("symbol", this.symbol.symbol());

            JSONObject right = new JSONObject();
            this.right.generateStructure(right);
            json.put("right", right);
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
        System.out.print(ident + "|_ Left: ");
        this.left.print(ident + concat + "   ");
        if (this.symbol != null) {
            System.out.println(ident + "|_ Symbol: " + this.symbol.symbol());
            System.out.print(ident + "|_ Right: ");
            this.right.print(ident + "    ");
        }
    }

    public ApsResultPresentingAst convertSymbol(boolean appendDelegateAccessor) {
        ApsResultPresentingAst ast = deepCalculate(
                this.left,
                this.symbol,
                this.right
        );

        if (ast.resultingStatement() instanceof ApsCalculateAst calculate) {
            calculate.totalWithParen(true);
        }

        if (appendDelegateAccessor && ast.resultingStatement() instanceof ApsInvokeAst invoke) {
            invoke.addFluentInvoke(
                    new ApsInvokeAst(this)
                            .accessingPublicField(true)
                            .isFluent(true)
                            .reference(
                                    new ApsRefReferenceAst(invoke)
                                            .nameIdentity("delegate")
                                            .doNotProcess(true)
                            )
            );
        }
        return ast;
    }

    public ApsResultPresentingAst deepCalculate(ApsResultPresentingAst left, ApsSymbolAst symbol, ApsResultPresentingAst right) {
        if (symbol == null) {
            if (left.resultingStatement() instanceof ApsCalculateAst calculateAst) {
                return calculateAst.convertSymbol(false);
            } else {
                return ApsResultPresentingAst.statement(this, left.resultingStatement());
            }
        }

        if (left.resultingStatement() instanceof ApsCalculateAst leftCalculate && right.resultingStatement() instanceof ApsCalculateAst rightCalculate) {
            ApsCalculateAst calculate = new ApsCalculateAst(this);
            calculate.left(leftCalculate.convertSymbol(false));
            calculate.symbol(symbol);
            calculate.right(rightCalculate.convertSymbol(false));
            return ApsResultPresentingAst.statement(this, calculate);
        }

        if (left.resultingType() != ApsArgTypeAst.UNKNOWN) {
            if (right.resultingType() != ApsArgTypeAst.UNKNOWN) {
                return deepNoCalculateNode(left, symbol, right);
            } else if (right.resultingStatement() instanceof ApsCalculateAst rightCalculate) {
                return deepNoCalculateNode(left, symbol, rightCalculate.convertSymbol(false));
            }
        } else if (right.resultingType() != ApsArgTypeAst.UNKNOWN) {
            if (left.resultingStatement() instanceof ApsCalculateAst leftCalculate) {
                return deepNoCalculateNode(leftCalculate.convertSymbol(false), symbol, right);
            } else {
                return deepNoCalculateNode(left, symbol, right);
            }
        }
        return null;
    }

    private ApsResultPresentingAst deepNoCalculateNode(ApsResultPresentingAst left, ApsSymbolAst symbol, ApsResultPresentingAst right) {
        if (left.reference() != null && left.resultingType().referencePrimary() == null) {
            ApsInvokeObjectAst invoke = new ApsInvokeObjectAst(this);
            invoke.objectName(left.reference().dump(invoke).doNotProcess(true));
            invoke.reference(new ApsRefReferenceAst(invoke).nameIdentity(symbol.name()).doNotProcess(true));
            invoke.addParam(right);
            return ApsResultPresentingAst.statement(this, invoke);
        }

        if (symbol != null) {
            if (right.reference() != null && (symbol.leftPrimary() || right.resultingType().referencePrimary() == null)) {
                ApsInvokeObjectAst invoke = new ApsInvokeObjectAst(this);
                invoke.objectName(right.reference().dump(invoke).doNotProcess(true));
                invoke.reference(new ApsRefReferenceAst(invoke).nameIdentity(symbol.oppositeName()).doNotProcess(true));
                invoke.addParam(left);
                return ApsResultPresentingAst.statement(this, invoke);
            }

            if (right.resultingStatement() instanceof ApsCalculateAst rightCalculate) {
                ApsCalculateAst calculate = new ApsCalculateAst(this);
                calculate.left(left);
                calculate.symbol(symbol);
                calculate.right(rightCalculate.convertSymbol(false));
                calculate.totalWithParen(totalWithParen);
                return ApsResultPresentingAst.statement(this, calculate);
            }

            if (left.resultingStatement() instanceof ApsCalculateAst leftCalculate) {
                ApsCalculateAst calculate = new ApsCalculateAst(this);
                calculate.left(leftCalculate.convertSymbol(false));
                calculate.symbol(symbol);
                calculate.right(right);
                calculate.totalWithParen(totalWithParen);
                return ApsResultPresentingAst.statement(this, calculate);
            } else {
                return calculateNoCalculatingNode(left, symbol, right);
            }
        }

        return null;
    }

    private ApsResultPresentingAst calculateNoCalculatingNode(ApsResultPresentingAst left, ApsSymbolAst symbol, ApsResultPresentingAst right) {
        if (right.reference() != null || right.constant() != null || right.resultingStatement() != null) {
            ApsCalculateAst calculate = new ApsCalculateAst(this);
            calculate.left(left);
            calculate.symbol(symbol);
            calculate.right(right);
            calculate.totalWithParen(totalWithParen);
            return ApsResultPresentingAst.statement(this, calculate);
        }

        return null;
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
    }
}
