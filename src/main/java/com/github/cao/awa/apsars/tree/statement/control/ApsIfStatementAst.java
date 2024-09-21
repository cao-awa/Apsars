package com.github.cao.awa.apsars.tree.statement.control;

import com.alibaba.fastjson2.JSONObject;
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
    public void generateStructure(JSONObject json) {
        json.put("statement_type", "if");

        if (this.predicate != null) {
            JSONObject thePredicate = new JSONObject();
            this.predicate.generateStructure(thePredicate);
            json.put("predicate", thePredicate);
        }

        this.statements.generateStructure(json);

        if (this.elseIfStatement != null) {
            JSONObject theElse = new JSONObject();
            this.elseIfStatement.generateStructure(theElse);
            json.put("else_if", theElse);
        }

        if (this.elseStatements != null) {
            JSONObject theElse = new JSONObject();
            this.elseStatements.generateStructure(theElse);
            json.put("else", theElse);
        }
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

        if (this.elseStatements != null) {
            this.elseStatements.preprocess();
        }
        if (this.elseIfStatement != null) {
            this.elseIfStatement.preprocess();
        }

        if (!findAst(ApsClassAst.class).isAnnotationPresent(ApsAnnotationAst.DO_NOT_REF_PRIMARY)) {
            if (this.predicate.resultingStatement() instanceof ApsCalculateAst calculateAst) {
                calculateAst.prepares();

                // TODO
//                this.predicate = calculateAst.convertSymbol(false, true);
                this.predicate.preprocess();
            }
        }
    }

    @Override
    public void postprocess() {
        this.statements.postprocess();
        this.predicate.postprocess();

        if (this.elseStatements != null) {
            this.elseStatements.postprocess();
        }
        if (this.elseIfStatement != null) {
            this.elseIfStatement.postprocess();
        }
    }

    @Override
    public void consequence() {
        this.statements.consequence();
        this.predicate.consequence();

        if (this.elseStatements != null) {
            this.elseStatements.consequence();
        }
        if (this.elseIfStatement != null) {
            this.elseIfStatement.consequence();
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
