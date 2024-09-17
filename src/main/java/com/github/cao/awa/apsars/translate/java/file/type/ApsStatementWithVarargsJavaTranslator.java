package com.github.cao.awa.apsars.translate.java.file.type;

import com.github.cao.awa.apsars.translate.base.file.type.ApsStatementWithVarargsElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.vararg.ApsStatementWithVarargs;

public class ApsStatementWithVarargsJavaTranslator extends ApsJavaTranslator<ApsStatementWithVarargs> implements ApsStatementWithVarargsElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsStatementWithVarargs ast) {
        translateVarargs(this);
    }
}
