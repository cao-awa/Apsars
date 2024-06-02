package com.github.cao.awa.apsars.parser.token.keyword;

public enum ApsClassKeyword {
    CLASS("class"),

    PUBLIC("public"),
    PROTECTED("protected"),
    PRIVATE("private"),

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
