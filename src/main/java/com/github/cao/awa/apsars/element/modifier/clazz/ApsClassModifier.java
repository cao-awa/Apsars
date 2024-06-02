package com.github.cao.awa.apsars.element.modifier.clazz;

import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.parser.token.keyword.ApsClassKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMethodKeyword;

public abstract class ApsClassModifier extends ApsModifier<ApsClassModifierType> {
    public static ApsClassModifier create(ApsClassKeyword keyword) {
        return switch (keyword) {
            case PUBLIC, PROTECTED, PRIVATE -> new ApsClassAccessibleModifier(keyword);
            case FINAL -> new ApsClassFinalModifier();
            case STATIC -> new ApsClassStaticModifier();
            case CLASS -> null;
        };
    }
}
