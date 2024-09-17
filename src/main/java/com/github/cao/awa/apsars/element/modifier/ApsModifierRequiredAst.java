package com.github.cao.awa.apsars.element.modifier;

import com.github.cao.awa.apsars.element.ApsAccessibleType;

import java.util.Collection;

public interface ApsModifierRequiredAst<T extends ApsModifier<?>> {
    Collection<T> modifierValues();

    ApsAccessibleModifier accessible();

    void addModifier(T modifier);

    void addAccessible(ApsAccessibleModifier modifier);

    default void addAccessible(ApsAccessibleType type) {
        addAccessible(type.generic());
    }
}
