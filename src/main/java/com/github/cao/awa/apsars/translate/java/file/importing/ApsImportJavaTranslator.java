package com.github.cao.awa.apsars.translate.java.file.importing;

import com.github.cao.awa.apsars.translate.base.file.importing.ApsImportElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.aps.ApsImportAst;

public class ApsImportJavaTranslator extends ApsJavaTranslator<ApsImportAst> implements ApsImportElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsImportAst ast) {
        builder.append("import ");
        if (ast.importStatic()) {
            builder.append("static ");
        }
        builder.append(ast.fullName());
        if (ast.importAll()) {
            builder.append(".*");
        }
        builder.append(";");
    }
}
