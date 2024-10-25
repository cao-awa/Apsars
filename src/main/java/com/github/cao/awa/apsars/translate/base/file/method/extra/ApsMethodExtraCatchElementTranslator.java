package com.github.cao.awa.apsars.translate.base.file.method.extra;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.statement.trys.ApsMethodExtraCatchAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;

public interface ApsMethodExtraCatchElementTranslator extends LanguageElementTranslator<ApsMethodExtraCatchAst> {
    default void translateMethodBody(LanguageTranslator<ApsMethodExtraCatchAst> translator) {
        translator.postTranslate(ApsarsTranslateElement.METHOD_BODY, translator.ast().methodBody());
    }

    default void translateCatchList(LanguageTranslator<ApsMethodExtraCatchAst> translator) {
        translator.postTranslate(ApsarsTranslateElement.CATCH_LIST, translator.ast().catchList());
    }

    default void translateCatchingMethodBody(LanguageTranslator<ApsMethodExtraCatchAst> translator) {
        translator.postTranslate(ApsarsTranslateElement.METHOD_BODY, translator.ast().catchingMethodBody());
    }
}
