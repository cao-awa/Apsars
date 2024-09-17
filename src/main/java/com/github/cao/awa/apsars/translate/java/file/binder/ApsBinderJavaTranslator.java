package com.github.cao.awa.apsars.translate.java.file.binder;

import com.github.cao.awa.apsars.translate.base.file.binder.ApsBinderElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;

public class ApsBinderJavaTranslator extends ApsJavaTranslator<ApsBinderAst> implements ApsBinderElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsBinderAst ast) {
        translateAccessible(this);

        builder.append("interface ");
        builder.append(ast.nameIdentity());

        braces(this, this::translateMethod);
    }
}
