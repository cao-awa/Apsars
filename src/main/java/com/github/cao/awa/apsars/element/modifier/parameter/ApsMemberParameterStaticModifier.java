package com.github.cao.awa.apsars.element.modifier.parameter;

import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;

public class ApsMemberParameterStaticModifier extends ApsMemberParameterModifier {
    @Override
    public ApsMemberParameterModifierType type() {
        return ApsMemberParameterModifierType.IS_STATIC;
    }

    @Override
    public String literal() {
        return "static";
    }
}
