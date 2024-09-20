package com.github.cao.awa.apsars.tree.statement.constant.primary;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;

public class ApsNullAst extends ApsConstantAst<Object> {
    public ApsNullAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public String literal() {
        return "null";
    }

    @Override
    public Boolean constantValue() {
        return null;
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.UNKNOWN;
    }
}
