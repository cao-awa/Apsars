package com.github.cao.awa.apsars.translate.java.file.method.body.statement;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.ApsStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;

public class ApsStatementJavaTranslator extends ApsJavaTranslator<ApsStatementAst> implements ApsStatementElementTranslator<ApsStatementAst> {
    @Override
    public void translate(StringBuilder builder, ApsStatementAst ast) {
        translateStatement(this);
    }
}
