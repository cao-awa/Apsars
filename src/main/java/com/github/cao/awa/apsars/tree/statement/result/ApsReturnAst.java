package com.github.cao.awa.apsars.tree.statement.result;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsReturnAst extends ApsStatementAst {
    @Getter
    @Setter
    private ApsResultPresentingAst result;

    public ApsReturnAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public void print(String ident) {
        System.out.print("Return value: ");
        this.result.print(ident);
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void generateJava(StringBuilder builder) {
        builder.append("return ");
        this.result.generateJava(builder);

        if (withEnd()) {
            builder.append(";");
        }
    }
}
