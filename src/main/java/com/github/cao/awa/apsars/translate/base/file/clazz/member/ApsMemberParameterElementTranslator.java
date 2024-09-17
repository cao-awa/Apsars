package com.github.cao.awa.apsars.translate.base.file.clazz.member;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.ApsStatementElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;

public interface ApsMemberParameterElementTranslator extends ApsStatementElementTranslator<ApsMemberParameterAst> {
    default void translateAssigment(ApsTranslator<ApsMemberParameterAst> translator) {
        if (translator.ast().value() != null) {
            translateAssigmentSymbol(translator);
            translator.postTranslate(TranslateElement.RESULT_PRESENTING_STATEMENT, translator.ast().value());
        }
    }

    default void translateAssigmentSymbol(ApsTranslator<ApsMemberParameterAst> translator) {
        translator.append("=");
    }
}
