package com.github.cao.awa.apsars.translate.base.file.method.body;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;

public interface ApsMethodBodyElementTranslator extends ApsElementTranslator<ApsMethodBodyAst> {
    default void translateStatements(ApsTranslator<ApsMethodBodyAst> translator) {
        ApsMethodBodyAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(TranslateElement.STATEMENT, next -> {
            for (ApsStatementAst importAst : ast.statements()) {
                next.postTranslate(builder, importAst);
                if (!importAst.withEnd()) {
                    builder.append(";");
                }
            }
        });
    }
}
