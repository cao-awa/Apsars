package com.github.cao.awa.apsars.translate.java.file.method.body.statement.literal;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.literal.ApsLiteralStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;

public class ApsLiteralStatementJavaTranslator extends ApsJavaTranslator<ApsLiteralStatementAst> implements ApsLiteralStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsLiteralStatementAst ast) {
        builder.append(ast.statement());

        translateEnding(this);
    }
}
