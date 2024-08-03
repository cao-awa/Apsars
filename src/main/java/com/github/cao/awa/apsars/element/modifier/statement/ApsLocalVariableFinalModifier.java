package com.github.cao.awa.apsars.element.modifier.statement;

import com.github.cao.awa.apsars.element.statement.ApsLocalVariableModifierType;

public class ApsLocalVariableFinalModifier extends ApsLocalVariableModifier {
    @Override
    public ApsLocalVariableModifierType type() {
        return ApsLocalVariableModifierType.IS_FINAL;
    }

    @Override
    public String literal() {
        return "final";
    }
}
