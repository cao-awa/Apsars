package com.github.cao.awa.apsars.tree.statement.calculate.symbol;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing.ApsOrSymbol;

public abstract class ApsSymbolAst extends ApsStatementAst {
    public ApsSymbolAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("symbol", symbol());
        json.put("symbol_name", name());
    }

    public abstract int level();

    public abstract String symbol();

    public abstract String name();

    public boolean is(ApsSymbolAst... asts) {
        for (ApsSymbolAst ast : asts) {
            if (ast.symbol().equals(symbol())) {
                return true;
            }
        }
        return false;
    }

    public String oppositeName() {
        return name();
    }

    public boolean leftPrimary() {
        return false;
    }

    public boolean notBinary() {
        return true;
    }

    public boolean oppositePresent() {
        return !oppositeName().equals(name());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApsSymbolAst symbol) {
            return symbol.name().equals(name()) && symbol.symbol().equals(symbol()) && symbol.level() == level();
        }
        return false;
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
