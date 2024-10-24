package com.github.cao.awa.apsars.translate.java.file.method;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.ApsMethodElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;

import java.util.function.Consumer;

public class ApsMethodJavaTranslator extends ApsJavaTranslator<ApsMethodAst> implements ApsMethodElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsMethodAst ast) {
        if (!ast.annotations().isEmpty()) {
            translator(ApsarsTranslateElement.ANNOTATION, next -> {
                for (ApsAnnotationAst annotationAst : ast.annotations()) {
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

        if (ast.returnType() == null && !ast.isConstructor()) {
            builder.append("void ");
        } else if (ast.returnType() != null) {
            postTranslate(ApsarsTranslateElement.ARG_TYPE, ast.returnType());
            builder.append(" ");
        }

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
    public void preTranslateBody(Consumer<LanguageTranslator<ApsMethodAst>> bodyTranslator) {
        braces(this, bodyTranslator);
    }
}
