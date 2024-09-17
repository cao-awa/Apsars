package com.github.cao.awa.apsars.translate.base.file.method.body.statement.invoke;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting.ApsResultingStatementElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import kotlin.jvm.internal.Ref;

public interface ApsInvokeStatementElementTranslator<T extends ApsInvokeAst> extends ApsResultingStatementElementTranslator<T> {
    default void translateParams(ApsTranslator<T> translator) {
        ApsInvokeAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        int edge = ast.params().size() - 1;
        Ref.IntRef index = new Ref.IntRef();
        index.element = 0;

        translator.translator(TranslateElement.RESULT_PRESENTING_STATEMENT, next -> {
            for (ApsResultPresentingAst param : ast.params()) {
                next.postTranslate(builder, param);
                if (index.element != edge) {
                    builder.append(",");
                }
                index.element++;
            }
        });
    }

    default void translateFluents(ApsTranslator<T> translator) {
        ApsInvokeAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        if (!ast.fluentInvoke().isEmpty()) {
            translator.translator(TranslateElement.INVOKE_STATEMENT, next -> {
                for (ApsInvokeAst fluent : ast.fluentInvoke()) {
                    next.postTranslate(builder, fluent);
                }
            });
        }
    }
}
