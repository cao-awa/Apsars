package com.github.cao.awa.apsars.element.modifier.method;

import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;

public class ApsMethodSynchronizedModifier extends ApsMethodModifier {
    @Override
    public ApsMethodModifierType type() {
        return ApsMethodModifierType.SYNCHRONIZED;
    }

    @Override
    public String literal() {
        return "synchronized";
    }
}
