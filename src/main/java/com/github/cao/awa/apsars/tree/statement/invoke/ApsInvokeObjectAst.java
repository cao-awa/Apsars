package com.github.cao.awa.apsars.tree.statement.invoke;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsInvokeObjectAst extends ApsInvokeAst {
    private String objectName;

    public ApsInvokeObjectAst addParam(ApsResultPresentingAst param) {
        params().add(param);
        return this;
    }

    public ApsInvokeObjectAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void print(String ident, boolean endElement) {
        System.out.println("Aps invoke: " + objectName() + "." + nameIdentity() + (fluentInvoke().isEmpty() ? "" : " (fluent" + (withEnd() ? "/end" : "") + ")"));
        System.out.println(ident + "|_ params: ");
        if (!params().isEmpty()) {
            int i = 0;
            for (ApsResultPresentingAst param : params()) {
                System.out.print(ident + "   " + i++ + ": ");
                param.print(ident + "   ");
            }
        }
        if (!fluentInvoke().isEmpty()) {
            System.out.println(ident + "|_ next invoke: ");
            int i = 1;
            for (ApsInvokeAst fluentInvoke : fluentInvoke()) {
                System.out.print(ident + "    " + i + ": ");
                fluentInvoke.print(ident + "    ", i++ == fluentInvoke().size());
            }
        }
    }
}
