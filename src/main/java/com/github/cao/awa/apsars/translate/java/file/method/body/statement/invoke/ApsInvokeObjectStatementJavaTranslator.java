package com.github.cao.awa.apsars.translate.java.file.method.body.statement.invoke;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.invoke.ApsInvokeObjectStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeObjectAst;

public class ApsInvokeObjectStatementJavaTranslator extends ApsJavaTranslator<ApsInvokeObjectAst> implements ApsInvokeObjectStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsInvokeObjectAst ast) {
        builder.append(ast.objectName());
        builder.append(".");
        builder.append(ast.nameIdentity());

        paren(this, this::translateParams);

        translateFluents(this);

        translateEnding(this);
    }
}
