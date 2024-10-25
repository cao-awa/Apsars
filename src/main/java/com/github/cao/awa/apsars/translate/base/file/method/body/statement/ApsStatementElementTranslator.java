package com.github.cao.awa.apsars.translate.base.file.method.body.statement;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

public interface ApsStatementElementTranslator<T extends ApsStatementAst> extends LanguageElementTranslator<T> {
    default void translateStatement(LanguageTranslator<T> translator) {
        ApsStatementAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.byType(ast.getClass()), next -> {
            next.postTranslate(builder, Manipulate.cast(ast));
        });
    }

    default void translateEnding(LanguageTranslator<T> translator) {
        if (translator.ast().withEnd()) {
            translator.builder().append(";");
        }
    }
}
