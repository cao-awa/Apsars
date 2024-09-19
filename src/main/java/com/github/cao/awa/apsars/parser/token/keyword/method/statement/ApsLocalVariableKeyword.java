package com.github.cao.awa.apsars.parser.token.keyword.method.statement;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsLocalVariableKeyword implements ApsKeyword {
    FINAL("final"),
    SYNC("sync"),
    SYNCHRONIZED("synchronized");

    private final String literal;

    ApsLocalVariableKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
