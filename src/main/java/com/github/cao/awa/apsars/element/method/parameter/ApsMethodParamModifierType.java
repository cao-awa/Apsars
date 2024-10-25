package com.github.cao.awa.apsars.element.method.parameter;

import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamDefaultValueModifier;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamFinalModifier;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamModifier;
import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifierType;

import java.util.function.Supplier;

public enum ApsMethodParamModifierType implements ElementModifierType {
    IS_FINAL(ApsMethodParamFinalModifier::new),
    DEFAULT_VALUE(ApsMethodParamDefaultValueModifier::new);

    private final Supplier<ApsMethodParamModifier> modifier;

    ApsMethodParamModifierType(Supplier<ApsMethodParamModifier> modifier) {
        this.modifier = modifier;
    }

    public ApsMethodParamModifier modifier() {
        return this.modifier.get();
    }
}
