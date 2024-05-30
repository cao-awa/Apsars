package com.github.cao.awa.apsars.parser.token.keyword;

public enum ApsMemberParameterKeyword {
    PUBLIC("public"),
    PROTECTED("protected"),
    PRIVATE("private"),

    STATIC("static"),

    FINAL("final"),

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
