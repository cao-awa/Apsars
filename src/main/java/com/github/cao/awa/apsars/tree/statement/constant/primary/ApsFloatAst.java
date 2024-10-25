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
public class ApsFloatAst extends ApsConstantAst<Float> {
    private float value;

    public ApsFloatAst(LanguageAst parent) {
        super(parent);
    }

    @Override
    public String literal() {
        return Float.toString(this.value);
    }

    @Override
    public Float constantValue() {
        return this.value;
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.FLOAT;
    }
}
