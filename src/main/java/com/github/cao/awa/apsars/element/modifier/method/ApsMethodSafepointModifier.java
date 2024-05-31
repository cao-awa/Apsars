package com.github.cao.awa.apsars.element.modifier.method;

import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;

public class ApsMethodSafepointModifier extends ApsMethodModifier {
    @Override
    public ApsMethodModifierType type() {
        return ApsMethodModifierType.SAFEPOINT;
    }

    @Override
    public String literal() {
        return "safepoint";
    }

    @Override
    public boolean isLiteral() {
        return false;
    }
}
