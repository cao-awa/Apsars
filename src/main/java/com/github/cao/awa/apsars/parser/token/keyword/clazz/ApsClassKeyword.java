package com.github.cao.awa.apsars.parser.token.keyword.clazz;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsClassKeyword implements ApsKeyword {
    LET("let"),
    CLASS("class"),

    OPEN("public"),
    PUB("pub"),
    PUBLIC("public"),
    PROTECTED("protected"),
    PVT("pvt"),
    PRIVATE("private"),

    RIGID("rigid"),
    STATIC("static"),

    FINAL("final"),
    ;

    private final String literal;

    ApsClassKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
