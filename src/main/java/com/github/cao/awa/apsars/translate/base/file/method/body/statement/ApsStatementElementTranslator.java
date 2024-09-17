package com.github.cao.awa.apsars.translate.base.file.method.body.statement;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

public interface ApsStatementElementTranslator<T extends ApsStatementAst> extends ApsElementTranslator<T> {
    default void translateStatement(ApsTranslator<T> translator) {
        ApsStatementAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(TranslateElement.byType(ast.getClass()), next -> {
            next.postTranslate(builder, Manipulate.cast(ast));
        });
    }

    default void translateEnding(ApsTranslator<T> translator) {
        if (translator.ast().withEnd()) {
            translator.builder().append(";");
        }
    }
}
