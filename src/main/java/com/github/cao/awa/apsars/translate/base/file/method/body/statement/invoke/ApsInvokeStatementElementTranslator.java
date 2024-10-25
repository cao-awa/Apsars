package com.github.cao.awa.apsars.translate.base.file.method.body.statement.invoke;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting.ApsResultingStatementElementTranslator;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import kotlin.jvm.internal.Ref;

public interface ApsInvokeStatementElementTranslator<T extends ApsInvokeAst> extends ApsResultingStatementElementTranslator<T> {
    default void translateParams(LanguageTranslator<T> translator) {
        T ast = translator.ast();
        StringBuilder builder = translator.builder();

        int edge = ast.params().size() - 1;
        Ref.IntRef index = new Ref.IntRef();
        index.element = 0;

        translator.translator(ApsarsTranslateElement.RESULT_PRESENTING_STATEMENT, next -> {
            for (ApsResultPresentingAst param : ast.params()) {
                next.postTranslate(builder, param);
                if (index.element != edge) {
                    builder.append(",");
                }
                index.element++;
            }
        });
    }

    default void translateFluents(LanguageTranslator<T> translator) {
        T ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.INVOKE_STATEMENT, next -> {
            for (ApsInvokeAst fluent : ast.fluentInvoke()) {
                next.postTranslate(builder, fluent);
            }
        });
    }
}
