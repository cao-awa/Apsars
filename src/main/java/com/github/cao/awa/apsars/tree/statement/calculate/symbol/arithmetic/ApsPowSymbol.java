package com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsPowSymbol extends ApsSymbolAst {
    public ApsPowSymbol(LanguageAst ast) {
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
