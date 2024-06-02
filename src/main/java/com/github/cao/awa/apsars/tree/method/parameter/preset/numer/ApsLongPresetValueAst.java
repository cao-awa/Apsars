package com.github.cao.awa.apsars.tree.method.parameter.preset.numer;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsPresetValueAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsLongPresetValueAst extends ApsPresetValueAst {
    @Getter
    @Setter
    private long value;

    public ApsLongPresetValueAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {

    }

    @Override
    public String generateJava() {
        return this.value + "L";
    }

    @Override
    public void preprocess() {

    }
}
