package com.github.cao.awa.apsars.element.modifier.method;

import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;

public class ApsMethodFinalModifier extends ApsMethodModifier {
    @Override
    public ApsMethodModifierType type() {
        return ApsMethodModifierType.IS_FINAL;
    }

    @Override
    public String literal() {
        return "final";
    }
}
