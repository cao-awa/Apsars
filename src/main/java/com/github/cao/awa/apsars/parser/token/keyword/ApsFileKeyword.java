package com.github.cao.awa.apsars.parser.token.keyword;

public enum ApsFileKeyword implements ApsKeyword {
    IMPORT("import"),

    CLASS("class"),
    GLOBAL("global"),

    BIND("bind")
    ;

    private final String literal;

    ApsFileKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
