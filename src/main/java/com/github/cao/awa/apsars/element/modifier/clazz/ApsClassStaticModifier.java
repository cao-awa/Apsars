package com.github.cao.awa.apsars.element.modifier.clazz;

import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;

public class ApsClassStaticModifier extends ApsClassModifier {
    @Override
    public ApsClassModifierType type() {
        return ApsClassModifierType.IS_STATIC;
    }

    @Override
    public String literal() {
        return "static";
    }
}
