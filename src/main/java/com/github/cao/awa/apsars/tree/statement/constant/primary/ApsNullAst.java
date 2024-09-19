package com.github.cao.awa.apsars.tree.statement.constant.primary;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;

public class ApsNullAst extends ApsConstantAst {
    public ApsNullAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public String literal() {
        return "null";
    }
}
