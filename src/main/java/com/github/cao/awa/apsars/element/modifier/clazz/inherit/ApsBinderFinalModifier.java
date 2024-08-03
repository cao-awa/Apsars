package com.github.cao.awa.apsars.element.modifier.clazz.inherit;

import com.github.cao.awa.apsars.element.clazz.inherit.ApsBinderModifierType;

public class ApsBinderFinalModifier extends ApsBinderModifier {
    @Override
    public ApsBinderModifierType type() {
        return ApsBinderModifierType.IS_FINAL;
    }

    @Override
    public String literal() {
        return "final";
    }
}
