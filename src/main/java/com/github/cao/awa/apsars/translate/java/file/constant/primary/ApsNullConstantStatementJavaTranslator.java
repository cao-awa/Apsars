package com.github.cao.awa.apsars.translate.java.file.constant.primary;

import com.github.cao.awa.apsars.translate.base.file.constant.primary.ApsNullConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.primary.ApsNullAst;

public class ApsNullConstantStatementJavaTranslator extends ApsJavaTranslator<ApsNullAst> implements ApsNullConstantStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsNullAst ast) {
        builder.append("null");
    }
}
