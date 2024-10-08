package com.github.cao.awa.apsars.translate.java.file.constant.primary;

import com.github.cao.awa.apsars.translate.base.file.constant.primary.ApsBooleanConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.primary.ApsBooleanAst;

public class ApsBooleanConstantStatementJavaTranslator extends ApsJavaTranslator<ApsBooleanAst> implements ApsBooleanConstantStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsBooleanAst ast) {
        builder.append(ast.value());
    }
}
