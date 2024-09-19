package com.github.cao.awa.apsars.translate.java.file.constant.primary;

import com.github.cao.awa.apsars.translate.base.file.constant.primary.ApsLongConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.primary.ApsLongAst;

public class ApsLongConstantStatementJavaTranslator extends ApsJavaTranslator<ApsLongAst> implements ApsLongConstantStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsLongAst ast) {
        builder.append(ast.value()).append("L");
    }
}
