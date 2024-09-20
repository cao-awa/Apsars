package com.github.cao.awa.apsars.tree.statement.constant.primary;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class ApsBooleanAst extends ApsConstantAst<Boolean> {
    private boolean value;

    public ApsBooleanAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public String literal() {
        return this.value ? "true" : "false";
    }

    @Override
    public Boolean constantValue() {
        return this.value;
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.BOOLEAN;
    }
}
