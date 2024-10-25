package com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsDivideSymbol extends ApsSymbolAst {
    public ApsDivideSymbol(LanguageAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "/";
    }

    @Override
    public String name() {
        return "divide";
    }

    @Override
    public String oppositeName() {
        return "divideBy";
    }

    @Override
    public int level() {
        return 3;
    }
}
