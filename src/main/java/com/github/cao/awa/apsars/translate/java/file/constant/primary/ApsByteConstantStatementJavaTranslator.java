package com.github.cao.awa.apsars.translate.java.file.constant.primary;

import com.github.cao.awa.apsars.translate.base.file.constant.primary.ApsByteConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.primary.ApsByteAst;

public class ApsByteConstantStatementJavaTranslator extends ApsJavaTranslator<ApsByteAst> implements ApsByteConstantStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsByteAst ast) {
        builder.append(ast.value());
    }
}
