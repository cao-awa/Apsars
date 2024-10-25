package com.github.cao.awa.apsars.element.clazz;

import com.github.cao.awa.apsars.element.modifier.parameter.*;
import com.github.cao.awa.apsars.element.modifier.parameter.generator.ApsMemberParameterOverridableModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.generator.ApsMethodHolderModifier;
import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifierType;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ApsMemberParameterModifierType implements ElementModifierType {
    IS_FINAL(ApsMemberParameterFinalModifier::new),

    IS_STATIC(ApsMemberParameterStaticModifier::new),

    TRANSIENT(ApsMemberParameterTransientModifier::new),

    VOLATILE(ApsMemberParameterVolatileModifier::new),

    HOLDER(ApsMethodHolderModifier::new),
    HOLDER_GET(ApsMethodHolderModifier::getter),
    HOLDER_SET(ApsMethodHolderModifier::setter),
    OVERRIDABLE(ApsMemberParameterOverridableModifier::new);

    @NotNull
    private final Supplier<ApsMemberParameterModifier> modifier;

    ApsMemberParameterModifierType(@NotNull Supplier<ApsMemberParameterModifier> modifier) {
        this.modifier = modifier;
    }

    public ApsMemberParameterModifier modifier() {
        return this.modifier.get();
    }
}
