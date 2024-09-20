package com.github.cao.awa.apsars.tree.statement.constant;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public abstract class ApsConstantAst<T> extends ApsStatementAst {
    private ApsArgTypeAst argType;

    public ApsConstantAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("value", constantValue());
    }

    public abstract String literal();

    public abstract T constantValue();

    public abstract ApsArgTypeAst resultingType();

    @Override
    public void preprocess() {

    }

    @Override
    public void consequence() {

    }

    @Override
    public void postprocess() {

    }
}
