package com.github.cao.awa.apsars.translate.base;

import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.tree.ApsAst;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface ApsElementTranslator<T extends ApsAst> {
    // Do not impl it at translating instance.
    void postTranslate(StringBuilder builder, T ast);

    // Do not call this at translating instance, call 'postTranslate'.
    void translate(StringBuilder builder, T ast);

    default byte[] translateBin(T ast) {
        return new byte[0];
    }

    default void braces(ApsTranslator<T> translator, Consumer<ApsTranslator<T>> body) {
        StringBuilder builder = translator.builder();

        builder.append("{");
        body.accept(translator);
        builder.append("}");
    }

    default void braceOr(ApsTranslator<T> translator, Predicate<T> predicate, Consumer<ApsTranslator<T>> body) {
        braceOr(translator, predicate, body, body);
    }

    default void braceOr(ApsTranslator<T> translator, Predicate<T> predicate, Consumer<ApsTranslator<T>> bodyWhenBrace, Consumer<ApsTranslator<T>> bodyWhenNotBrace) {
        if (predicate.test(translator.ast())) {
            braces(translator, bodyWhenBrace);
        } else {
            bodyWhenNotBrace.accept(translator);
        }
    }

    default void paren(ApsTranslator<T> translator, Consumer<ApsTranslator<T>> body) {
        StringBuilder builder = translator.builder();

        builder.append("(");
        body.accept(translator);
        builder.append(")");
    }

    default void or(ApsTranslator<T> translator, Predicate<T> predicate, Consumer<ApsTranslator<T>> body) {
        or(translator, predicate, body, body);
    }

    default void or(ApsTranslator<T> translator, Predicate<T> predicate, Consumer<ApsTranslator<T>> bodyWhenTrue, Consumer<ApsTranslator<T>> bodyWhenFalse) {
        if (predicate.test(translator.ast())) {
            bodyWhenTrue.accept(translator);
        } else {
            bodyWhenFalse.accept(translator);
        }
    }

    default void parenOr(ApsTranslator<T> translator, Predicate<T> predicate, Consumer<ApsTranslator<T>> body) {
        parenOr(translator, predicate, body, body);
    }

    default void parenOr(ApsTranslator<T> translator, Predicate<T> predicate, Consumer<ApsTranslator<T>> bodyWhenParen, Consumer<ApsTranslator<T>> bodyWhenNotParen) {
        if (predicate.test(translator.ast())) {
            paren(translator, bodyWhenParen);
        } else {
            bodyWhenNotParen.accept(translator);
        }
    }

    default void translateAccessible(ApsTranslator<T> translator) {
        if (translator.ast() instanceof ApsModifierRequiredAst<?> modifierRequired) {
            translator.append(modifierRequired.accessible().getAccessibleType().literal());
            translator.append(" ");
        }
    }

    default void splitModifiersBySpace(ApsTranslator<T> translator) {
        if (translator.ast() instanceof ApsModifierRequiredAst<?> modifierRequired) {
            splitModifiersBy(translator, modifierRequired.modifierValues(), " ");
        }
    }

    default void splitModifiersBy(ApsTranslator<T> translator, Collection<? extends ApsModifier<?>> modifiers, String split) {
        for (ApsModifier<?> modifier : modifiers) {
            if (modifier.isLiteral()) {
                translator.append(modifier.literal());
                translator.append(split);
            }
        }
    }
}
