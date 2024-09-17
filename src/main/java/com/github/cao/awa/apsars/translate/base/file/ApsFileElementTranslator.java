package com.github.cao.awa.apsars.translate.base.file;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.aps.ApsImportAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;

public interface ApsFileElementTranslator extends ApsElementTranslator<ApsFileAst> {
    default void translateEach(ApsTranslator<ApsFileAst> translator) {
        ApsFileAst ast = translator.ast();
        StringBuilder builder = translator.builder();

        translator.translator(TranslateElement.IMPORT, next -> {
            for (ApsImportAst importAst : ast.imports()) {
                next.postTranslate(builder, importAst);
            }
        });

        translator.translator(TranslateElement.CLASS, next -> {
            for (ApsClassAst classAst : ast.classes()) {
                next.postTranslate(builder, classAst);
            }
        });
    }
}
