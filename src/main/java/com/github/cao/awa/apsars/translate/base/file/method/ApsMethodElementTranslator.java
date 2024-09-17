package com.github.cao.awa.apsars.translate.base.file.method;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;

import java.util.function.Consumer;

public interface ApsMethodElementTranslator extends ApsElementTranslator<ApsMethodAst> {
    default void translateParams(ApsTranslator<ApsMethodAst> translator) {
        translator.postTranslate(
                TranslateElement.METHOD_PARAMETER_LIST,
                translator.ast().param()
        );
    }

    default void translateBody(ApsTranslator<ApsMethodAst> translator) {
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

    default void translateBodyContent(ApsTranslator<ApsMethodAst> translator) {
        preTranslateBody(
                (builder) -> translator.translator(
                        TranslateElement.METHOD_BODY,
                        next -> next.postTranslate(builder.builder(), builder.ast().methodBody())
                )
        );
    }

    default void translateExtraCatch(ApsTranslator<ApsMethodAst> translator) {
        preTranslateBody(
                (builder) -> translator.translator(
                        TranslateElement.METHOD_EXTRA_CATCH,
                        next -> next.postTranslate(builder.builder(), translator.ast().extraCatch())
                )
        );
    }

    default void translateEmptyBody(ApsTranslator<ApsMethodAst> translator) {
        preTranslateBody((x) -> {
        });
    }

    void preTranslateBody(Consumer<ApsTranslator<ApsMethodAst>> bodyTranslator);

    default void appendEnding(ApsTranslator<ApsMethodAst> translator) {
        translator.append(";");
    }
}
