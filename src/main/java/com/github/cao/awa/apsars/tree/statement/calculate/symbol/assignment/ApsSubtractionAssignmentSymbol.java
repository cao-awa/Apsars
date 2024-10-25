package com.github.cao.awa.apsars.tree.statement.calculate.symbol.assignment;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsOperators;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsSubtractionAssignmentSymbol extends ApsSymbolAst {
    public ApsSubtractionAssignmentSymbol(LanguageAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "-=";
    }

    @Override
    public ApsSymbolAst operatorSymbol() {
        return ApsOperators.MINUS;
    }

    @Override
    public String name() {
        return "minus";
    }

    @Override
    public boolean isAssigment() {
        return true;
    }

    @Override
    public int level() {
        return 2;
    }
}
