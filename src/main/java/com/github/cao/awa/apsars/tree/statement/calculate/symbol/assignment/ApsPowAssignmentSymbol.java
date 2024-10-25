package com.github.cao.awa.apsars.tree.statement.calculate.symbol.assignment;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsOperators;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsPowAssignmentSymbol extends ApsSymbolAst {
    public ApsPowAssignmentSymbol(LanguageAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "^=";
    }

    @Override
    public ApsSymbolAst operatorSymbol() {
        return ApsOperators.POW;
    }

    @Override
    public String name() {
        return "pow";
    }

    @Override
    public boolean isAssigment() {
        return true;
    }

    @Override
    public int level() {
        return 4;
    }
}
