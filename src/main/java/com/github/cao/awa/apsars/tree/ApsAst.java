package com.github.cao.awa.apsars.tree;

import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.function.Supplier;

@Accessors(fluent = true)
public abstract class ApsAst {
    @Getter
    private final ApsAst parent;

    public ApsAst(ApsAst parent) {
        this.parent = parent;
    }

    public void print() {
        print("");
    }

    public abstract void print(String ident);

    public abstract String generateJava();
    public String generateJava(Supplier<String> outer) {
        return outer.get();
    }

    public abstract void preprocess();

    public void postprocess() {

    }

    public void finalProcess() {

    }

    @SuppressWarnings("all")
    public <T extends ApsAst> T findAst(Class<T> target) {
        if (getClass() == target) {
            return (T) this;
        } else {
            if (this.parent != null) {
                return this.parent.findAst(target);
            } else {
                return null;
            }
        }
    }
}
