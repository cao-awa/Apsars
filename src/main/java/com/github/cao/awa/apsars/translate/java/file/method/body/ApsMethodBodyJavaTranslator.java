package com.github.cao.awa.apsars.translate.java.file.method.body;

import com.github.cao.awa.apsars.translate.base.file.method.body.ApsMethodBodyElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;

public class ApsMethodBodyJavaTranslator extends ApsJavaTranslator<ApsMethodBodyAst> implements ApsMethodBodyElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsMethodBodyAst ast) {
        translateStatements(this);
    }
}
