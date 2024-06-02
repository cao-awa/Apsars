package com.github.cao.awa.apsars.parser.preset;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamPresetValueType;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsPresetValueElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.numer.ApsIntegerPresetValueAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.string.ApsStringPresetValueAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

import java.util.List;

public class ApsMethodIntegerPresetValueParser extends ApsMethodPresetValueParser {
    private static final List<String> numbers = """
            0
            1
            2
            3
            4
            5
            6
            7
            8
            9
            """.lines().toList();

    @Override
    public boolean canTryProcess(String codes) {
        int index = 0;
        int codesLength = codes.length();
        int edge = codesLength - 1;
        int matchedCount = 0;
        while (matchedCount < codesLength) {
            String charAt = codes.substring(index, ++index);
            if (numbers.contains(charAt)) {
                matchedCount++;
            } else {
                if (index == edge) {
                    if (charAt.equals("i") || charAt.equals("I")) {
                        break;
                    }
                }
                return false;
            }

            if (index >= edge) {
                break;
            }
        }
        return true;
    }

    @Override
    public void parse(ApsPresetValueElementAst ast) {
        if (codes().endsWith("i") || codes().endsWith("I")) {
            replaceCodes("i", "");
            replaceCodes("I", "");
        }
        ApsIntegerPresetValueAst integerAst = new ApsIntegerPresetValueAst(ast);
        integerAst.value(Integer.parseInt(codes()));
        ast.value(integerAst);
        ast.type(ApsMethodParamPresetValueType.INT);
    }
}
