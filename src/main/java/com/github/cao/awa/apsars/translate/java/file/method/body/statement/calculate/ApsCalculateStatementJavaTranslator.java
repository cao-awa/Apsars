package com.github.cao.awa.apsars.translate.java.file.method.body.statement.calculate;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.calculate.ApsCalculateStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.calculate.ApsCalculateAst;

public class ApsCalculateStatementJavaTranslator extends ApsJavaTranslator<ApsCalculateAst> implements ApsCalculateStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsCalculateAst ast) {
        translateTotal(this);
    }
}
