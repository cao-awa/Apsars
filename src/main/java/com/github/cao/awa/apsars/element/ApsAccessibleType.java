package com.github.cao.awa.apsars.element;

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
}
