package com.github.cao.awa.apsars.translate.java.file.constant;

import com.github.cao.awa.apsars.translate.base.file.constant.ApsConstantStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;

public class ApsConstantStatementJavaTranslator extends ApsJavaTranslator<ApsConstantAst> implements ApsConstantStatementElementTranslator<ApsConstantAst> {
    @Override
    public void translate(StringBuilder builder, ApsConstantAst ast) {
        translateConstant(this);
    }
}
