package com.github.cao.awa.apsars.parser.token.keyword;

public enum ApsFileKeyword {
    IMPORT("import"),

    CLASS("class")
    ;

    private final String literal;

    ApsFileKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
