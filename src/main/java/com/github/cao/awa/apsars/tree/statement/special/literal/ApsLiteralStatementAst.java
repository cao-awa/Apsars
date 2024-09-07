package com.github.cao.awa.apsars.tree.statement.special.literal;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsLiteralStatementAst extends ApsStatementAst {
    @Getter
    private final String statement;

    public ApsLiteralStatementAst(ApsAst ast, String statement) {
        super(ast);
        this.statement = statement;
    }

    @Override
    public void print(String ident) {
        System.out.println("Literal: " + this.statement);
    }

    @Override
    public void generateJava(StringBuilder builder) {
        builder.append(this.statement);
        if (withEnd()) {
            builder.append(";");
        }
    }

    @Override
    public void preprocess() {

    }
}
