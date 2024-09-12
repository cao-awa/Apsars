package com.github.cao.awa.apsars.tree.statement;

import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;

public class ApsStatements {
    public final static ApsStatementAst DO_NOTHING = new ApsLiteralStatementAst(null, "").withEnd(false);
}
