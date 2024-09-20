package com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsMinusSymbol extends ApsSymbolAst {
    public ApsMinusSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "-";
    }

    @Override
    public String name() {
        return "minus";
    }

    @Override
    public String oppositeName() {
        return "minusBy";
    }
}
