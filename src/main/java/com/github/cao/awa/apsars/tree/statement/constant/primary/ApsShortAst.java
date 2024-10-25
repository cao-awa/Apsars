package com.github.cao.awa.apsars.tree.statement.constant.primary;

import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class ApsShortAst extends ApsConstantAst<Short> {
    private short value;

    public ApsShortAst(LanguageAst parent) {
        super(parent);
    }

    @Override
    public String literal() {
        return "(short)" + this.value;
    }

    @Override
    public Short constantValue() {
        return this.value;
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.SHORT;
    }
}
