package com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsMinusSymbol extends ApsSymbolAst {
    public ApsMinusSymbol(LanguageAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "-";
    }

    @Override
    public String name() {
        return "minus";
    }

    @Override
    public String oppositeName() {
        return "minusBy";
    }

    @Override
    public int level() {
        return 2;
    }
}
