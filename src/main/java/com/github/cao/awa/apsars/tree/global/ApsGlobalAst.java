package com.github.cao.awa.apsars.tree.global;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Map;
import java.util.function.Consumer;

@Getter
@Accessors(fluent = true)
public class ApsGlobalAst extends ApsAst {
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
    public void print(String ident) {

    }

    @Override
    public void preprocess() {
        this.aliasMethods.forEach((name, method) -> {
            method.preprocess();
        });
    }
}
