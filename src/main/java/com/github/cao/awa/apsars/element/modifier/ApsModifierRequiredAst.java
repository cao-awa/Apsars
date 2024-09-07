package com.github.cao.awa.apsars.element.modifier;

import com.github.cao.awa.apsars.element.ApsAccessibleType;

public interface ApsModifierRequiredAst<T extends ApsModifier<?>> {
    void addModifier(T modifier);

    void addAccessible(ApsAccessibleModifier modifier);

    default void addAccessible(ApsAccessibleType type) {
        addAccessible(type.generic());
    }
}
