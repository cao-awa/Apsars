package com.github.cao.awa.apsars.tree.statement;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.experimental.Accessors;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@Accessors(fluent = true)
public abstract class ApsStatementAst extends ApsAst {
    public ApsStatementAst(ApsAst ast) {
        super(ast);
    }

}
