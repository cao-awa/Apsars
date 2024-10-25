package com.github.cao.awa.apsars.translate.base.file.type;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.vararg.ApsAstWithVarargs;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

public interface ApsAstWithVarargsElementTranslator extends LanguageElementTranslator<ApsAstWithVarargs> {
    default void translateVarargs(LanguageTranslator<ApsAstWithVarargs> translator) {
        ApsAstWithVarargs ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.byType(ast.getClass()), next -> {
            next.postTranslate(builder, Manipulate.cast(ast));
        });
    }
}
