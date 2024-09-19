package com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsEqualsSymbol extends ApsSymbolAst {
    public ApsEqualsSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "==";
    }

    @Override
    public String name() {
        return "isEquals";
    }

    @Override
    public void preprocess() {

    }
}
