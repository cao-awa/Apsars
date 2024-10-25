package com.github.cao.awa.apsars.element.modifier.method.parameter;

import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodParamKeyword;
import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifier;

public abstract class ApsMethodParamModifier extends ElementModifier<ApsMethodParamModifierType> {
    public static ApsMethodParamModifier create(ApsMethodParamKeyword keyword) {
        return switch (keyword) {
            case VAL, FINAL -> new ApsMethodParamFinalModifier();
            case DEFAULT -> new ApsMethodParamDefaultValueModifier();
        };
    }
}
