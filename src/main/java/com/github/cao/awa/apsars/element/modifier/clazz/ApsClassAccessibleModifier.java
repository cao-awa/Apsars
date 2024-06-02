package com.github.cao.awa.apsars.element.modifier.clazz;

import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.ApsClassKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMethodKeyword;

public class ApsClassAccessibleModifier extends ApsClassModifier {
    private final ApsAccessibleType accessibleType;

    public ApsClassAccessibleModifier(ApsAccessibleType accessibleType) {
        this.accessibleType = accessibleType;
    }

    public ApsClassAccessibleModifier(ApsClassKeyword keyword) {
        this.accessibleType = switch (keyword) {
            case PUBLIC -> ApsAccessibleType.PUBLIC;
            case PROTECTED ->  ApsAccessibleType.PROTECTED;
            case PRIVATE -> ApsAccessibleType.PRIVATE;
            default -> throw new IllegalArgumentException("Unable to find accessible keyword: " + keyword.literal());
        };
    }

    @Override
    public ApsClassModifierType type() {
        return ApsClassModifierType.ACCESSIBLE;
    }

    @Override
    public String literal() {
        return this.accessibleType.literal();
    }
}