package com.github.cao.awa.apsars.tree.vararg;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public abstract class ApsStatementWithVarargs extends ApsStatementAst {
    private ApsArgTypeAst argType;

    public ApsStatementWithVarargs(ApsAst parent) {
        super(parent);
    }
}
