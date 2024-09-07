package com.github.cao.awa.apsars.element;

import com.github.cao.awa.apsars.element.modifier.accessible.GenericAccessibleModifier;

public enum ApsAccessibleType {
    PUBLIC("public"),
    PROTECTED("protected"),
    PRIVATE("private");

    private final String literal;

    ApsAccessibleType(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }

    public GenericAccessibleModifier generic() {
        return new GenericAccessibleModifier(this);
    }
}
