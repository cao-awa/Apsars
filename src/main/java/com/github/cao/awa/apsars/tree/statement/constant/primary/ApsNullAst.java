package com.github.cao.awa.apsars.tree.statement.constant.primary;

import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class ApsNullAst extends ApsConstantAst<Object> {
    public ApsNullAst(LanguageAst parent) {
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
