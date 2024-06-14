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
    NULLSAFE("nullsafe")
    ;

    private final String literal;

    ApsMethodKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
