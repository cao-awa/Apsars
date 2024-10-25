package com.github.cao.awa.apsars.translate.base.file.method.body.statement.control;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting.ApsResultingStatementElementTranslator;
import com.github.cao.awa.apsars.tree.statement.control.ApsIfStatementAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;

public interface ApsIfStatementElementTranslator extends ApsResultingStatementElementTranslator<ApsIfStatementAst> {
    default void translatePredicate(LanguageTranslator<ApsIfStatementAst> translator) {
        translator.postNextTranslate(
                ApsarsTranslateElement.RESULT_PRESENTING_STATEMENT,
                ApsIfStatementAst::predicate
        );
    }

    default void translateContext(LanguageTranslator<ApsIfStatementAst> translator) {
        translator.postNextTranslate(
                ApsarsTranslateElement.METHOD_BODY,
                ApsIfStatementAst::statements
        );
    }

    default void translateElse(LanguageTranslator<ApsIfStatementAst> translator) {
        translator.postNextTranslate(
                ApsarsTranslateElement.METHOD_BODY,
                ApsIfStatementAst::elseStatements
        );
    }

    default void translateElseIf(LanguageTranslator<ApsIfStatementAst> translator) {
        translator.postNextTranslate(
                ApsarsTranslateElement.IF_STATEMENT,
                ApsIfStatementAst::elseIfStatement
        );
    }
}
