package com.github.cao.awa.apsars.translate.base.file.type;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.ApsStatementElementTranslator;
import com.github.cao.awa.apsars.tree.vararg.ApsStatementWithVarargs;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

public interface ApsStatementWithVarargsElementTranslator extends ApsStatementElementTranslator<ApsStatementWithVarargs> {
    default void translateVarargs(LanguageTranslator<ApsStatementWithVarargs> translator) {
        ApsStatementWithVarargs ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.byType(ast.getClass()), next -> {
            next.postTranslate(builder, Manipulate.cast(ast));
        });
    }
}
