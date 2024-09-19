package com.github.cao.awa.apsars.parser.token.keyword.method;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsMethodKeyword implements ApsKeyword {
    OPEN("public"),
    PUB("pub"),
    PUBLIC("public"),
    PROTECTED("protected"),
    PVT("pvt"),
    PRIVATE("private"),

    RIGID("rigid"),
    STATIC("static"),

    FINAL("final"),

    SYNC("sync"),
    SYNCHRONIZED("synchronized"),

    SAFEPOINT("safepoint"),

    NILSAFE("nilsafe"),
    SAFE_NIL("s-nil"),
    NULLSAFE("nullsafe");

    private final String literal;

    ApsMethodKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }

    public static ApsMethodKeyword of(String literal) {
        for (ApsMethodKeyword value : values()) {
            if (value.literal.equals(literal)) {
                return value;
            }
        }

        return ApsMethodKeyword.valueOf(literal);
    }

    public static ApsMethodKeyword ofNullable(String literal) {
        for (ApsMethodKeyword value : values()) {
            if (value.literal.equals(literal)) {
                return value;
            }
        }

        return null;
    }
}
