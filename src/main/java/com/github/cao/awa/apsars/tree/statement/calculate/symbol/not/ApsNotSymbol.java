package com.github.cao.awa.apsars.tree.statement.calculate.symbol.not;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsNotSymbol extends ApsSymbolAst {
    public ApsNotSymbol(LanguageAst ast) {
        super(ast);
    }

    @Override
    public String symbol() {
        return "!";
    }

    @Override
    public String name() {
        return "isNot";
    }

    @Override
    public int level() {
        return 0;
    }
}
