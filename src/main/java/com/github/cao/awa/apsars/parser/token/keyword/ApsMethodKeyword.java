package com.github.cao.awa.apsars.parser.token.keyword;

public enum ApsMethodKeyword {
    PUBLIC("public"),
    PROTECTED("protected"),
    PRIVATE("private"),

    STATIC("static"),

    FINAL("final"),

    SYNC("sync"),
    SYNCHRONIZED("synchronized"),
    ;

    private final String literal;

    ApsMethodKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
