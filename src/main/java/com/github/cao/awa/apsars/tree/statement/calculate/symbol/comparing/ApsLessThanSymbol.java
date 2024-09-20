package com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsLessThanSymbol extends ApsSymbolAst {
    public ApsLessThanSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "<";
    }

    @Override
    public String name() {
        return "isLessThan";
    }

    @Override
    public String oppositeName() {
        return "isMoreThan";
    }

    @Override
    public boolean leftPrimary() {
        return true;
    }
}
