package com.github.cao.awa.apsars.translate.base.file.binder;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;

public interface ApsBinderElementTranslator extends ApsElementTranslator<ApsBinderAst> {
    default void translateMethod(ApsTranslator<ApsBinderAst> translator) {
        ApsBinderAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(TranslateElement.METHOD, next -> {
            for (ApsMethodAst method : ast.methods()) {
                next.postTranslate(builder, method);
            }
        });
    }
}
