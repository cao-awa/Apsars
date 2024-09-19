package com.github.cao.awa.apsars.translate.java.file.method.body.statement.resulting;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting.ApsResultPresentingStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;

public class ApsResultPresentingStatementJavaTranslator extends ApsJavaTranslator<ApsResultPresentingAst> implements ApsResultPresentingStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsResultPresentingAst ast) {
        if (ast.refToken() != null) {
            builder.append(ast.refToken());
        } else if (ast.resultingStatement() != null) {
            postTranslate(TranslateElement.RESULTING_STATEMENT, ast.resultingStatement());
        } else if (ast.literal() != null) {
            postTranslate(TranslateElement.LITERAL_STATEMENT, ast.literal());
        } else if (ast.constant() != null) {
            postTranslate(TranslateElement.CONSTANT, ast.constant());
        }
    }
}
