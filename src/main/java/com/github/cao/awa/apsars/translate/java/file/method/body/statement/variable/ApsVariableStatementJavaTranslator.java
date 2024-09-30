package com.github.cao.awa.apsars.translate.java.file.method.body.statement.variable;

import com.github.cao.awa.apsars.element.modifier.statement.ApsLocalVariableModifier;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.translate.base.file.method.body.statement.variable.ApsVariableStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;

public class ApsVariableStatementJavaTranslator extends ApsJavaTranslator<ApsVariableAst> implements ApsVariableStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsVariableAst ast) {
        translateModifiers(builder, ast);

        translateDefining(builder, ast, ast.isAlternate());

        translateAssigment(builder, ast);

        translateEnding(this);
    }

    public void translateModifiers(StringBuilder builder, ApsVariableAst ast) {
        for (ApsLocalVariableModifier modifier : ast.modifiers().values()) {
            if (modifier.isLiteral()) {
                builder.append(modifier.literal());
                builder.append(" ");
            }
        }
    }

    public void translateDefining(StringBuilder builder, ApsVariableAst ast, boolean autoNull) {
        if (ast.reference() != null) {
            if (ast.type() != null && ast.defining()) {
                postTranslate(TranslateElement.ARG_TYPE, ast.type());
                builder.append(ApsTokens.SPACE);
            }
            postTranslate(TranslateElement.REFERENCE, ast.reference());
            if (ast.isVisitingArray()) {
                builder.append("[");
                builder.append(ast.visitArrayIndex());
                builder.append("]");
            }
            if (autoNull) {
                builder.append(ApsTokens.EQUAL);
                builder.append("null");
            }
        }
    }

    public void translateAssigment(StringBuilder builder, ApsVariableAst ast) {
        if (ast.assignment() != null) {
            builder.append(ApsTokens.EQUAL);
        }
        postTranslate(TranslateElement.RESULT_PRESENTING_STATEMENT, ast.assignment());
    }
}
