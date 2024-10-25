package com.github.cao.awa.apsars.tree.statement.special.literal;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class ApsLiteralStatementAst extends ApsStatementAst {
    private final String statement;

    public ApsLiteralStatementAst(LanguageAst ast, String statement) {
        super(ast);
        this.statement = statement;
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("literal", this.statement);
    }

    @Override
    public void print(String ident) {
        System.out.println("Literal: " + this.statement);
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
