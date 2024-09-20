package com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsDivideSymbol extends ApsSymbolAst {
    public ApsDivideSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "/";
    }

    @Override
    public String name() {
        return "divide";
    }

    @Override
    public String oppositeName() {
        return "divideBy";
    }
}
