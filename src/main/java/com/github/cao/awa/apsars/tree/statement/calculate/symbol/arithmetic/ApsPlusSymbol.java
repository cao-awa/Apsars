package com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsPlusSymbol extends ApsSymbolAst {
    public ApsPlusSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "+";
    }

    @Override
    public String name() {
        return "plus";
    }

    @Override
    public int level() {
        return 1;
    }
}
