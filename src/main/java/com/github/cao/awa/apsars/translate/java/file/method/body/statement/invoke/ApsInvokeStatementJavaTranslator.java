package com.github.cao.awa.apsars.translate.java.file.method.body.statement.invoke;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.invoke.ApsInvokeStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;

public class ApsInvokeStatementJavaTranslator extends ApsJavaTranslator<ApsInvokeAst> implements ApsInvokeStatementElementTranslator<ApsInvokeAst> {
    @Override
    public void translate(StringBuilder builder, ApsInvokeAst ast) {
        if (ast.isFluent()) {
            builder.append(".");
        }

        postTranslate(ApsarsTranslateElement.REFERENCE, ast.reference());

        parenOr(
                this,
                x -> !x.accessingPublicField(),
                this::translateParams
        );

        translateFluents(this);

        translateEnding(this);
    }
}
