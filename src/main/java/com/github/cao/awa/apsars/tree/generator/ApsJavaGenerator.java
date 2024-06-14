package com.github.cao.awa.apsars.tree.generator;

import java.util.function.Consumer;

public interface ApsJavaGenerator {
    // 用来打印 AST
    default String generateJava() {
        StringBuilder builder = new StringBuilder();
        generateJava(builder);
        return builder.toString();
    }

    // 用以生成代码
    void generateJava(StringBuilder builder);

    default void generateJava(StringBuilder builder, Consumer<StringBuilder> outer) {
        outer.accept(builder);
    }
}
