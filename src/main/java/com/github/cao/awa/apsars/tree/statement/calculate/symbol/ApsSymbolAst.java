package com.github.cao.awa.apsars.tree.statement.calculate.symbol;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.not.ApsNotSymbol;

public abstract class ApsSymbolAst extends ApsStatementAst {
    public static final ApsNotSymbol NOT = new ApsNotSymbol(null);

    public ApsSymbolAst(ApsAst ast) {
        super(ast);
    }

    public abstract String symbol();

    public abstract String name();
}
