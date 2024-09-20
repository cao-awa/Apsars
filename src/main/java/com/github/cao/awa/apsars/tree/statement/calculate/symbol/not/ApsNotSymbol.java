package com.github.cao.awa.apsars.tree.statement.calculate.symbol.not;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsNotSymbol extends ApsSymbolAst {
    public ApsNotSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "!";
    }

    @Override
    public String name() {
        return "isNot";
    }
}
