package com.github.cao.awa.apsars.translate.base.file.clazz;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;

public interface ApsClassElementTranslator extends LanguageElementTranslator<ApsClassAst> {
    default void translateClassBody(LanguageTranslator<ApsClassAst> translator) {
        ApsClassAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.MEMBER_PARAMETER, next -> {
            for (ApsMemberParameterAst parameterAst : ast.parameters()) {
                next.postTranslate(builder, parameterAst);
            }
        });

        translator.translator(ApsarsTranslateElement.METHOD, next -> {
            for (ApsMethodAst methodAst : ast.methods()) {
                next.postTranslate(builder, methodAst);
            }
        });
    }

    default void translateAnnotations(LanguageTranslator<ApsClassAst> translator) {
        ApsClassAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.ANNOTATION, next -> {
            for (ApsAnnotationAst annotation : ast.annotations()) {
                next.postTranslate(builder, annotation);
                builder.append(" ");
            }
        });
    }
}
