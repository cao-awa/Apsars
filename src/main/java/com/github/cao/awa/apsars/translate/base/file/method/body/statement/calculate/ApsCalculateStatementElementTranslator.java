package com.github.cao.awa.apsars.translate.base.file.method.body.statement.calculate;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting.ApsResultingStatementElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.calculate.ApsCalculateAst;

public interface ApsCalculateStatementElementTranslator extends ApsResultingStatementElementTranslator<ApsCalculateAst> {
    default void translateTotal(ApsTranslator<ApsCalculateAst> translator) {
        parenOr(
                translator,
                ApsCalculateAst::totalWithParen,
                this::translateContext
        );
    }

    default void translateContext(ApsTranslator<ApsCalculateAst> translator) {
        parenOr(
                translator,
                ApsCalculateAst::leftWithParen,
                this::translateLeft
        );

        if (translator.ast().symbol() != null) {
            translateSymbol(translator);

            parenOr(
                    translator,
                    ApsCalculateAst::rightWithParen,
                    this::translateRight
            );
        }
    }

    default void translateLeft(ApsTranslator<ApsCalculateAst> translator) {
        translator.postNextTranslate(
                TranslateElement.RESULT_PRESENTING_STATEMENT,
                ApsCalculateAst::left
        );
    }

    default void translateRight(ApsTranslator<ApsCalculateAst> translator) {
        translator.postNextTranslate(
                TranslateElement.RESULT_PRESENTING_STATEMENT,
                ApsCalculateAst::right
        );
    }

    default void translateSymbol(ApsTranslator<ApsCalculateAst> translator) {
        translator.builder().append(translator.ast().symbol());
    }
}
