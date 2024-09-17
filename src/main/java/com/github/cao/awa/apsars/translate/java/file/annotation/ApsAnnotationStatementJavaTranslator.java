package com.github.cao.awa.apsars.translate.java.file.annotation;

import com.github.cao.awa.apsars.translate.base.file.annotation.ApsAnnotationStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;

public class ApsAnnotationStatementJavaTranslator extends ApsJavaTranslator<ApsAnnotationAst> implements ApsAnnotationStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsAnnotationAst ast) {
        builder.append("@");
        builder.append(ast.nameIdentity());
    }
}
