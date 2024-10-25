package com.github.cao.awa.apsars.element.method.parameter;

import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifierType;

public enum ApsMethodParamPresetValueType implements ElementModifierType {
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
