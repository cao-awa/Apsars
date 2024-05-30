package com.github.cao.awa.apsars.element.modifier.parameter;

import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;

public class ApsMemberParameterFinalModifier extends ApsMemberParameterModifier {
    @Override
    public ApsMemberParameterModifierType type() {
        return ApsMemberParameterModifierType.IS_FINAL;
    }

    @Override
    public String literal() {
        return "final";
    }
}
