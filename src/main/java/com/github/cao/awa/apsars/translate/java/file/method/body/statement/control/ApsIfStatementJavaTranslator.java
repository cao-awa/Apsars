package com.github.cao.awa.apsars.translate.java.file.method.body.statement.control;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.control.ApsIfStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.control.ApsIfStatementAst;

public class ApsIfStatementJavaTranslator extends ApsJavaTranslator<ApsIfStatementAst> implements ApsIfStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsIfStatementAst ast) {
        builder.append("if");
        paren(this, this::translatePredicate);
        braces(this, this::translateContext);
        translateElse(this);
        translateElseIf(this);
    }
}
