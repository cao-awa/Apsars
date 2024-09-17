package com.github.cao.awa.apsars.tree.statement.control;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
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
        System.out.println(ident + "    |_ predicate: " + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.RESULT_PRESENTING_STATEMENT, this.predicate));
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
}
