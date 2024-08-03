package com.github.cao.awa.apsars.element.modifier.clazz.inherit;

import com.github.cao.awa.apsars.element.clazz.inherit.ApsBinderModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.inherit.ApsBinderKeyword;

public abstract class ApsBinderModifier extends ApsModifier<ApsBinderModifierType> {
    public static ApsBinderModifier create(ApsBinderKeyword keyword) {
        return switch (keyword) {
            case FINAL -> new ApsBinderFinalModifier();
            default -> null;
        };
    }
}
