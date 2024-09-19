package com.github.cao.awa.apsars.element.modifier.statement;

import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.element.statement.ApsLocalVariableModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.method.statement.ApsLocalVariableKeyword;

public abstract class ApsLocalVariableModifier extends ApsModifier<ApsLocalVariableModifierType> {
    public static ApsLocalVariableModifier create(ApsLocalVariableKeyword keyword) {
        return switch (keyword) {
            case FINAL -> new ApsLocalVariableFinalModifier();
            case SYNC, SYNCHRONIZED -> new ApsLocalVariableSynchronizedModifier();
            default -> null;
        };
    }
}
