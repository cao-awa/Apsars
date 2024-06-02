package com.github.cao.awa.apsars.element.modifier.method.parameter;

import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMethodParamKeyword;

public abstract class ApsMethodParamModifier extends ApsModifier<ApsMethodParamModifierType> {
    public static ApsMethodParamModifier create(ApsMethodParamKeyword keyword) {
        return switch (keyword) {
            case VAL, FINAL -> new ApsMethodParamFinalModifier();
            case DEFAULT -> new ApsMethodParamDefaultValueModifier();
        };
    }
}
