package com.github.cao.awa.apsars.translate.base.file.global;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.global.ApsGlobalAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;

public interface ApsGlobalElementTranslator extends LanguageElementTranslator<ApsGlobalAst> {
    default void translateMethods(LanguageTranslator<ApsGlobalAst> translator) {
        translator.translator(
                ApsarsTranslateElement.METHOD,
                next -> translator.ast().aliasMethods().forEach((name, method) -> next.postTranslate(translator.builder(), method))
        );
    }
}
