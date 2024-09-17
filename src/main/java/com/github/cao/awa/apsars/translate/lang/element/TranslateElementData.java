package com.github.cao.awa.apsars.translate.lang.element;

import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class TranslateElementData<T extends ApsAst> {
    private final Class<T> clazz;
    @Getter
    private final TranslateElementEnum elementType;

    public TranslateElementData(final Class<T> clazz, final TranslateElementEnum elementType) {
        this.clazz = clazz;
        this.elementType = elementType;
    }
}
