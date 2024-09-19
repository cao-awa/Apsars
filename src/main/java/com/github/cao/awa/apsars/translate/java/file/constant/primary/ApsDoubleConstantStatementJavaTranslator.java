package com.github.cao.awa.apsars.translate.java.file.constant.primary;

import com.github.cao.awa.apsars.translate.base.file.constant.primary.ApsDoubleConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.primary.ApsDoubleAst;

public class ApsDoubleConstantStatementJavaTranslator extends ApsJavaTranslator<ApsDoubleAst> implements ApsDoubleConstantStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsDoubleAst ast) {
        builder.append(ast.value()).append("D");
    }
}
