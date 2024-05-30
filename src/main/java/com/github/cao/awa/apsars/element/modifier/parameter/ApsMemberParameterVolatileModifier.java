package com.github.cao.awa.apsars.element.modifier.parameter;

import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;

public class ApsMemberParameterVolatileModifier extends ApsMemberParameterModifier {
    @Override
    public ApsMemberParameterModifierType type() {
        return ApsMemberParameterModifierType.VOLATILE;
    }

    @Override
    public String literal() {
        return "volatile";
    }
}
