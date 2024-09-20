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
public class ApsDoubleAst extends ApsConstantAst<Double> {
    private double value;

    public ApsDoubleAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public String literal() {
        return Double.toString(this.value);
    }

    @Override
    public Double constantValue() {
        return this.value;
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.DOUBLE;
    }
}
