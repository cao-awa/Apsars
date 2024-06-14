package com.github.cao.awa.apsars.element.modifier.method;

import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;

public class ApsMethodNullsafeModifier extends ApsMethodModifier {
    @Override
    public ApsMethodModifierType type() {
        return ApsMethodModifierType.NULLSAFE;
    }

    @Override
    public String literal() {
        return "nullsafe";
    }

    @Override
    public boolean isLiteral() {
        return false;
    }
}
