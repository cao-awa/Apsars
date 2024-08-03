package com.github.cao.awa.apsars.parser.token.keyword.clazz.inherit;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsBinderKeyword implements ApsKeyword {
    BINDER("bind"),

    FINAL("final"),
    VIRTUAL("virtual");

    private final String literal;

    ApsBinderKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
