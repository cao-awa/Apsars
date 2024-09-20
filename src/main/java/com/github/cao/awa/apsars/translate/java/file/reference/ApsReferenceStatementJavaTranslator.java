package com.github.cao.awa.apsars.translate.java.file.reference;

import com.github.cao.awa.apsars.translate.base.file.reference.ApsReferenceStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;

public class ApsReferenceStatementJavaTranslator extends ApsJavaTranslator<ApsRefReferenceAst> implements ApsReferenceStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsRefReferenceAst ast) {
        if (!ast.definingVariable() && ast.instanceReference()) {
            builder.append("this.");
        }

        builder.append(ast.nameIdentity());
        if (!ast.doNotProcess() && !ast.noDelegate() && !ast.definingVariable() && ast.type() != null && ast.type().referencePrimary() != null) {
            if (ast.type().referencePrimary().sync()) {
                builder.append(".delegate()");
            } else {
                builder.append(".delegate");
            }
        }
    }
}
