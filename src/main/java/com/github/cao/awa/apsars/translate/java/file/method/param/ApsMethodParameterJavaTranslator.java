package com.github.cao.awa.apsars.translate.java.file.method.param;

import com.github.cao.awa.apsars.translate.base.file.method.param.ApsMethodParameterElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;

public class ApsMethodParameterJavaTranslator extends ApsJavaTranslator<ApsMethodParamElementAst> implements ApsMethodParameterElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsMethodParamElementAst ast) {
        splitModifiersBySpace(this);

        translateArgType(this);
    }
}
