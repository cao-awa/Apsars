package com.github.cao.awa.apsars.tree.statement.invoke;

import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsInvokeObjectAst extends ApsInvokeAst {
    private ApsRefReferenceAst objectName;

    public ApsInvokeObjectAst addParam(ApsResultPresentingAst param) {
        params().add(param);
        return this;
    }

    public ApsInvokeObjectAst(LanguageAst ast) {
        super(ast);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        ApsVariableAst variable = findAst(ApsMethodBodyAst.class).fieldVariable(this.objectName.nameIdentity());

        if (variable != null) {
            return variable.type();
        }

        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void print(String ident, boolean endElement) {
        System.out.println("Aps invoke: " + objectName() + "." + reference() + (fluentInvoke().isEmpty() ? "" : " (fluent" + (withEnd() ? "/end" : "") + ")"));
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
