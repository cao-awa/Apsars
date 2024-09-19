package com.github.cao.awa.apsars.element.modifier.parameter.generator;

import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;

public class ApsMethodHolderModifier extends ApsMemberParameterModifier {
    private final boolean setter;
    private final boolean getter;

    public ApsMethodHolderModifier() {
        this(true, true);
    }

    public ApsMethodHolderModifier(boolean setter, boolean getter) {
        this.setter = setter;
        this.getter = getter;
    }

    public static ApsMethodHolderModifier getter() {
        return new ApsMethodHolderModifier(false, true);
    }

    public static ApsMethodHolderModifier setter() {
        return new ApsMethodHolderModifier(true, false);
    }

    @Override
    public ApsMemberParameterModifierType type() {
        if (this.getter && this.setter) {
            return ApsMemberParameterModifierType.HOLDER;
        } else {
            return this.getter ? ApsMemberParameterModifierType.HOLDER_GET : ApsMemberParameterModifierType.HOLDER_SET;
        }
    }

    @Override
    public String literal() {
        if (this.getter && this.setter) {
            return "holder|holder-set|holder-get";
        } else {
            return this.getter ? "holder-get" : "holder-set";
        }
    }

    @Override
    public boolean isLiteral() {
        return false;
    }
}
