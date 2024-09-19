package com.github.cao.awa.apsars.tree.statement.calculate;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeObjectAst;
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

    public ApsResultPresentingAst convertInvoke(boolean appendDelegateAccessor) {
        ApsResultPresentingAst ast = deepCalculate(
                left(),
                symbol(),
                right()
        );

        if (appendDelegateAccessor) {
            ApsInvokeAst invoke = ((ApsInvokeAst) ast.resultingStatement());
            invoke.addFluentInvoke(
                    new ApsInvokeAst(this)
                            .accessingPublicField(true)
                            .isFluent(true)
                            .nameIdentity("delegate")
            );
        }
        return ast;
    }

    public ApsResultPresentingAst deepCalculate(ApsResultPresentingAst left, ApsSymbolAst symbol, ApsResultPresentingAst right) {
        if (symbol == null) {
            if (left.resultingStatement() instanceof ApsCalculateAst calculateAst) {
                return calculateAst.convertInvoke(false);
            } else {
                return ApsResultPresentingAst.statement(this, left.resultingStatement());
            }
        }

        ApsInvokeAst invoke = null;

        if (left.resultingStatement() instanceof ApsCalculateAst calculateAst) {
            left = calculateAst.convertInvoke(false);
            invoke = (ApsInvokeAst) left.resultingStatement();
        } else if (left.resultingStatement() != null) {
            invoke = (ApsInvokeAst) left.resultingStatement();
        } else if (left.refToken() != null) {
            invoke = new ApsInvokeObjectAst(this).objectName(left.refToken());
        }

        if (right.resultingStatement() instanceof ApsCalculateAst calculateAst) {
            right = calculateAst.convertInvoke(false);

            invoke.nameIdentity(this.symbol.name());

            invoke.addParam(right);
        } else if (right.refToken() != null) {
            if (left.resultingStatement() != null) {
                ApsInvokeAst fluentInvoke = new ApsInvokeAst(invoke).isFluent(true);

                fluentInvoke.nameIdentity(this.symbol.name());

                fluentInvoke.addParam(right);

                invoke.addFluentInvoke(fluentInvoke);

            } else {
                invoke.nameIdentity(this.symbol.name());

                invoke.addParam(right);

                ((ApsInvokeObjectAst) invoke).objectName(left.refToken());

            }
        }
        return ApsResultPresentingAst.statement(this, invoke);
    }

    @Override
    public void preprocess() {

    }
}
