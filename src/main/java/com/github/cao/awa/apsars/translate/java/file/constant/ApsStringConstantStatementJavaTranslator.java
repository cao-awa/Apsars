package com.github.cao.awa.apsars.translate.java.file.constant;

import com.github.cao.awa.apsars.translate.base.file.constant.ApsStringConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.ApsStringAst;

public class ApsStringConstantStatementJavaTranslator extends ApsJavaTranslator<ApsStringAst> implements ApsStringConstantStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsStringAst ast) {
        builder.append(ast.value());
    }
}
