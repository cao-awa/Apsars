package com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsPlusSymbol extends ApsSymbolAst {
    public ApsPlusSymbol(LanguageAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "+";
    }

    @Override
    public String name() {
        return "plus";
    }

    @Override
    public int level() {
        return 1;
    }
}
