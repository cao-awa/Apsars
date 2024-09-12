package com.github.cao.awa.apsars.tree.statement.result.instance;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsNewInstanceStatementAst extends ApsInvokeAst {
    @Getter
    @Setter
    private String resultType;

    public ApsNewInstanceStatementAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return findAst(ApsFileAst.class).findValidArgType(this.resultType);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "New '" + this.resultType + "' instance");

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

    }

    @Override
    public void generateJava(StringBuilder builder) {
        builder.append("new ");
        builder.append(this.resultType);
        builder.append("(");
        generateParams(builder);
        builder.append(")");

        if (withEnd()) {
            builder.append(";");
        }
    }
}
