package com.github.cao.awa.apsars.element.modifier.method;

import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;

public class ApsMethodStaticModifier extends ApsMethodModifier {
    @Override
    public ApsMethodModifierType type() {
        return ApsMethodModifierType.IS_STATIC;
    }

    @Override
    public String literal() {
        return "static";
    }
}
