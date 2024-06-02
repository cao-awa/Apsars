package com.github.cao.awa.apsars.parser.token.keyword;

public enum ApsMethodParamKeyword {
    VAL("val"),
    FINAL("final"),
    DEFAULT("default")
    ;

    private final String literal;

    ApsMethodParamKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
