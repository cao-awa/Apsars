package com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.ApsStatementElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

public interface ApsResultingStatementElementTranslator<T extends ApsResultingStatementAst> extends ApsStatementElementTranslator<T> {
    default void translateStatement(ApsTranslator<T> translator) {
        ApsResultingStatementAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(TranslateElement.byType(ast.getClass()), next -> {
            next.postTranslate(builder, Manipulate.cast(ast));
        });
    }
}
