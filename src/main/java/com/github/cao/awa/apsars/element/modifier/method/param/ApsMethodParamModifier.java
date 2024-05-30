package com.github.cao.awa.apsars.element.modifier.method.param;

import com.github.cao.awa.apsars.element.method.ApsMethodParamModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMethodParamKeyword;

public abstract class ApsMethodParamModifier {
    public abstract ApsMethodParamModifierType type();
    public abstract String literal();

    public static ApsMethodParamModifier create(ApsMethodParamKeyword keyword) {
        return switch (keyword) {
            case FINAL, FINAL_JAVA -> new ApsMethodParamFinalModifier();
        };
    }
}
