package com.github.cao.awa.apsars.tree.method;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.LinkedList;
import java.util.List;

@Getter
@Accessors(fluent = true)
public class ApsMethodBodyAst extends ApsAst {
    private final LinkedList<ApsVariableAst> fieldVariables = ApricotCollectionFactor.linkedList();
    private final LinkedList<ApsStatementAst> statements = ApricotCollectionFactor.linkedList();
    private final ApsMethodBodyAst parentBody;

    public ApsMethodBodyAst(ApsAst parent, ApsMethodBodyAst parentBody) {
        super(parent);
        this.parentBody = parentBody;
    }

    public ApsMethodBodyAst addStatement(ApsStatementAst statement) {
        this.statements.add(statement);
        return this;
    }

    public ApsMethodBodyAst addPresentingFieldVariable(ApsVariableAst variableAst) {
        this.fieldVariables.add(variableAst);
        return this;
    }

    public ApsMethodBodyAst addFieldVariable(ApsVariableAst variableAst) {
        this.fieldVariables.add(variableAst);
        this.statements.add(variableAst);
        return this;
    }

    public ApsMethodBodyAst addReassignmentFieldVariable(ApsVariableAst variableAst) {
        this.statements.add(variableAst);
        return this;
    }

    public ApsStatementAst searchLastStatement() {
        if (this.statements.isEmpty()) {
            return null;
        }

        return this.statements.getLast();
    }

    public ApsStatementAst removeLastStatement() {
        if (this.statements.isEmpty()) {
            return null;
        }

        return this.statements.removeLast();
    }

    public ApsStatementAst replaceLastStatement(ApsStatementAst statement) {
        if (this.statements.isEmpty()) {
            return null;
        }

        ApsStatementAst oldStatement = this.statements.removeLast();

        this.statements.add(statement);

        return oldStatement;
    }

    public ApsInvokeAst searchLastInvoke() {
        if (searchLastStatement() instanceof ApsInvokeAst invokeAst) {
            return invokeAst;
        }

        return null;
    }

    public ApsLiteralStatementAst searchLastLiteralIdentity() {
        if (searchLastStatement() instanceof ApsLiteralStatementAst literalStatementAst) {
            return literalStatementAst;
        }

        return null;
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps method body: ");
        ident += "    ";

        System.out.println(ident + "Field variables: " + collectVariables().stream().map(ApsVariableAst::nameIdentity).toList());

        int statements = 0;

        for (ApsStatementAst statement : this.statements) {
            System.out.print(ident + statements++ + ": ");
            statement.print(ident + "    ");
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
    public void preprocess() {
        for (ApsStatementAst statementAst : this.statements) {
            statementAst.preprocess();
        }
    }
}
