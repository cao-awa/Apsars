package com.github.cao.awa.apsars.element.modifier.method;

import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifier;

public abstract class ApsMethodModifier extends ElementModifier<ApsMethodModifierType> {
    public static ApsMethodModifier create(ApsMethodKeyword keyword) {
        return switch (keyword) {
            case FINAL -> new ApsMethodFinalModifier();
            case STATIC, RIGID -> new ApsMethodStaticModifier();
            case SYNC, SYNCHRONIZED -> new ApsMethodSynchronizedModifier();
            case SAFEPOINT -> new ApsMethodSafepointModifier();
            case NULLSAFE, NILSAFE, SAFE_NIL -> new ApsMethodNullsafeModifier();
            default -> null;
        };
    }
}
