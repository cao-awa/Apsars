package com.github.cao.awa.apsars.element.modifier.clazz;

import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;

public class ApsClassFinalModifier extends ApsClassModifier {
    @Override
    public ApsClassModifierType type() {
        return ApsClassModifierType.IS_FINAL;
    }

    @Override
    public String literal() {
        return "final";
    }
}
