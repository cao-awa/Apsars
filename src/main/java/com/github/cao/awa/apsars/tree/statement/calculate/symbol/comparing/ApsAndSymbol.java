package com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsAndSymbol extends ApsSymbolAst {
    public ApsAndSymbol(LanguageAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "&";
    }

    @Override
    public String name() {
        return "and";
    }

    @Override
    public boolean notBinary() {
        return false;
    }

    @Override
    public int level() {
        return 0;
    }
}