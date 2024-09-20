package com.github.cao.awa.apsars.tree.statement.calculate.symbol;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.not.ApsNotSymbol;

public abstract class ApsSymbolAst extends ApsStatementAst {
    public static final ApsNotSymbol NOT = new ApsNotSymbol(null);

    public ApsSymbolAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("symbol", symbol());
        json.put("symbol_name", name());
    }

    public abstract String symbol();

    public abstract String name();

    public String oppositeName() {
        return name();
    }

    public boolean leftPrimary() {
        return false;
    }

    public boolean oppositePresent() {
        return !oppositeName().equals(name());
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void postprocess() {

    }

    @Override
    public void consequence() {

    }
}
