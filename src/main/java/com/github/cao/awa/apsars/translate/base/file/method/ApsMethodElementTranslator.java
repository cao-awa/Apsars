package com.github.cao.awa.apsars.translate.base.file.method;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;

import java.util.function.Consumer;

public interface ApsMethodElementTranslator extends LanguageElementTranslator<ApsMethodAst> {
    default void translateParams(LanguageTranslator<ApsMethodAst> translator) {
        translator.postTranslate(
                ApsarsTranslateElement.METHOD_PARAMETER_LIST,
                translator.ast().param()
        );
    }

    default void translateBody(LanguageTranslator<ApsMethodAst> translator) {
        or(
                translator,
                ApsMethodAst::hasExtraCatch,
                this::translateExtraCatch,
                ignored -> or(
                        translator,
                        ast -> ast.methodBody() == null,
                        this::translateEmptyBody,
                        this::translateBodyContent
                )
        );
    }

    default void translateBodyContent(LanguageTranslator<ApsMethodAst> translator) {
        preTranslateBody(
                (builder) -> translator.translator(
                        ApsarsTranslateElement.METHOD_BODY,
                        next -> next.postTranslate(builder.builder(), builder.ast().methodBody())
                )
        );
    }

    default void translateExtraCatch(LanguageTranslator<ApsMethodAst> translator) {
        preTranslateBody(
                (builder) -> translator.translator(
                        ApsarsTranslateElement.METHOD_EXTRA_CATCH,
                        next -> next.postTranslate(builder.builder(), translator.ast().extraCatch())
                )
        );
    }

    default void translateEmptyBody(LanguageTranslator<ApsMethodAst> translator) {
        preTranslateBody((x) -> {
        });
    }

    void preTranslateBody(Consumer<LanguageTranslator<ApsMethodAst>> bodyTranslator);

    default void appendEnding(LanguageTranslator<ApsMethodAst> translator) {
        translator.append(";");
    }
}
