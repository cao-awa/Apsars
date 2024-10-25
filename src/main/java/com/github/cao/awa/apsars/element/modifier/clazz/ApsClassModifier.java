package com.github.cao.awa.apsars.element.modifier.clazz;

import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsClassKeyword;
import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifier;

public abstract class ApsClassModifier extends ElementModifier<ApsClassModifierType> {
    public static ApsClassModifier create(ApsClassKeyword keyword) {
        return switch (keyword) {
            case FINAL, UNIQUE -> new ApsClassFinalModifier();
            case STATIC, RIGID -> new ApsClassStaticModifier();
            default -> null;
        };
    }
}
