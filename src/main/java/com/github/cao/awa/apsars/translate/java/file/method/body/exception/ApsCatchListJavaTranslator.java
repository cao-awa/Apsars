package com.github.cao.awa.apsars.translate.java.file.method.body.exception;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.translate.base.file.method.body.exception.ApsCatchListElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.tree.statement.trys.ApsCatchListAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;

import java.util.List;
import java.util.Objects;

public class ApsCatchListJavaTranslator extends ApsJavaTranslator<ApsCatchListAst> implements ApsCatchListElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsCatchListAst ast) {
        translator(ApsarsTranslateElement.ARG_TYPE, next -> {
            List<ApsArgTypeAst> catchTargets = ast.catchTargets();
            int targetsSize = catchTargets.size();
            int edge = targetsSize - 1;
            for (int i = 0; i < targetsSize; i++) {
                ApsArgTypeAst target = catchTargets.get(i);
                next.postTranslate(builder, target);
                if (i != edge) {
                    builder.append("|");
                }
            }
        });
        builder.append(" ");
        builder.append(Objects.requireNonNullElse(ast.catchName(), "ignored"));
    }
}
