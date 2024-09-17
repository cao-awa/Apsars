package com.github.cao.awa.apsars.translate.java.file.method.body.statement.control;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.control.ApsYieldStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.result.ApsYieldAst;

public class ApsYieldStatementJavaTranslator extends ApsJavaTranslator<ApsYieldAst> implements ApsYieldStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsYieldAst ast) {
        // No content will be generated.
    }
}
