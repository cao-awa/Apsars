package com.github.cao.awa.apsars.translate.base.file.clazz;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;

public interface ApsClassElementTranslator extends ApsElementTranslator<ApsClassAst> {
    default void translateClassBody(ApsTranslator<ApsClassAst> translator) {
        ApsClassAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(TranslateElement.MEMBER_PARAMETER, next -> {
            for (ApsMemberParameterAst parameterAst : ast.parameters()) {
                next.postTranslate(builder, parameterAst);
            }
        });

        translator.translator(TranslateElement.METHOD, next -> {
            for (ApsMethodAst methodAst : ast.methods()) {
                next.postTranslate(builder, methodAst);
            }
        });
    }

    default void translateAnnotations(ApsTranslator<ApsClassAst> translator) {
        ApsClassAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(TranslateElement.ANNOTATION, next -> {
            for (ApsAnnotationAst annotation : ast.annotations()) {
                next.postTranslate(builder, annotation);
                builder.append(" ");
            }
        });
    }
}
