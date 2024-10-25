package com.github.cao.awa.apsars.translate.base.file.clazz.member;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.ApsStatementElementTranslator;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBindingParameterAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;

public interface ApsBindingParameterElementTranslator extends ApsStatementElementTranslator<ApsBindingParameterAst> {
    default void translateAssigment(LanguageTranslator<ApsBindingParameterAst> translator) {
        if (translator.ast().value() != null) {
            translateAssigmentSymbol(translator);
            translator.postTranslate(ApsarsTranslateElement.RESULT_PRESENTING_STATEMENT, translator.ast().value());
        }
    }

    default void translateAssigmentSymbol(LanguageTranslator<ApsBindingParameterAst> translator) {
        translator.append("=");
    }
}
