package com.github.cao.awa.apsars.tree.statement.constant;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public abstract class ApsConstantAst extends ApsStatementAst {
    private ApsArgTypeAst argType;

    public ApsConstantAst(ApsAst parent) {
        super(parent);
    }

    public abstract String literal();

    @Override
    public void preprocess() {

    }
}
