package com.github.cao.awa.apsars.translate.java.file.constant.primary;

import com.github.cao.awa.apsars.translate.base.file.constant.primary.ApsShortConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.primary.ApsShortAst;

public class ApsShortConstantStatementJavaTranslator extends ApsJavaTranslator<ApsShortAst> implements ApsShortConstantStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsShortAst ast) {
        builder.append("(short)").append(ast.value());
    }
}
