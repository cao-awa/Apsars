package com.github.cao.awa.apsars.translate.base.file.method.body.exception;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.ApsStatementElementTranslator;
import com.github.cao.awa.apsars.tree.statement.trys.ApsTryCatchAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;

public interface ApsTryCatchStatementElementTranslator extends ApsStatementElementTranslator<ApsTryCatchAst> {
    default void translateMethodBody(LanguageTranslator<ApsTryCatchAst> translator) {
        translator.postTranslate(ApsarsTranslateElement.METHOD_BODY, translator.ast().methodBody());
    }

    default void translateCatchList(LanguageTranslator<ApsTryCatchAst> translator) {
        translator.postTranslate(ApsarsTranslateElement.CATCH_LIST, translator.ast().catchList());
    }

    default void translateCatchingMethodBody(LanguageTranslator<ApsTryCatchAst> translator) {
        translator.postTranslate(ApsarsTranslateElement.METHOD_BODY, translator.ast().catchingMethodBody());
    }
}
