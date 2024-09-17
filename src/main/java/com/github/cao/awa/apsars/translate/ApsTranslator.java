package com.github.cao.awa.apsars.translate;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.translate.base.ApsElementTranslator;
import com.github.cao.awa.apsars.translate.java.ApsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElementData;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElementEnum;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

@Getter
@Accessors(fluent = true)
public abstract class ApsTranslator<T extends ApsAst> implements ApsElementTranslator<T> {
    private static final Map<TranslateTarget, Map<TranslateElementEnum, ApsTranslator<?>>> translators = ApricotCollectionFactor.hashMap();
    private StringBuilder builder;
    private T ast;

    public static void registerJava() {
        ApsJavaTranslator.postRegister();
    }

    public static void registerJava(TranslateElementEnum element, ApsTranslator<?> translator) {
        register(TranslateTarget.JAVA, element, translator);
    }

    public static void register(TranslateTarget target, TranslateElementEnum element, ApsTranslator<?> translator) {
        translators.compute(target, (key, map) -> {
            if (map == null) {
                map = ApricotCollectionFactor.hashMap();
            }

            map.put(element, translator);

            return map;
        });
    }

    public static <X extends ApsAst> String translate(TranslateTarget target, TranslateElementData<X> element, X ast) {
        StringBuilder builder = new StringBuilder();
        translators.get(target).get(element.elementType()).postTranslate(builder, Manipulate.cast(ast));
        return builder.toString();
    }

    public abstract TranslateTarget target();

    public void append(String str) {
        this.builder.append(str);
    }

    @Override
    public void postTranslate(StringBuilder builder, T ast) {
        if (ast == null || builder == null) {
            return;
        }
        this.builder = builder;
        this.ast = ast;
        translate(builder, ast);
    }

    public <X extends ApsAst> void postTranslate(TranslateElementData<X> element, X ast) {
        T recovery = this.ast;
        translator(element).postTranslate(this.builder, ast);
        this.ast = recovery;
    }

    public <X extends ApsAst> void postNextTranslate(TranslateElementData<X> element, Function<T, X> nextAst) {
        postTranslate(element, nextAst.apply(this.ast));
    }

    public <X extends ApsAst> ApsTranslator<X> translator(TranslateElementData<X> element) {
        return Manipulate.cast(translators.get(target()).get(element.elementType()));
    }

    public <X extends ApsAst> void translator(TranslateElementData<X> element, Consumer<ApsTranslator<X>> action) {
        ApsTranslator<X> ast = Manipulate.cast(translators.get(target()).get(element.elementType()));
        if (ast == null) {
            return;
        }
        action.accept(ast);
    }
}
