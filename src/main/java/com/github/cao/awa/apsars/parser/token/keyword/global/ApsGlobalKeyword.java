package com.github.cao.awa.apsars.parser.token.keyword.global;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsGlobalKeyword implements ApsKeyword {
    ALIAS("alias"),
    AS("as"),
    ;

    private final String literal;

    ApsGlobalKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
