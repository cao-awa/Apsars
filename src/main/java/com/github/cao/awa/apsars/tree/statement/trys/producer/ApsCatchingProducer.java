package com.github.cao.awa.apsars.tree.statement.trys.producer;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsAstWithCatching;

public class ApsCatchingProducer extends ApsAstWithCatching {
    public ApsCatchingProducer(ApsAst parent, ApsMethodBodyAst parentBody) {
        super(parent, parentBody);
    }

    @Override
    public void print(String ident) {

    }

    @Override
    public void preprocess() {

    }
}
