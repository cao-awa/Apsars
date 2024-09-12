package com.github.cao.awa.apsars.tree;

import com.github.cao.awa.apsars.tree.generator.ApsJavaGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public abstract class ApsAst implements ApsJavaGenerator {
    @Getter
    @Setter
    private ApsAst parent;

    public ApsAst(ApsAst parent) {
        this.parent = parent;
    }

    public void print() {
        print("");
    }

    public void print(String ident) {
        print(ident, true);
    }

    public void print(String ident, boolean endElement) {
        print(ident);
    }

    public void prepares() {
        preprocess();
        postprocess();
        finalProcess();
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
