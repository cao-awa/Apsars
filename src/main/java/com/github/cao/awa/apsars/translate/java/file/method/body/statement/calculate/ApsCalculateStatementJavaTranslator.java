package com.github.cao.awa.apsars.translate.java.file.method.body.statement.calculate;

import com.github.cao.awa.apsars.translate.base.file.method.body.statement.calculate.ApsCalculateStatementElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.statement.calculate.ApsCalculateAst;

public class ApsCalculateStatementJavaTranslator extends ApsJavaTranslator<ApsCalculateAst> implements ApsCalculateStatementElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsCalculateAst ast) {
//        translateTotal(this);

        if (ast.totalWithParen()) {
            builder.append('(');
        }

        if (ast.leftWithParen()) {
            builder.append("(");
        }
        postNextTranslate(TranslateElement.RESULT_PRESENTING_STATEMENT, ApsCalculateAst::left);
        if (ast.leftWithParen()) {
            builder.append(")");
        }

        if (ast.symbol() != null) {
            builder.append(ast.symbol());
            if (ast.rightWithParen()) {
                builder.append("(");
            }
            postNextTranslate(TranslateElement.RESULT_PRESENTING_STATEMENT, ApsCalculateAst::right);
            if (ast.rightWithParen()) {
                builder.append(")");
            }
        }

        if (ast.totalWithParen()) {
            builder.append(')');
        }
    }
}
