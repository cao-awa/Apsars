package com.github.cao.awa.apsars.translate.base.file.type;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.vararg.ApsAstWithVarargs;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

public interface ApsAstWithVarargsElementTranslator extends ApsElementTranslator<ApsAstWithVarargs> {
    default void translateVarargs(ApsTranslator<ApsAstWithVarargs> translator) {
        ApsAstWithVarargs ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(TranslateElement.byType(ast.getClass()), next -> {
            next.postTranslate(builder, Manipulate.cast(ast));
        });
    }
}
