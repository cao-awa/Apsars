package com.github.cao.awa.apsars.element.modifier.accessible;

import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.modifier.ApsAccessibleModifier;
import com.github.cao.awa.apsars.parser.token.ApsTokens;

public class GenericAccessibleModifier implements ApsAccessibleModifier {
    private final ApsAccessibleType accessibleType;

    public GenericAccessibleModifier(ApsAccessibleType accessibleType) {
        this.accessibleType = accessibleType;
    }

    public GenericAccessibleModifier(String keyword) {
        this.accessibleType = switch (keyword) {
            case ApsTokens.PUBLIC, ApsTokens.PUBLIC_OPEN, ApsTokens.PUBLIC_PUB -> ApsAccessibleType.PUBLIC;
            case ApsTokens.PROTECTED -> ApsAccessibleType.PROTECTED;
            case ApsTokens.PRIVATE, ApsTokens.PRIVATE_PVT -> ApsAccessibleType.PRIVATE;
            default -> throw new IllegalArgumentException("Unable to find accessible keyword: " + keyword);
        };
    }

    @Override
    public ApsAccessibleType getAccessibleType() {
        return this.accessibleType;
    }
}
