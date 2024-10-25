package com.github.cao.awa.apsars.tree.statement;

import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public abstract class ApsStatementAst extends LanguageAst {
    private boolean withEnd = false;

    public ApsStatementAst(LanguageAst ast) {
        super(ast);
    }
}
