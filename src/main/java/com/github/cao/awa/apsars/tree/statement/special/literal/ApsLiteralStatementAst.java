package com.github.cao.awa.apsars.tree.statement.special.literal;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;

public class ApsLiteralStatementAst extends ApsStatementAst {
    @Getter
    private final String statement;

    public ApsLiteralStatementAst(ApsAst ast, String statement) {
        super(ast);
        this.statement = statement;
    }

    @Override
    public void print(String ident) {
        System.out.println(this.statement);
    }

    @Override
    public void generateJava(StringBuilder builder) {
        builder.append(this.statement);
    }

    @Override
    public void preprocess() {

    }
}
