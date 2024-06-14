package com.github.cao.awa.apsars.element.modifier.method;

import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;

public class ApsMethodAccessibleModifier extends ApsMethodModifier {
    private final ApsAccessibleType accessibleType;

    public ApsMethodAccessibleModifier(ApsAccessibleType accessibleType) {
        this.accessibleType = accessibleType;
    }

    public ApsMethodAccessibleModifier(ApsMethodKeyword keyword) {
        this.accessibleType = switch (keyword) {
            case PUBLIC, OPEN, PUB -> ApsAccessibleType.PUBLIC;
            case PROTECTED ->  ApsAccessibleType.PROTECTED;
            case PRIVATE, PVT -> ApsAccessibleType.PRIVATE;
            default -> throw new IllegalArgumentException("Unable to find accessible keyword: " + keyword.literal());
        };
    }

    @Override
    public ApsMethodModifierType type() {
        return ApsMethodModifierType.ACCESSIBLE;
    }

    @Override
    public String literal() {
        return this.accessibleType.literal();
    }
}
