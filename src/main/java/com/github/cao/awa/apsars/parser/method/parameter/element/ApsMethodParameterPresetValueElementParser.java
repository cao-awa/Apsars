package com.github.cao.awa.apsars.parser.method.parameter.element;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.preset.ApsMethodIntegerPresetValueParser;
import com.github.cao.awa.apsars.parser.preset.ApsMethodPresetValueParser;
import com.github.cao.awa.apsars.parser.preset.ApsMethodStringPresetValueParser;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsPresetValueElementAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

import java.util.List;

public class ApsMethodParameterPresetValueElementParser extends ApsParser<ApsPresetValueElementAst> {
    private static final List<ApsMethodPresetValueParser> valueParsers = Manipulate.operation(ApricotCollectionFactor.arrayList(), parsers -> {
        parsers.add(new ApsMethodIntegerPresetValueParser());
        parsers.add(new ApsMethodStringPresetValueParser());
    });

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsPresetValueElementAst ast) {
        for (ApsMethodPresetValueParser parser : valueParsers) {
            if (parser.canTryProcess(codes())) {
                parser.parse(codes(), ast);
                break;
            }
        }
    }
}
