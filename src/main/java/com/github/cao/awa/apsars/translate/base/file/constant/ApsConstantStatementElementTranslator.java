package com.github.cao.awa.apsars.translate.base.file.constant;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.ApsStatementElementTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

public interface ApsConstantStatementElementTranslator<T extends ApsConstantAst<?>> extends ApsStatementElementTranslator<T> {
    default void translateConstant(LanguageTranslator<T> translator) {
        ApsConstantAst<?> ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.byType(ast.getClass()), next -> {
            next.postTranslate(builder, Manipulate.cast(ast));
        });
    }
}
