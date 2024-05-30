package com.github.cao.awa.apsars.element.modifier.parameter;

import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;

public class ApsMemberParameterTransientModifier extends ApsMemberParameterModifier {
    @Override
    public ApsMemberParameterModifierType type() {
        return ApsMemberParameterModifierType.TRANSIENT;
    }

    @Override
    public String literal() {
        return "transient";
    }
}
