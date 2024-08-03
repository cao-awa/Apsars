package com.github.cao.awa.apsars.tree.method;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.LinkedList;
import java.util.List;

@Accessors(fluent = true)
public class ApsMethodBodyAst extends ApsAst {
    private final LinkedList<ApsVariableAst> fieldVariables = ApricotCollectionFactor.linkedList();
    private final LinkedList<ApsStatementAst> statements = ApricotCollectionFactor.linkedList();
    @Getter
    private final ApsMethodBodyAst parentBody;

    public ApsMethodBodyAst(ApsAst parent, ApsMethodBodyAst parentBody) {
        super(parent);
        this.parentBody = parentBody;
    }

    public void addStatement(ApsStatementAst statement) {
        this.statements.add(statement);
    }

    public void addFieldVariable(ApsVariableAst variableAst) {
        this.fieldVariables.add(variableAst);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps method body: ");
        ident += "    ";

        System.out.println(ident + "Field variables: " + collectVariables().stream().map(ApsVariableAst::nameIdentity).toList());

        int statements = 0;

        for (ApsStatementAst statement : this.statements) {
            System.out.print(ident + statements++ + ": ");
            statement.print(ident);
        }
    }

    public List<ApsVariableAst> collectVariables() {
        List<ApsVariableAst> variableAsts = ApricotCollectionFactor.linkedList();
        variableAsts.addAll(this.fieldVariables);
        if (this.parentBody != null) {
            variableAsts.addAll(this.parentBody.collectVariables());
        }
        return variableAsts;
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
