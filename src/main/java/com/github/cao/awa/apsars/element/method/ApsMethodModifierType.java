package com.github.cao.awa.apsars.element.method;

import com.github.cao.awa.apsars.element.modifier.method.*;
import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifierType;

import java.util.function.Supplier;

public enum ApsMethodModifierType implements ElementModifierType {
    IS_FINAL(ApsMethodFinalModifier::new),

    IS_STATIC(ApsMethodStaticModifier::new),

    SYNCHRONIZED(ApsMethodSynchronizedModifier::new),

    SAFEPOINT(ApsMethodSafepointModifier::new),

    NULLSAFE(ApsMethodNullsafeModifier::new);

    private final Supplier<ApsMethodModifier> modifier;

    ApsMethodModifierType(Supplier<ApsMethodModifier> modifier) {
        this.modifier = modifier;
    }

    public ApsMethodModifier modifier() {
        if (this.modifier != null) {
            return this.modifier.get();
        }
        return null;
    }
}
