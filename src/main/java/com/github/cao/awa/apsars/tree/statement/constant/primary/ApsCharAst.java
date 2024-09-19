package com.github.cao.awa.apsars.tree.statement.constant.primary;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class ApsCharAst extends ApsConstantAst {
    private char value;

    public ApsCharAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public String literal() {
        return "(char)" + ((int) this.value);
    }
}
