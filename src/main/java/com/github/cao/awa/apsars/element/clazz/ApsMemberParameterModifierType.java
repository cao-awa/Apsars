package com.github.cao.awa.apsars.element.clazz;

import com.github.cao.awa.apsars.element.modifier.ApsModifierType;

public enum ApsMemberParameterModifierType implements ApsModifierType {
    IS_FINAL,

    IS_STATIC,

    TRANSIENT,

    VOLATILE,

    HOLDER,
    HOLDER_GET,
    HOLDER_SET,
    OVERRIDABLE,
}
