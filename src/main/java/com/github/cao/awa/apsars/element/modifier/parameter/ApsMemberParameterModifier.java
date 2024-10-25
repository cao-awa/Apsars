package com.github.cao.awa.apsars.element.modifier.parameter;

import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.modifier.parameter.generator.ApsMemberParameterOverridableModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.generator.ApsMethodHolderModifier;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsMemberParameterKeyword;
import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifier;

public abstract class ApsMemberParameterModifier extends ElementModifier<ApsMemberParameterModifierType> {
    public static ApsMemberParameterModifier create(ApsMemberParameterKeyword keyword) {
        return switch (keyword) {
            case FINAL, VAL -> new ApsMemberParameterFinalModifier();
            case STATIC, RIGID -> new ApsMemberParameterStaticModifier();
            case TRANSIENT -> new ApsMemberParameterTransientModifier();
            case VOLATILE -> new ApsMemberParameterVolatileModifier();
            case HOLDER -> new ApsMethodHolderModifier();
            case HOLDER_SET -> new ApsMethodHolderModifier(true, false);
            case HOLDER_GET -> new ApsMethodHolderModifier(false, true);
            case OVERRIDABLE -> new ApsMemberParameterOverridableModifier();
            default -> null;
        };
    }
}
