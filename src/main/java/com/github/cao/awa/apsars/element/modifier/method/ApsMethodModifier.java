package com.github.cao.awa.apsars.element.modifier.method;

import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;

public abstract class ApsMethodModifier extends ApsModifier<ApsMethodModifierType> {
    public static ApsMethodModifier create(ApsMethodKeyword keyword) {
        return switch (keyword) {
            case PUBLIC, PROTECTED, PRIVATE -> new ApsMethodAccessibleModifier(keyword);
            case FINAL -> new ApsMethodFinalModifier();
            case STATIC -> new ApsMethodStaticModifier();
            case SYNC, SYNCHRONIZED -> new ApsMethodSynchronizedModifier();
            case SAFEPOINT -> new ApsMethodSafepointModifier();
        };
    }
}
