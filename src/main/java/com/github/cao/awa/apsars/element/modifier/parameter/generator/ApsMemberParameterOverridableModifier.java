package com.github.cao.awa.apsars.element.modifier.parameter.generator;

import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;

public class ApsMemberParameterOverridableModifier extends ApsMemberParameterModifier {
    @Override
    public ApsMemberParameterModifierType type() {
        return ApsMemberParameterModifierType.OVERRIDABLE;
    }

    @Override
    public String literal() {
        return "overridable";
    }

    @Override
    public boolean isLiteral() {
        return false;
    }
}
