package com.github.cao.awa.apsars.tree.statement.invoke;

import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsInvokeObjectAst extends ApsInvokeAst {
    @Getter
    @Setter
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
        super.print(ident, endElement);
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void generateJava(StringBuilder builder) {
        if (fluentInvoke() != null) {
            builder.append(".");
        } else {
            builder.append(this.objectName);
            builder.append(".");
        }
        builder.append(nameIdentity());
        builder.append("(");

        generateParams(builder);

        builder.append(")");

        if (withEnd()) {
            builder.append(ApsTokens.SEMICOLON);
        }
    }
}
