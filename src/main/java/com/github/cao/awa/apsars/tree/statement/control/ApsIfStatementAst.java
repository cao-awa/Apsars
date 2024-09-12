package com.github.cao.awa.apsars.tree.statement.control;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsYieldAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsIfStatementAst extends ApsResultingStatementAst {
    @Getter
    @Setter
    private ApsMethodBodyAst statements;
    @Getter
    @Setter
    private ApsMethodBodyAst elseStatements;
    @Getter
    @Setter
    private ApsIfStatementAst elseIfStatement;
    @Getter
    @Setter
    private ApsResultPresentingAst predicate;

    public ApsIfStatementAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void print(String ident) {
        System.out.println("Aps if: ");
        System.out.println(ident + "    |_ predicate: " + this.predicate.generateJava());
        this.statements.print(ident + "    ");
    }

    @Override
    public void preprocess() {
        this.statements.preprocess();
        this.predicate.preprocess();
    }

    public void requestAssigment(ApsVariableAst parent) {
        if (this.elseIfStatement != null) {
            this.elseIfStatement.requestAssigment(parent);
        } else if (this.elseStatements != null) {
            this.elseStatements.replaceLastStatement(parent);
        }

        if (this.statements != null) {
            this.statements.preprocess();

            if (this.statements.searchLastStatement() instanceof ApsYieldAst yieldAst) {
                this.statements.replaceLastStatement(parent.assignmentToSelf(yieldAst.result()));
            }
        }
    }

    @Override
    public void generateJava(StringBuilder builder) {
        builder.append("if");
        builder.append("(");
        this.predicate.generateJava(builder);
        builder.append(")");
        builder.append("{");
        if (this.statements != null) {
            this.statements.generateJava(builder);
        }
        builder.append("}");
        if (this.elseStatements != null) {
            builder.append("else");
            builder.append("{");
            this.elseStatements.generateJava(builder);
            builder.append("}");
        } else if (this.elseIfStatement != null) {
            builder.append("else ");
            this.elseIfStatement.generateJava(builder);
        }
    }
}
