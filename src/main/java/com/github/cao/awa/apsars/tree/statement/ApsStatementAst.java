package com.github.cao.awa.apsars.tree.statement;

import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public abstract class ApsStatementAst extends ApsAst {
    private boolean withEnd = false;

    public ApsStatementAst(ApsAst ast) {
        super(ast);
    }
}
