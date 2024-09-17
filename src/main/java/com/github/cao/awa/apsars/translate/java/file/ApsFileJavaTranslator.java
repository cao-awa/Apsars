package com.github.cao.awa.apsars.translate.java.file;

import com.github.cao.awa.apsars.translate.base.file.ApsFileElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;

public class ApsFileJavaTranslator extends ApsJavaTranslator<ApsFileAst> implements ApsFileElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsFileAst ast) {
        translateEach(this);
    }
}
