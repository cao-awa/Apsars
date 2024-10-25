package com.github.cao.awa.apsars.translate.java.file.method.body.statement.control;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.control.ApsReturnStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.result.ApsReturnAst;

public class ApsReturnStatementJavaTranslator extends ApsJavaTranslator<ApsReturnAst> implements ApsReturnStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsReturnAst ast) {
        builder.append("return ");

        postTranslate(ApsarsTranslateElement.RESULT_PRESENTING_STATEMENT, ast.result());

        translateEnding(this);
    }
}
