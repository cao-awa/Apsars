package com.github.cao.awa.apsars.translate.java.file.method.body.exception;

import com.github.cao.awa.apsars.translate.base.file.method.body.exception.ApsTryCatchStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.trys.ApsTryCatchAst;

public class ApsTryCatchStatementJavaTranslator extends ApsJavaTranslator<ApsTryCatchAst> implements ApsTryCatchStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsTryCatchAst ast) {
        if (ast.catchList() == null) {
            translateMethodBody(this);
        } else {
            builder.append("try");
            braces(this, this::translateMethodBody);
            builder.append("catch");
            paren(this, this::translateCatchList);

            braces(this, this::translateCatchingMethodBody);
        }
    }
}
