package com.github.cao.awa.apsars.translate.base.file.method.body.statement.calculate;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting.ApsResultingStatementElementTranslator;
import com.github.cao.awa.apsars.tree.statement.calculate.ApsCalculateAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;

public interface ApsCalculateStatementElementTranslator extends ApsResultingStatementElementTranslator<ApsCalculateAst> {
    default void translateTotal(LanguageTranslator<ApsCalculateAst> translator) {
        parenOr(
                translator,
                ApsCalculateAst::totalWithParen,
                this::translateContext
        );
    }

    default void translateContext(LanguageTranslator<ApsCalculateAst> translator) {
        try {
            parenOr(
                    translator,
                    ApsCalculateAst::leftWithParen,
                    this::translateLeft
            );

            parenOr(
                    translator,
                    ApsCalculateAst::rightWithParen,
                    this::translateRight
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    default void translateLeft(LanguageTranslator<ApsCalculateAst> translator) {
        translator.postNextTranslate(
                ApsarsTranslateElement.RESULT_PRESENTING_STATEMENT,
                ApsCalculateAst::left
        );
    }

    default void translateRight(LanguageTranslator<ApsCalculateAst> translator) {
        if (translator.ast().right() != null) {
            translateSymbol(translator);
        }

        translator.postTranslate(ApsarsTranslateElement.RESULT_PRESENTING_STATEMENT, translator.ast().right());

        translator.translator(ApsarsTranslateElement.CALCULATE_STATEMENT, next -> {
            if (translator.ast().rights() != null) {
                for (ApsCalculateAst right : translator.ast().rights()) {
                    next.postTranslate(translator.builder(), right);
                }
            }
        });
    }

    default void translateSymbol(LanguageTranslator<ApsCalculateAst> translator) {
        ApsSymbolAst symbol = translator.ast().symbol();
        if (symbol != null) {
            translator.builder().append(symbol.symbol());
        }
    }
}
