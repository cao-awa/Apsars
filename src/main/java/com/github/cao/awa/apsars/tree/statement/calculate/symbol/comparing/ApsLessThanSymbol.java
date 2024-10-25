package com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsLessThanSymbol extends ApsSymbolAst {
    public ApsLessThanSymbol(LanguageAst ast) {
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

    @Override
    public int level() {
        return 1;
    }
}
