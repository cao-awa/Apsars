package com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsMoreThanSymbol extends ApsSymbolAst {
    public ApsMoreThanSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return ">";
    }

    @Override
    public String name() {
        return "isMoreThan";
    }

    @Override
    public String oppositeName() {
        return "isLessThan";
    }

    @Override
    public boolean leftPrimary() {
        return true;
    }

    @Override
    public int level() {
        return 1;
    }
}
