package com.github.cao.awa.apsars.parser.token.keyword.method;

import com.github.cao.awa.apsars.element.modifier.method.*;
import com.github.cao.awa.apsars.parser.token.keyword.ApsKeyword;

import java.util.function.Supplier;

public enum ApsMethodKeyword implements ApsKeyword {
    OPEN("public", null),
    PUB("pub", null),
    PUBLIC("public", null),
    PROTECTED("protected", null),
    PVT("pvt", null),
    PRIVATE("private", null),

    RIGID("rigid", ApsMethodStaticModifier::new),
    STATIC("static", ApsMethodStaticModifier::new),

    FINAL("final", ApsMethodFinalModifier::new),

    SYNC("sync", ApsMethodSynchronizedModifier::new),
    SYNCHRONIZED("synchronized", ApsMethodSynchronizedModifier::new),

    SAFEPOINT("safepoint", ApsMethodSafepointModifier::new),

    NILSAFE("nilsafe", ApsMethodNullsafeModifier::new),
    SAFE_NIL("s-nil", ApsMethodNullsafeModifier::new),
    NULLSAFE("nullsafe", ApsMethodNullsafeModifier::new),
    ;

    private final String literal;
    private final Supplier<ApsMethodModifier> modifier;

    ApsMethodKeyword(String literal, Supplier<ApsMethodModifier> modifier) {
        this.literal = literal;
        this.modifier = modifier;
    }

    public String literal() {
        return this.literal;
    }

    public ApsMethodModifier modifier() {
        if (this.modifier != null) {
            return this.modifier.get();
        }
        return null;
    }

    public static ApsMethodKeyword of(String literal) {
        for (ApsMethodKeyword value : values()) {
            if (value.literal.equals(literal)) {
                return value;
            }
        }

        return ApsMethodKeyword.valueOf(literal);
    }

    public static ApsMethodKeyword ofNullable(String literal) {
        for (ApsMethodKeyword value : values()) {
            if (value.literal.equals(literal)) {
                return value;
            }
        }

        return null;
    }
}
