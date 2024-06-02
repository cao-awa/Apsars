package com.github.cao.awa.apsars.element.modifier.parameter;

import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.generator.ApsMemberParameterOverridableModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.generator.ApsMethodHolderModifier;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMemberParameterKeyword;

public abstract class ApsMemberParameterModifier extends ApsModifier<ApsMemberParameterModifierType> {
    public static ApsMemberParameterModifier create(ApsMemberParameterKeyword keyword) {
        return switch (keyword) {
            case PUBLIC, PROTECTED, PRIVATE -> new ApsMemberParameterAccessibleModifier(keyword);
            case FINAL, VAL -> new ApsMemberParameterFinalModifier();
            case STATIC -> new ApsMemberParameterStaticModifier();
            case TRANSIENT -> new ApsMemberParameterTransientModifier();
            case VOLATILE -> new ApsMemberParameterVolatileModifier();
            case HOLDER -> new ApsMethodHolderModifier();
            case HOLDER_SET -> new ApsMethodHolderModifier(true, false);
            case HOLDER_GET -> new ApsMethodHolderModifier(false, true);
            case OVERRIDABLE -> new ApsMemberParameterOverridableModifier();
        };
    }
}
