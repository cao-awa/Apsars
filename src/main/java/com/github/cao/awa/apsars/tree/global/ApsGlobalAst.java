package com.github.cao.awa.apsars.tree.global;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Map;
import java.util.function.Consumer;

@Getter
@Accessors(fluent = true)
public class ApsGlobalAst extends LanguageAst {
    public static ApsGlobalAst global;

    private final Map<String, ApsMethodAst> aliasMethods = ApricotCollectionFactor.hashMap();

    public void addAliasMethod(String name, ApsMethodAst ast) {
        this.aliasMethods.put(name, ast);
    }

    public void methodAlias(Consumer<ApsMethodAst> consumer) {
        for (ApsMethodAst method : this.aliasMethods.values()) {
            consumer.accept(method);
        }
    }

    public ApsGlobalAst() {
        super(null);
    }

    @Override
    public void generateStructure(JSONObject json) {
        // TODO
    }

    @Override
    public void print(String ident) {

    }

    @Override
    public void preprocess() {
        this.aliasMethods.forEach((name, method) -> {
            method.preprocess();
        });
    }

    @Override
    public void postprocess() {
        this.aliasMethods.forEach((name, method) -> {
            method.postprocess();
        });
    }

    @Override
    public void consequence() {
        this.aliasMethods.forEach((name, method) -> {
            method.consequence();
        });
    }
}
