package com.github.cao.awa.apsars.translate.java.file.method.param;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.param.ApsMethodParameterListElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;

import java.util.Iterator;

public class ApsMethodParameterListJavaTranslator extends ApsJavaTranslator<ApsMethodParameterAst> implements ApsMethodParameterListElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsMethodParameterAst ast) {
        translator(ApsarsTranslateElement.METHOD_PARAMETER, next -> {
            Iterator<ApsMethodParamElementAst> params = ast.params().iterator();
            while (params.hasNext()) {
                next.postTranslate(builder, params.next());
                if (params.hasNext()) {
                    builder.append(",");
                }
            }
        });
    }
}
