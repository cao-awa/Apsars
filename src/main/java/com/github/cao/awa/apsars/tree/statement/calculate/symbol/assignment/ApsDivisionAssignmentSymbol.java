package com.github.cao.awa.apsars.tree.statement.calculate.symbol.assignment;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsOperators;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;

public class ApsDivisionAssignmentSymbol extends ApsSymbolAst {
    public ApsDivisionAssignmentSymbol(ApsAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "/=";
    }

    @Override
    public ApsSymbolAst operatorSymbol() {
        return ApsOperators.DIVIDE;
    }

    @Override
    public String name() {
        return "divide";
    }

    @Override
    public boolean isAssigment() {
        return true;
    }

    @Override
    public int level() {
        return 3;
    }
}
