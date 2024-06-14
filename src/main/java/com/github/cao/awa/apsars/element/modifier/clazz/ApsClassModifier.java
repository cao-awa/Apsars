package com.github.cao.awa.apsars.element.modifier.clazz;

import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsClassKeyword;

public abstract class ApsClassModifier extends ApsModifier<ApsClassModifierType> {
    public static ApsClassModifier create(ApsClassKeyword keyword) {
        return switch (keyword) {
            case PUBLIC, OPEN, PUB, PROTECTED, PRIVATE, PVT -> new ApsClassAccessibleModifier(keyword);
            case FINAL -> new ApsClassFinalModifier();
            case STATIC, RIGID -> new ApsClassStaticModifier();
            default -> null;
        };
    }
}
