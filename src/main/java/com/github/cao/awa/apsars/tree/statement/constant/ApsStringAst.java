package com.github.cao.awa.apsars.tree.statement.constant;

import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class ApsStringAst extends ApsConstantAst<String> {
    private String value;

    public ApsStringAst(LanguageAst parent) {
        super(parent);
    }

    @Override
    public String literal() {
        return this.value;
    }

    @Override
    public String constantValue() {
        return this.value;
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.STRING;
    }
}
