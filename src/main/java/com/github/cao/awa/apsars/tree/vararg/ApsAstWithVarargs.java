package com.github.cao.awa.apsars.tree.vararg;

import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public abstract class ApsAstWithVarargs extends LanguageAst {
    private ApsArgTypeAst argType;

    public ApsAstWithVarargs(LanguageAst parent) {
        super(parent);
    }
}
