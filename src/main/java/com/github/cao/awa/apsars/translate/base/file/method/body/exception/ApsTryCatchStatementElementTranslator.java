package com.github.cao.awa.apsars.translate.base.file.method.body.exception;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.ApsStatementElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.trys.ApsTryCatchAst;

public interface ApsTryCatchStatementElementTranslator extends ApsStatementElementTranslator<ApsTryCatchAst> {
    default void translateMethodBody(ApsTranslator<ApsTryCatchAst> translator) {
        translator.postTranslate(TranslateElement.METHOD_BODY, translator.ast().methodBody());
    }

    default void translateCatchList(ApsTranslator<ApsTryCatchAst> translator) {
        translator.postTranslate(TranslateElement.CATCH_LIST, translator.ast().catchList());
    }

    default void translateCatchingMethodBody(ApsTranslator<ApsTryCatchAst> translator) {
        translator.postTranslate(TranslateElement.METHOD_BODY, translator.ast().catchingMethodBody());
    }
}
