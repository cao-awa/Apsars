package com.github.cao.awa.apsars.tree.statement.result;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsReturnAst extends ApsStatementAst {
    private ApsResultPresentingAst result;

    public ApsReturnAst(ApsAst ast) {
        super(ast);
        withEnd(true);
    }

    @Override
    public void generateStructure(JSONObject json) {
        JSONObject theReturn = new JSONObject();
        this.result.generateStructure(theReturn);
        json.put("return_value", theReturn);
    }

    @Override
    public void print(String ident) {
        System.out.print("Return value: ");
        this.result.print(ident);
    }

    @Override
    public void preprocess() {
        this.result.parent(this);
        this.result.preprocess();
    }

    @Override
    public void postprocess() {
        this.result.postprocess();
    }

    @Override
    public void consequence() {
        this.result.consequence();
    }
}
