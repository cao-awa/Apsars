package com.github.cao.awa.apsars.translate.java.file.method.extra;

import com.github.cao.awa.apsars.translate.base.file.method.extra.ApsMethodExtraCatchElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.trys.ApsMethodExtraCatchAst;

public class ApsMethodExtraCatchJavaTranslator extends ApsJavaTranslator<ApsMethodExtraCatchAst> implements ApsMethodExtraCatchElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsMethodExtraCatchAst ast) {
        builder.append("try");
        braces(this, this::translateMethodBody);
        builder.append("catch");
        paren(this, this::translateCatchList);
        braces(this, this::translateCatchingMethodBody);
    }
}
