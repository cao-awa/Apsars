package com.github.cao.awa.apsars.translate.java.file.method;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.file.method.ApsMethodElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;

import java.util.function.Consumer;

public class ApsMethodJavaTranslator extends ApsJavaTranslator<ApsMethodAst> implements ApsMethodElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsMethodAst ast) {
        if (!ast.annotations().isEmpty()) {
            translator(TranslateElement.ANNOTATION, next -> {
                for (ApsAnnotationAst annotationAst : ast.annotations().values()) {
                    next.postTranslate(builder, annotationAst);
                    builder.append(" ");
                }
            });
        }

        if (!ast.isBinder()) {
            translateAccessible(this);

            splitModifiersBySpace(this);
        }

        if (ast.isBinder() && !ast.isVirtual()) {
            builder.append("default ");
        }

        if (ast.returnType() == null) {
            builder.append("void");
        } else {
            postTranslate(TranslateElement.ARG_TYPE, ast.returnType());
        }
        builder.append(" ");

        builder.append(ast.nameIdentity());
        paren(this, this::translateParams);

        or(
                this,
                ApsMethodAst::isVirtual,
                this::appendEnding,
                this::translateBody
        );
    }

    @Override
    public void preTranslateBody(Consumer<ApsTranslator<ApsMethodAst>> bodyTranslator) {
        braces(this, bodyTranslator);
    }
}
