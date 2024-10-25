package com.github.cao.awa.apsars.element.modifier.clazz.inherit;

import com.github.cao.awa.apsars.element.clazz.inherit.ApsBinderModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.inherit.ApsBinderKeyword;
import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifier;

public abstract class ApsBinderModifier extends ElementModifier<ApsBinderModifierType> {
    public static ApsBinderModifier create(ApsBinderKeyword keyword) {
        return switch (keyword) {
            case FINAL -> new ApsBinderFinalModifier();
            default -> null;
        };
    }
}
