package com.github.cao.awa.apsars.translate.java.file.constant.primary;

import com.github.cao.awa.apsars.translate.base.file.constant.primary.ApsCharConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.primary.ApsCharAst;

public class ApsCharConstantStatementJavaTranslator extends ApsJavaTranslator<ApsCharAst> implements ApsCharConstantStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsCharAst ast) {
        builder.append(ast.value());
    }
}
