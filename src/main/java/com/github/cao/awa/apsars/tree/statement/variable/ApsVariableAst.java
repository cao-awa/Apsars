package com.github.cao.awa.apsars.tree.statement.variable;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.modifier.statement.ApsLocalVariableModifier;
import com.github.cao.awa.apsars.element.statement.ApsLocalVariableModifierType;
import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.calculate.ApsCalculateAst;
import com.github.cao.awa.apsars.tree.statement.control.ApsIfStatementAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.instance.ApsNewInstanceStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Map;

@Accessors(fluent = true)
public class ApsVariableAst extends ApsStatementAst {
    @Getter
    @Setter
    private ApsArgTypeAst type;
    @Getter
    @Setter
    private String nameIdentity;
    @Getter
    @Setter
    private ApsResultPresentingAst assignment;
    @Getter
    @Setter
    private boolean defining = true;
    @Getter
    private boolean isAlternate = false;
    private final Map<ApsLocalVariableModifierType, ApsLocalVariableModifier> modifiers = ApricotCollectionFactor.hashMap();

    public ApsVariableAst(ApsAst ast) {
        super(ast);
        withEnd(true);
    }

    public void addModifier(ApsLocalVariableModifier modifier) {
        this.modifiers.putIfAbsent(modifier.type(), modifier);
    }

    public void removeModifier(ApsLocalVariableModifierType modifierType) {
        this.modifiers.remove(modifierType);
    }

    @Override
    public void print(String ident) {
        if (this.defining) {
            System.out.println("Local variable (" + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.ARG_TYPE, this.type) + ") ‘" + this.nameIdentity + "': ");
        } else {
            System.out.println("Reassignment local variable ‘" + this.nameIdentity + "': ");
        }
        if (this.assignment.resultingStatement() instanceof ApsCalculateAst) {
            System.out.print(ident);
            this.assignment.print(ident);
        }
    }

    @Override
    public void preprocess() {
        if (this.type == null) {
            this.defining = false;
        }

        if (this.assignment != null) {
            this.assignment.preprocess();
        }

        if (this.assignment != null && this.assignment.resultingStatement() instanceof ApsIfStatementAst ifStatementAst) {
            this.isAlternate = true;

            ifStatementAst.preprocess();

            ifStatementAst.requestAssigment(this);
        }

        if (!findAst(ApsClassAst.class).isAnnotationPresent(ApsAnnotationAst.DO_NOT_REF_PRIMARY)) {
            if (this.assignment != null && this.assignment.resultingStatement() instanceof ApsCalculateAst calculateAst) {
                calculateAst.preprocess();

                ApsResultPresentingAst ast = calculateAst.convertInvoke(true);
                if (ast != null) {
                    this.assignment = ast;
                    this.assignment.preprocess();
                }
            }
        }

        try {
            if (this.type != null && !this.type.isRefPrimary() && this.defining) {
                this.type = this.type.varyPrimary(this.modifiers.get(ApsLocalVariableModifierType.SYNCHRONIZED) != null);

                if (this.type.isRefPrimary()) {
                    assertPrimaryAssigment();
                }

                addModifier(ApsLocalVariableModifierType.IS_FINAL.modifier());

                this.type.preprocess();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void postprocess() {
        for (ApsVariableAst variableAst : findAst(ApsMethodBodyAst.class).fieldVariables()) {
            if (variableAst != this && variableAst.nameIdentity().equals(this.nameIdentity) && variableAst.type().isRefPrimary()) {
                this.nameIdentity = this.nameIdentity + ".delegate";
            }
        }
    }

    public void primary(ApsVariableAst source) {
        if (source != this && source.nameIdentity().equals(this.nameIdentity) && source.type().isRefPrimary()) {
            this.nameIdentity = this.nameIdentity + ".delegate";
        }
    }

    public String primaryTo() {
        if (nameIdentity().equals(this.nameIdentity) && type().isRefPrimary()) {
            return this.nameIdentity + ".delegate";
        }
        return this.nameIdentity;
    }

    public void assertPrimaryAssigment() {
        System.out.println(this.assignment + " ///");

        if (this.assignment != null) {
            ApsMethodBodyAst body = findAst(ApsMethodBodyAst.class);
            int index = body.searchHere(this);

            ApsVariableAst assigment = new ApsVariableAst(body);
            assigment.nameIdentity(this.nameIdentity);
            assigment.defining(false);
            assigment.assignment(this.assignment);

            body.insertStatement(index + 1, assigment);

            ApsNewInstanceStatementAst newApsarsPrimary = new ApsNewInstanceStatementAst(body);
            newApsarsPrimary.nameIdentity(this.type.nameIdentity());

            this.assignment = ApsResultPresentingAst.statement(this, newApsarsPrimary);
        }
    }

    public ApsVariableAst assignmentToSelf(ApsResultPresentingAst assignment) {
        return new ApsVariableAst(parent())
                .nameIdentity(this.nameIdentity)
                .assignment(assignment)
                .withEnd(true)
                .defining(false);
    }

    @Override
    public ApsVariableAst withEnd(boolean withEnd) {
        super.withEnd(withEnd);
        return this;
    }
}
