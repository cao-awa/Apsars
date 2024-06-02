package com.github.cao.awa.apsars.parser.preset;

import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamPresetValueType;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsPresetValueElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.string.ApsStringPresetValueAst;

public class ApsMethodStringPresetValueParser extends ApsMethodPresetValueParser {
    @Override
    public boolean canTryProcess(String codes) {
        return codes.startsWith("\"") && codes.endsWith("\"");
    }

    @Override
    public void parse(ApsPresetValueElementAst ast) {
        substring(1, codes().length() - 1);
        ApsStringPresetValueAst stringAst = new ApsStringPresetValueAst(ast);
        stringAst.value(codes());
        ast.value(stringAst);
        ast.type(ApsMethodParamPresetValueType.STRING);
    }
}
