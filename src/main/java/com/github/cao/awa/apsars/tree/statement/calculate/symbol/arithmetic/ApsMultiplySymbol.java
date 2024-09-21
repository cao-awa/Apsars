package com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsMultiplySymbol extends ApsSymbolAst {
    public ApsMultiplySymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "*";
    }

    @Override
    public String name() {
        return "multiply";
    }

    @Override
    public int level() {
        return 3;
    }
}
