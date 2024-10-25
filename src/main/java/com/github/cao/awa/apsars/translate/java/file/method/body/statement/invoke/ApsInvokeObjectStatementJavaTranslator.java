package com.github.cao.awa.apsars.translate.java.file.method.body.statement.invoke;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.invoke.ApsInvokeObjectStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeObjectAst;

public class ApsInvokeObjectStatementJavaTranslator extends ApsJavaTranslator<ApsInvokeObjectAst> implements ApsInvokeObjectStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsInvokeObjectAst ast) {
        postTranslate(ApsarsTranslateElement.REFERENCE, ast.objectName());
        builder.append(".");
        postTranslate(ApsarsTranslateElement.REFERENCE, ast.reference());

        paren(this, this::translateParams);

        translateFluents(this);

        translateEnding(this);
    }
}
