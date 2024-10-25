package com.github.cao.awa.apsars.translate.base.file.method.param;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;

public interface ApsMethodParameterElementTranslator extends LanguageElementTranslator<ApsMethodParamElementAst> {
    default void translateArgType(LanguageTranslator<ApsMethodParamElementAst> translator) {
        ApsMethodParamElementAst ast = translator.ast();

        if (ast == null) {
            return;
        }

        if (ast.argType() != null && ast.nameIdentity() != null) {
            translator.postTranslate(ApsarsTranslateElement.ARG_TYPE, ast.argType());
            translator.append(" ");
            translator.append(ast.nameIdentity());
        }
    }
}
