package com.github.cao.awa.apsars.translate.java.file.clazz.param;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.clazz.member.ApsMemberParameterElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;

public class ApsMemberParameterJavaTranslator extends ApsJavaTranslator<ApsMemberParameterAst> implements ApsMemberParameterElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsMemberParameterAst ast) {
        ast.processConflictModifiers();

        translateAccessible(this);

        splitModifiersBySpace(this);

        postTranslate(ApsarsTranslateElement.ARG_TYPE, ast.argType());

        builder.append(" ");
        builder.append(ast.nameIdentity());

        translateAssigment(this);

        translateEnding(this);
    }
}
