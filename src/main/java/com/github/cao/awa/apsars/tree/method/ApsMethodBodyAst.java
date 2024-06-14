package com.github.cao.awa.apsars.tree.method;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.experimental.Accessors;

import java.util.LinkedList;

@Accessors(fluent = true)
public class ApsMethodBodyAst extends ApsAst {
    private final LinkedList<ApsStatementAst> statements = ApricotCollectionFactor.linkedList();

    public ApsMethodBodyAst(ApsAst parent) {
        super(parent);
    }

    public void addStatement(ApsStatementAst statement) {
        this.statements.add(statement);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps method body: ");
        ident += "    ";

        int statements = 0;

        for (ApsStatementAst statement : this.statements) {
            System.out.print(ident + statements++ + ": ");
            statement.print(ident);
        }
    }

    @Override
    public void generateJava(StringBuilder builder) {
        for (ApsStatementAst statement : this.statements) {
            statement.generateJava(builder);
        }
    }

    @Override
    public void preprocess() {
        for (ApsStatementAst statementAst : this.statements) {
            statementAst.preprocess();
        }
    }
}
