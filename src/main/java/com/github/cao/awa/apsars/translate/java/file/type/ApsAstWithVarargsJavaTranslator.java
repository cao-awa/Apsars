package com.github.cao.awa.apsars.translate.java.file.type;

import com.github.cao.awa.apsars.translate.base.file.type.ApsAstWithVarargsElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.vararg.ApsAstWithVarargs;

public class ApsAstWithVarargsJavaTranslator extends ApsJavaTranslator<ApsAstWithVarargs> implements ApsAstWithVarargsElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsAstWithVarargs ast) {
        translateVarargs(this);
    }
}
