package com.github.cao.awa.apsars.translate.base.file.global;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.global.ApsGlobalAst;

public interface ApsGlobalElementTranslator extends ApsElementTranslator<ApsGlobalAst> {
    default void translateMethods(ApsTranslator<ApsGlobalAst> translator) {
        translator.translator(
                TranslateElement.METHOD,
                next -> translator.ast().aliasMethods().forEach((name, method) -> next.postTranslate(translator.builder(), method))
        );
    }
}
