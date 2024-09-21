package com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsAndSymbol extends ApsSymbolAst {
    public ApsAndSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "&";
    }

    @Override
    public String name() {
        return "and";
    }

    @Override
    public boolean notBinary() {
        return false;
    }

    @Override
    public int level() {
        return 0;
    }
}