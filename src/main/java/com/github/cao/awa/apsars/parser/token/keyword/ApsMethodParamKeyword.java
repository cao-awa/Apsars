package com.github.cao.awa.apsars.parser.token.keyword;

public enum ApsMethodParamKeyword {
    FINAL("val"),
    FINAL_JAVA("final"),
    ;

    private final String literal;

    ApsMethodParamKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
