package com.github.cao.awa.apsars.tree.statement.invoke;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Accessors(fluent = true)
public class ApsInvokeAst extends ApsResultingStatementAst {
    @Setter
    private String nameIdentity;
    private final List<ApsResultPresentingAst> params = ApricotCollectionFactor.arrayList();
    @Setter
    private List<ApsInvokeAst> fluentInvoke = ApricotCollectionFactor.arrayList();
    @Setter
    private boolean isFluent = false;
    @Setter
    private boolean accessingPublicField = false;

    public ApsInvokeAst addParam(ApsResultPresentingAst param) {
        this.params.add(param);

        return this;
    }

    public ApsInvokeAst addFluentInvoke(ApsInvokeAst invokeAst) {
        this.fluentInvoke.add(invokeAst);

        return this;
    }

    public ApsInvokeAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void print(String ident, boolean endElement) {
        System.out.println("Aps invoke: " + this.nameIdentity + (this.fluentInvoke.isEmpty() ? "" : " (fluent" + (withEnd() ? "/end" : "") + ")"));
        System.out.println(ident + "|_ params: ");
        if (!this.params.isEmpty()) {
            int i = 0;
            for (ApsResultPresentingAst param : this.params) {
                System.out.print(ident + "   " + i++ + ": ");
                param.print(ident + "   ");
            }
        }
        if (!this.fluentInvoke.isEmpty()) {
            System.out.println(ident + "|_ next invoke: ");
            int i = 1;
            for (ApsInvokeAst fluentInvoke : this.fluentInvoke) {
                System.out.print(ident + "    " + i + ": ");
                fluentInvoke.print(ident + "    ", i++ == this.fluentInvoke.size());
            }
        }
    }

    @Override
    public void preprocess() {
        for (ApsInvokeAst ast : fluentInvoke()) {
            ast.preprocess();
        }

        ApsMethodBodyAst body = findAst(ApsMethodBodyAst.class);

        if (body != null) {
            for (ApsResultPresentingAst param : params()) {
                param.preprocess();

                System.out.println("Param: " + param.refToken() + ", " + param.literal() + ", " + param.constant() + ", " + param.resultingStatement() + ", " + param);

                if (param.refToken() != null) {
                    ApsVariableAst variable = body.fieldVariable(param.refToken());
                    if (variable.type().isRefPrimary()) {
                        param.refToken(variable.primaryTo());
                    }
                }
            }
        }
    }
}
