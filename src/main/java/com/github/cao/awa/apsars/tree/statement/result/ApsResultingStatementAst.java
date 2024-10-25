package com.github.cao.awa.apsars.tree.statement.result;

import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public abstract class ApsResultingStatementAst extends ApsStatementAst {
    public ApsResultingStatementAst(LanguageAst parent) {
        super(parent);
    }

    public abstract ApsArgTypeAst resultingType();
}
