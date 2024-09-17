package com.github.cao.awa.apsars.translate.base.file.method.body.statement.control;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting.ApsResultingStatementElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.control.ApsIfStatementAst;

public interface ApsIfStatementElementTranslator extends ApsResultingStatementElementTranslator<ApsIfStatementAst> {
    default void translatePredicate(ApsTranslator<ApsIfStatementAst> translator) {
        translator.postNextTranslate(
                TranslateElement.RESULT_PRESENTING_STATEMENT,
                ApsIfStatementAst::predicate
        );
    }

    default void translateContext(ApsTranslator<ApsIfStatementAst> translator) {
        translator.postNextTranslate(
                TranslateElement.METHOD_BODY,
                ApsIfStatementAst::statements
        );
    }

    default void translateElse(ApsTranslator<ApsIfStatementAst> translator) {
        translator.postNextTranslate(
                TranslateElement.METHOD_BODY,
                ApsIfStatementAst::elseStatements
        );
    }

    default void translateElseIf(ApsTranslator<ApsIfStatementAst> translator) {
        translator.postNextTranslate(
                TranslateElement.IF_STATEMENT,
                ApsIfStatementAst::elseIfStatement
        );
    }
}
