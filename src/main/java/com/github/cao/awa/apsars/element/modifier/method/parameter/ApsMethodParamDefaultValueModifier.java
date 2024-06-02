package com.github.cao.awa.apsars.element.modifier.method.parameter;

import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamModifierType;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsPresetValueElementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsMethodParamDefaultValueModifier extends ApsMethodParamModifier {
    @Getter
    @Setter
    private ApsPresetValueElementAst presetValueAst;

    @Override
    public ApsMethodParamModifierType type() {
        return ApsMethodParamModifierType.DEFAULT_VALUE;
    }

    @Override
    public String literal() {
        return "default";
    }

    @Override
    public boolean isLiteral() {
        return false;
    }
}
