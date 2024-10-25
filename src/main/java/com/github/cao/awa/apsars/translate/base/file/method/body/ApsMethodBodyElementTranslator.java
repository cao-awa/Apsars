package com.github.cao.awa.apsars.translate.base.file.method.body;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;

public interface ApsMethodBodyElementTranslator extends LanguageElementTranslator<ApsMethodBodyAst> {
    default void translateStatements(LanguageTranslator<ApsMethodBodyAst> translator) {
        ApsMethodBodyAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.STATEMENT, next -> {
            for (ApsStatementAst importAst : ast.statements()) {
                next.postTranslate(builder, importAst);
                if (!importAst.withEnd()) {
                    builder.append(";");
                }
            }
        });
    }
}
