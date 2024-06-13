package com.github.cao.awa.apsars.parser.token.keyword.method;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsMethodKeyword implements ApsKeyword {
    PUBLIC("public"),
    PROTECTED("protected"),
    PRIVATE("private"),

    STATIC("static"),

    FINAL("final"),

    SYNC("sync"),
    SYNCHRONIZED("synchronized"),

    SAFEPOINT("safepoint")
    ;

    private final String literal;

    ApsMethodKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
