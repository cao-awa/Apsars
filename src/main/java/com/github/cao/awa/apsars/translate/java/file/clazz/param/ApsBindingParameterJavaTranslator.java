package com.github.cao.awa.apsars.translate.java.file.clazz.param;

import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.translate.base.file.clazz.member.ApsBindingParameterElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBindingParameterAst;

public class ApsBindingParameterJavaTranslator extends ApsJavaTranslator<ApsBindingParameterAst> implements ApsBindingParameterElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsBindingParameterAst ast) {
        ast.processConflictModifiers();

        builder.append(ApsAccessibleType.PUBLIC.literal());

        splitModifiersBySpace(this);

        postTranslate(TranslateElement.ARG_TYPE, ast.argType());
        builder.append(" ");
        translateAssigment(this);

        translateEnding(this);
    }
}
