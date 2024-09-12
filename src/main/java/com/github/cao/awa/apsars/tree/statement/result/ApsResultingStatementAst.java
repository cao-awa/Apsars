package com.github.cao.awa.apsars.tree.statement.result;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;

public abstract class ApsResultingStatementAst extends ApsStatementAst {
    public ApsResultingStatementAst(ApsAst parent) {
        super(parent);
    }

    public abstract ApsArgTypeAst resultingType();
}
