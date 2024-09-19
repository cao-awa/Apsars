package com.github.cao.awa.apsars.translate.java.file.constant.primary;

import com.github.cao.awa.apsars.translate.base.file.constant.primary.ApsIntConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.primary.ApsIntAst;

public class ApsIntConstantStatementJavaTranslator extends ApsJavaTranslator<ApsIntAst> implements ApsIntConstantStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsIntAst ast) {
        builder.append(ast.value());
    }
}
