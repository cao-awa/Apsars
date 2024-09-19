package com.github.cao.awa.apsars.tree.statement.result;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsReturnAst extends ApsStatementAst {
    private ApsResultPresentingAst result;

    public ApsReturnAst(ApsAst ast) {
        super(ast);
        withEnd(true);
    }

    @Override
    public void print(String ident) {
        System.out.print("Return value: ");
        this.result.print(ident);
    }

    @Override
    public void preprocess() {

    }
}
