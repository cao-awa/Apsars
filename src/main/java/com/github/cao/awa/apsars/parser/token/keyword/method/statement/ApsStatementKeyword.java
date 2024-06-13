package com.github.cao.awa.apsars.parser.token.keyword.method.statement;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsStatementKeyword implements ApsKeyword {
    TRY("try"),
    CATCH("catch"),
    FINAL("final")
    ;

    private final String literal;

    ApsStatementKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
