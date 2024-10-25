package com.github.cao.awa.apsars.translate.java.file.clazz.param;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.clazz.member.ApsBindingParameterElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBindingParameterAst;
import com.github.cao.awa.language.translator.translate.tree.modifier.accessible.AccessibleType;

public class ApsBindingParameterJavaTranslator extends ApsJavaTranslator<ApsBindingParameterAst> implements ApsBindingParameterElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsBindingParameterAst ast) {
        ast.processConflictModifiers();

        builder.append(AccessibleType.PUBLIC.literal());

        splitModifiersBySpace(this);

        postTranslate(ApsarsTranslateElement.ARG_TYPE, ast.argType());
        builder.append(" ");
        translateAssigment(this);

        translateEnding(this);
    }
}
