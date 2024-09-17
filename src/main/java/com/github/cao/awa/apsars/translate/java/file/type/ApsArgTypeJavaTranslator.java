package com.github.cao.awa.apsars.translate.java.file.type;

import com.github.cao.awa.apsars.translate.base.file.type.ApsArgTypeElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;

import java.util.LinkedList;

public class ApsArgTypeJavaTranslator extends ApsJavaTranslator<ApsArgTypeAst> implements ApsArgTypeElementTranslator {
    @Override
    public void translate(StringBuilder builder, ApsArgTypeAst ast) {
        builder.append(ast.nameIdentity());
        if (!ast.args().isEmpty()) {
            builder.append("<");
            translator(TranslateElement.ARG_TYPE, next -> {
                LinkedList<ApsArgTypeAst> args = ast.args();
                int size = args.size();
                int edge = size - 1;
                for (int i = 0; i < size; i++) {
                    ApsArgTypeAst arg = args.get(i);
                    next.postTranslate(builder, arg);
                    if (i != edge) {
                        builder.append(",");
                    }
                }
            });
            builder.append(">");
        }
        if (ast.arrayArgType()) {
            int depth = ast.arrayDepth();
            while (depth-- > 0) {
                builder.append("[");
                if (ast.arraySize() == 1) {
                    builder.append(ast.arraySize());
                }
                builder.append("]");
            }
        }
    }
}
