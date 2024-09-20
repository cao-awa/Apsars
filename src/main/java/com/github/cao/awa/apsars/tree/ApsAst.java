package com.github.cao.awa.apsars.tree;

import com.alibaba.fastjson2.JSONObject;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public abstract class ApsAst {
    private ApsAst parent;

    public ApsAst(ApsAst parent) {
        this.parent = parent;
    }

    public abstract void generateStructure(JSONObject json);

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
        consequence();
    }

    public abstract void preprocess();

    public abstract void postprocess();

    public abstract void consequence();

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
