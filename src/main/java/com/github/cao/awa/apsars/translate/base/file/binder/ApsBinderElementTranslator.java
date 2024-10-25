package com.github.cao.awa.apsars.translate.base.file.binder;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;

public interface ApsBinderElementTranslator extends LanguageElementTranslator<ApsBinderAst> {
    default void translateMethod(LanguageTranslator<ApsBinderAst> translator) {
        ApsBinderAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.METHOD, next -> {
            for (ApsMethodAst method : ast.methods()) {
                next.postTranslate(builder, method);
            }
        });
    }
}
