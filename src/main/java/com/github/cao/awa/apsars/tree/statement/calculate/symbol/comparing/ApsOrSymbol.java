package com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsOrSymbol extends ApsSymbolAst {
    public ApsOrSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "|";
    }

    @Override
    public String name() {
        return "or";
    }

    @Override
    public boolean notBinary() {
        return false;
    }
}