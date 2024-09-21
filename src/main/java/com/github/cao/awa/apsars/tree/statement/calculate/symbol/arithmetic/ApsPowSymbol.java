package com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsPowSymbol extends ApsSymbolAst {
    public ApsPowSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "^";
    }

    @Override
    public String name() {
        return "pow";
    }

    @Override
    public String oppositeName() {
        return "powBy";
    }

    @Override
    public int level() {
        return 4;
    }
}
