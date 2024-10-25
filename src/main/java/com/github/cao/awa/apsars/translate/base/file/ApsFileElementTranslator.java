package com.github.cao.awa.apsars.translate.base.file;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.aps.ApsImportAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.base.LanguageElementTranslator;

public interface ApsFileElementTranslator extends LanguageElementTranslator<ApsFileAst> {
    default void translateEach(LanguageTranslator<ApsFileAst> translator) {
        ApsFileAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(ApsarsTranslateElement.IMPORT, next -> {
            for (ApsImportAst importAst : ast.imports()) {
                next.postTranslate(builder, importAst);
            }
        });

        translator.translator(ApsarsTranslateElement.CLASS, next -> {
            for (ApsClassAst classAst : ast.classes()) {
                next.postTranslate(builder, classAst);
            }
        });
    }
}
