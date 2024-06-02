package com.github.cao.awa.apsars.tree.method.parameter.preset;

import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamPresetValueType;
import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsPresetValueElementAst extends ApsAst {
    @Getter
    @Setter
    private ApsPresetValueAst value;
    @Getter
    @Setter
    private ApsMethodParamPresetValueType type = ApsMethodParamPresetValueType.NOTHING;

    public ApsPresetValueElementAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ value: " + this.value.generateJava());
    }

    @Override
    public String generateJava() {
        return this.value == null ? "null" : this.value.generateJava();
    }

    @Override
    public void preprocess() {
        this.value.preprocess();
    }
}
