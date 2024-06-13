package com.github.cao.awa.apsars.element.modifier.parameter;

import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsMemberParameterKeyword;

public class ApsMemberParameterAccessibleModifier extends ApsMemberParameterModifier {
    private final ApsAccessibleType accessibleType;

    public ApsMemberParameterAccessibleModifier(ApsAccessibleType accessibleType) {
        this.accessibleType = accessibleType;
    }

    public ApsMemberParameterAccessibleModifier(ApsMemberParameterKeyword keyword) {
        this.accessibleType = switch (keyword) {
            case PUBLIC -> ApsAccessibleType.PUBLIC;
            case PROTECTED ->  ApsAccessibleType.PROTECTED;
            case PRIVATE -> ApsAccessibleType.PRIVATE;
            default -> throw new IllegalArgumentException("Unable to find accessible keyword: " + keyword.literal());
        };
    }

    @Override
    public ApsMemberParameterModifierType type() {
        return ApsMemberParameterModifierType.ACCESSIBLE;
    }

    @Override
    public String literal() {
        return this.accessibleType.literal();
    }
}
