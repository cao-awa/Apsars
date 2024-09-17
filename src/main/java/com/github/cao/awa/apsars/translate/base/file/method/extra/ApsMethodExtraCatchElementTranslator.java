package com.github.cao.awa.apsars.translate.base.file.method.extra;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.trys.ApsMethodExtraCatchAst;

public interface ApsMethodExtraCatchElementTranslator extends ApsElementTranslator<ApsMethodExtraCatchAst> {
    default void translateMethodBody(ApsTranslator<ApsMethodExtraCatchAst> translator) {
        translator.postTranslate(TranslateElement.METHOD_BODY, translator.ast().methodBody());
    }

    default void translateCatchList(ApsTranslator<ApsMethodExtraCatchAst> translator) {
        translator.postTranslate(TranslateElement.CATCH_LIST, translator.ast().catchList());
    }

    default void translateCatchingMethodBody(ApsTranslator<ApsMethodExtraCatchAst> translator) {
        translator.postTranslate(TranslateElement.METHOD_BODY, translator.ast().catchingMethodBody());
    }
}
