package com.github.cao.awa.apsars.tree.vararg;

import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public abstract class ApsStatementWithVarargs extends ApsStatementAst {
    private ApsArgTypeAst argType;

    public ApsStatementWithVarargs(LanguageAst parent) {
        super(parent);
    }
}
