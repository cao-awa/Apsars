package com.github.cao.awa.apsars.translate.java.file.method.body.statement.resulting;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting.ApsResultPresentingStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;

public class ApsResultPresentingStatementJavaTranslator extends ApsJavaTranslator<ApsResultPresentingAst> implements ApsResultPresentingStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsResultPresentingAst ast) {
        if (ast.reference() != null) {
            postTranslate(ApsarsTranslateElement.REFERENCE, ast.reference());
        } else if (ast.resultingStatement() != null) {
            postTranslate(ApsarsTranslateElement.RESULTING_STATEMENT, ast.resultingStatement());
        } else if (ast.literal() != null) {
            postTranslate(ApsarsTranslateElement.LITERAL_STATEMENT, ast.literal());
        } else if (ast.constant() != null) {
            postTranslate(ApsarsTranslateElement.CONSTANT, ast.constant());
        }
    }
}
