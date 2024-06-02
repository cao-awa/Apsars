package com.github.cao.awa.apsars.element.modifier.method.parameter;

import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamModifierType;

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
