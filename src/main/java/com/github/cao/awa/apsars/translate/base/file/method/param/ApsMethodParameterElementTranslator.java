package com.github.cao.awa.apsars.translate.base.file.method.param;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;

public interface ApsMethodParameterElementTranslator extends ApsElementTranslator<ApsMethodParamElementAst> {
    default void translateArgType(ApsTranslator<ApsMethodParamElementAst> translator) {
        ApsMethodParamElementAst ast = translator.ast();

        if (ast == null) {
            return;
        }

        if (ast.argType() != null && ast.nameIdentity() != null) {
            translator.postTranslate(TranslateElement.ARG_TYPE, ast.argType());
            translator.append(" ");
            translator.append(ast.nameIdentity());
        }
    }
}
