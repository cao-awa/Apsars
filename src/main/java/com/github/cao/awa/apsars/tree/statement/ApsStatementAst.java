package com.github.cao.awa.apsars.tree.statement;

import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public abstract class ApsStatementAst extends ApsAst {
    public ApsStatementAst(ApsAst ast) {
        super(ast);
    }
}
