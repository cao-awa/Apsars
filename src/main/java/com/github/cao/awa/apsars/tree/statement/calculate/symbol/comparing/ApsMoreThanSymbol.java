package com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsMoreThanSymbol extends ApsSymbolAst {
    public ApsMoreThanSymbol(LanguageAst ast) {
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
