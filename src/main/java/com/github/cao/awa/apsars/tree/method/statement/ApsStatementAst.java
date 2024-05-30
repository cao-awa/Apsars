package com.github.cao.awa.apsars.tree.method.statement;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.experimental.Accessors;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@Accessors(fluent = true)
public class ApsStatementAst extends ApsAst {
    private final String statement;

    public ApsStatementAst(ApsAst ast, String statement) {
        super(ast);
        this.statement = statement;
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + this.statement);
    }

    @Override
    public String generateJava() {
        return this.statement;
    }

    @Override
    public void preprocess() {

    }
}
