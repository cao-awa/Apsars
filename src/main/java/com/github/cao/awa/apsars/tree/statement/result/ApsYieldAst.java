package com.github.cao.awa.apsars.tree.statement.result;

import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsYieldAst extends ApsReturnAst {
    public ApsYieldAst(LanguageAst ast) {
        super(ast);
    }

    @Override
    public void print(String ident) {
        System.out.print("Yield value: ");
        result().print(ident);
    }

    @Override
    public void preprocess() {

    }
}
