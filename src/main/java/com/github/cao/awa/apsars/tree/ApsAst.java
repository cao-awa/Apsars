package com.github.cao.awa.apsars.tree;

import java.util.function.Supplier;

public abstract class ApsAst {
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

    public ApsAst findAst(Class<? extends ApsAst> target) {
        if (this.getClass() == target) {
            return this;
        } else {
            if (this.parent != null) {
                return this.parent.findAst(target);
            } else {
                return null;
            }
        }
    }
}
