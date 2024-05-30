package com.github.cao.awa.apsars.element.modifier;

import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;

public abstract class ApsModifier<T extends ApsModifierType> {
    public abstract T type();
    public abstract String literal();
    public boolean isLiteral() {
        return true;
    }
}
