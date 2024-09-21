package com.github.cao.awa.apsars.tree.statement.result.instance;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsNewInstanceStatementAst extends ApsInvokeAst {
    public ApsNewInstanceStatementAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return findAst(ApsFileAst.class).findValidArgType(reference().nameIdentity());
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "New '" + reference().type().nameIdentity() + "' instance");

        if (!params().isEmpty()) {
            System.out.println(ident + "    |_ params: ");

            int i = 0;
            for (ApsResultPresentingAst param : params()) {
                System.out.print(ident + "    " + i++ + ": ");
                param.print(ident + "        ");
            }
        }
    }

    @Override
    public void preprocess() {
        super.preprocess();

        ApsArgTypeAst type = findAst(ApsFileAst.class).findValidArgType(reference().nameIdentity());
        if (type != null) {
            reference().type(type);

            System.out.println(reference().type() + " awa???");
        }
    }
}
