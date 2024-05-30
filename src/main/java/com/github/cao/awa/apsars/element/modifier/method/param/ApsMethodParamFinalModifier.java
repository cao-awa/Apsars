package com.github.cao.awa.apsars.element.modifier.method.param;

import com.github.cao.awa.apsars.element.method.ApsMethodParamModifierType;

public class ApsMethodParamFinalModifier extends ApsMethodParamModifier {
    @Override
    public ApsMethodParamModifierType type() {
        return ApsMethodParamModifierType.IS_FINAL;
    }

    @Override
    public String literal() {
        return "final";
    }
}
