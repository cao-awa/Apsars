package com.github.cao.awa.apsars.translate.java.file.global;

import com.github.cao.awa.apsars.translate.base.file.global.ApsGlobalElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.global.ApsGlobalAst;

public class ApsGlobalJavaTranslator extends ApsJavaTranslator<ApsGlobalAst> implements ApsGlobalElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsGlobalAst ast) {
        builder.append("public final class ApsGlobal");
        braces(this, this::translateMethods);
    }
}
