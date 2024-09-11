package com.github.cao.awa.apsars.tree.statement;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;

public abstract class ApsResultingStatementAst extends ApsStatementAst {
    public ApsResultingStatementAst(ApsAst parent) {
        super(parent);
    }

    public abstract ApsArgTypeAst resultingType();
}
