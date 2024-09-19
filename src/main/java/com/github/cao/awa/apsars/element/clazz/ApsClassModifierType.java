package com.github.cao.awa.apsars.element.clazz;

import com.github.cao.awa.apsars.element.modifier.ApsModifierType;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassFinalModifier;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassModifier;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassStaticModifier;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ApsClassModifierType implements ApsModifierType {
    IS_FINAL(ApsClassFinalModifier::new),

    IS_STATIC(ApsClassStaticModifier::new);


    @NotNull
    private final Supplier<ApsClassModifier> modifier;

    ApsClassModifierType(@NotNull java.util.function.Supplier<ApsClassModifier> modifier) {
        this.modifier = modifier;
    }

    public ApsClassModifier modifier() {
        return this.modifier.get();
    }
}
