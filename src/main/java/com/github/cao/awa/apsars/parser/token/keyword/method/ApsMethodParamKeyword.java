package com.github.cao.awa.apsars.parser.token.keyword.method;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsMethodParamKeyword implements ApsKeyword {
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
