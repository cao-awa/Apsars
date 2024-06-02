package com.github.cao.awa.apsars.element.method.parameter;

import com.github.cao.awa.apsars.element.modifier.ApsModifierType;

public enum ApsMethodParamPresetValueType implements ApsModifierType {
    INT("int"),
    LONG("long"),
    FLOAT("float"),
    DOUBLE("double"),
    BOOLEAN("boolean"),
    BYTE("byte"),
    CHAR("char"),
    STRING("String"),

    NOTHING("");

    private final String literal;

    ApsMethodParamPresetValueType(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
