package com.github.cao.awa.apsars.translate.java.file.method.param;

import com.github.cao.awa.apsars.translate.base.file.method.param.ApsMethodParameterDefaultElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsMethodParameterDefaultValueAst;

public class ApsMethodParameterDefaultJavaTranslator extends ApsJavaTranslator<ApsMethodParameterDefaultValueAst> implements ApsMethodParameterDefaultElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsMethodParameterDefaultValueAst ast) {
        if (ast.value() == null) {
            builder.append("null");
        } else {
            postTranslate(TranslateElement.RESULT_PRESENTING_STATEMENT, ast.value());
        }
    }
}
