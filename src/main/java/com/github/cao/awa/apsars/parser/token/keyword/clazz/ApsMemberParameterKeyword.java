package com.github.cao.awa.apsars.parser.token.keyword.clazz;

import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

public enum ApsMemberParameterKeyword implements ApsKeyword {
    OPEN("public"),
    PUB("pub"),
    PUBLIC("public"),
    PROTECTED("protected"),
    PVT("pvt"),
    PRIVATE("private"),

    RIGID("rigid"),
    STATIC("static"),

    FINAL("final"),
    VAL("val"),

    TRANSIENT("transient"),

    VOLATILE("volatile"),

    HOLDER("holder"),
    HOLDER_GET("holder-get"),
    HOLDER_SET("holder-set"),
    OVERRIDABLE("overridable"),

    AS("as")
    ;

    private final String literal;

    ApsMemberParameterKeyword(String literal) {
        this.literal = literal;
    }

    public String literal() {
        return this.literal;
    }

    public static ApsMemberParameterKeyword ofNullable(String literal) {
        for (ApsMemberParameterKeyword keyword : values()) {
            if (keyword.literal().equals(literal)) {
                return keyword;
            }
        }

        return null;
    }
}
