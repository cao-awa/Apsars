package com.github.cao.awa.apsars.tree.statement.constant;

import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class ApsStringAst extends ApsConstantAst {
    private String value;

    public ApsStringAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public String literal() {
        return this.value;
    }
}
