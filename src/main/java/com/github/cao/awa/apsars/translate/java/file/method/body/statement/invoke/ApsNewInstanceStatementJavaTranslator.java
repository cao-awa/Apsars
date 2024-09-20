package com.github.cao.awa.apsars.translate.java.file.method.body.statement.invoke;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.invoke.ApsNewInstanceStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.result.instance.ApsNewInstanceStatementAst;

public class ApsNewInstanceStatementJavaTranslator extends ApsJavaTranslator<ApsNewInstanceStatementAst> implements ApsNewInstanceStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsNewInstanceStatementAst ast) {
        builder.append("new ");

        postTranslate(TranslateElement.ARG_TYPE, ast.reference().type());

        paren(this, this::translateParams);

        translateFluents(this);

        translateEnding(this);
    }
}
