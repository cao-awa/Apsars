package com.github.cao.awa.apsars.element.statement;

import com.github.cao.awa.apsars.element.modifier.ApsModifierType;
import com.github.cao.awa.apsars.element.modifier.statement.ApsLocalVariableFinalModifier;
import com.github.cao.awa.apsars.element.modifier.statement.ApsLocalVariableModifier;
import com.github.cao.awa.apsars.element.modifier.statement.ApsLocalVariableSynchronizedModifier;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ApsLocalVariableModifierType implements ApsModifierType {
    IS_FINAL(ApsLocalVariableFinalModifier::new),
    SYNCHRONIZED(ApsLocalVariableSynchronizedModifier::new);

    @NotNull
    private final Supplier<ApsLocalVariableModifier> modifier;

    ApsLocalVariableModifierType(@NotNull Supplier<ApsLocalVariableModifier> modifier) {
        this.modifier = modifier;
    }

    public ApsLocalVariableModifier modifier() {
        return this.modifier.get();
    }
}
