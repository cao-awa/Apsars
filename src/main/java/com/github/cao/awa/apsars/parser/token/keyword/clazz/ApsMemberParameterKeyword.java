package com.github.cao.awa.apsars.parser.token.keyword.clazz;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsMemberParameterKeyword implements ApsKeyword {
    PUBLIC("public"),
    PROTECTED("protected"),
    PRIVATE("private"),

    STATIC("static"),

    FINAL("final"),
    VAL("val"),

    TRANSIENT("transient"),

    VOLATILE("volatile"),

    HOLDER("holder"),
    HOLDER_GET("holder-get"),
    HOLDER_SET("holder-set"),
    OVERRIDABLE("overridable")
    ;

    private final String literal;

    ApsMemberParameterKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }
}
