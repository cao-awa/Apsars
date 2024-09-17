package com.github.cao.awa.apsars.translate.java.file.method.body.statement.resulting;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.resulting.ApsResultingStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;

public class ApsResultingStatementJavaTranslator extends ApsJavaTranslator<ApsResultingStatementAst> implements ApsResultingStatementElementTranslator<ApsResultingStatementAst> {
    @Override
    public void translate(StringBuilder builder, ApsResultingStatementAst ast) {
        translateStatement(this);
    }
}
