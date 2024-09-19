package com.github.cao.awa.apsars.tree.statement.control;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.calculate.ApsCalculateAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsYieldAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsIfStatementAst extends ApsResultingStatementAst {
    private ApsMethodBodyAst statements;
    private ApsMethodBodyAst elseStatements;
    private ApsIfStatementAst elseIfStatement;
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
        System.out.print(ident + "    |_ predicate: ");
        this.predicate.print(ident + "    .   ");
        this.statements.print(ident + "    ");
    }

    @Override
    public void preprocess() {
        this.statements.preprocess();
        this.predicate.preprocess();

        if (!findAst(ApsClassAst.class).isAnnotationPresent(ApsAnnotationAst.DO_NOT_REF_PRIMARY)) {
            if (this.predicate.resultingStatement() instanceof ApsCalculateAst calculateAst) {
                this.predicate = calculateAst.convertInvoke(false);
                this.predicate.preprocess();
            }
        }
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
}
