package com.github.cao.awa.apsars.tree.vararg;

import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public abstract class ApsAstWithVarargs extends ApsAst {
    private ApsArgTypeAst argType;

    public ApsAstWithVarargs(ApsAst parent) {
        super(parent);
    }
}
