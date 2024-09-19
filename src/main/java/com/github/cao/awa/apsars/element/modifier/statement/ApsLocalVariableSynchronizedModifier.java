package com.github.cao.awa.apsars.element.modifier.statement;

import com.github.cao.awa.apsars.element.statement.ApsLocalVariableModifierType;

public class ApsLocalVariableSynchronizedModifier extends ApsLocalVariableModifier {
    @Override
    public ApsLocalVariableModifierType type() {
        return ApsLocalVariableModifierType.SYNCHRONIZED;
    }

    @Override
    public String literal() {
        return "synchronized";
    }
}
