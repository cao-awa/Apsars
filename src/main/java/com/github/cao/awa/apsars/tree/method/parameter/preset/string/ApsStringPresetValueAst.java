package com.github.cao.awa.apsars.tree.method.parameter.preset.string;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsPresetValueAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsStringPresetValueAst extends ApsPresetValueAst {
    @Getter
    @Setter
    private String value;

    public ApsStringPresetValueAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {

    }

    @Override
    public void generateJava(StringBuilder builder) {
        builder.append("\"")
                .append(this.value)
                .append("\"");
    }

    @Override
    public void preprocess() {

    }
}
