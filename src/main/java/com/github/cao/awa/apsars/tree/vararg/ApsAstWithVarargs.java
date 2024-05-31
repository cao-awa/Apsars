package com.github.cao.awa.apsars.tree.vararg;

import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public abstract class ApsAstWithVarargs extends ApsAst {
    @Getter
    @Setter
    private ApsArgTypeAst argType;

    public ApsAstWithVarargs(ApsAst parent) {
        super(parent);
    }

    @Override
    public String generateJava() {
        return this.argType.generateJava();
    }
}
