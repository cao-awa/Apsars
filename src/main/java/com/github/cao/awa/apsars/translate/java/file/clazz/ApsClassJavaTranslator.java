package com.github.cao.awa.apsars.translate.java.file.clazz;

import com.github.cao.awa.apsars.translate.base.file.clazz.ApsClassElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;

public class ApsClassJavaTranslator extends ApsJavaTranslator<ApsClassAst> implements ApsClassElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsClassAst ast) {
        translateAnnotations(this);

        translateAccessible(this);

        splitModifiersBySpace(this);

        builder.append("class ");
        builder.append(ast.nameIdentity());
        if (!ast.binders().isEmpty()) {
            builder.append(" implements ");
            int edge = ast.binders().size() - 1;
            int index = 0;
            for (ApsBinderAst binder : ast.binders()) {
                builder.append(binder.nameIdentity());
                if (index != edge) {
                    builder.append(",");
                }
                index++;
            }
        }

        braces(this, this::translateClassBody);
    }
}
