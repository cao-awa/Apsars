package com.github.cao.awa.apsars.tree.statement.variable;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.modifier.statement.ApsLocalVariableModifier;
import com.github.cao.awa.apsars.element.statement.ApsLocalVariableModifierType;
import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.control.ApsIfStatementAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeObjectAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.instance.ApsNewInstanceStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Map;

@Getter
@Setter
@Accessors(fluent = true)
public class ApsVariableAst extends ApsStatementAst {
    private ApsArgTypeAst type;
    private ApsRefReferenceAst reference;
    private ApsResultPresentingAst assignment;
    private boolean defining = false;
    private boolean isAlternate = false;
    private boolean instanceReference = false;
    private boolean doNotProcess = false;
    private boolean isVisitingArray = false;
    private int visitArrayIndex = -1;
    private final Map<ApsLocalVariableModifierType, ApsLocalVariableModifier> modifiers = ApricotCollectionFactor.hashMap();

    public ApsVariableAst(ApsAst ast) {
        super(ast);
        withEnd(true);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("statement_type", "variable");

        JSONObject reference = new JSONObject();
        this.reference.generateStructure(reference);
        json.put("reference", reference);

        if (this.defining) {
            json.put("is_defining", true);
        }

        if (this.isAlternate) {
            json.put("is_alternate", true);
        }

        json.put("is_instance_reference", this.instanceReference);

        if (!this.modifiers.isEmpty()) {
            JSONArray modifiers = new JSONArray();
            for (ApsLocalVariableModifier modifier : this.modifiers.values()) {
                modifiers.add(modifier.literal());
            }
            json.put("modifiers", modifiers);
        }

        if (this.assignment != null) {
            JSONObject theAssignment = new JSONObject();
            this.assignment.generateStructure(theAssignment);
            json.put("assignment", theAssignment);
        }

        if (this.isVisitingArray) {
            json.put("visiting_array", true);
            json.put("visit_array_index", this.visitArrayIndex);
        }

        JSONObject type = new JSONObject();
        this.type.generateStructure(type);
        json.put("type", type);
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
            System.out.println("Local variable (" + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.ARG_TYPE, this.type) + ") ‘" + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.REFERENCE, this.reference) + "': ");
        } else {
            System.out.println("Reassignment local variable (" + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.ARG_TYPE, this.type) + ") '" + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.REFERENCE, this.reference) + "': ");
        }
        if (this.assignment != null) {
            System.out.print(ident);
            this.assignment.print(ident);
        }
    }

    @Override
    public void preprocess() {
        if (this.doNotProcess) {
            return;
        }

        if (this.reference != null) {
            this.reference.parent(this);
            this.reference.preprocess();

            if (this.type == null && !this.reference.doNotProcess()) {
                this.defining = false;

                ApsVariableAst variable = findAst(ApsMethodBodyAst.class).fieldVariable(this.reference.nameIdentity());

                this.type = variable.type();
            }
        }

        this.type.preprocess();

        if (this.reference != null) {
            this.reference.type(this.type);
        }

        if (this.assignment != null) {
            this.assignment.preprocess();
        }

        if (this.assignment != null && this.assignment.resultingStatement() instanceof ApsIfStatementAst ifStatementAst) {
            this.isAlternate = true;

            ifStatementAst.requestAssigment(this);
        }

        this.reference.noDelegate(this.isVisitingArray);

        if (!this.isVisitingArray) {
            if (this.type != null && this.type.referencePrimary() == null && this.defining) {
                this.type = this.type.varyPrimary(this.modifiers.get(ApsLocalVariableModifierType.SYNCHRONIZED) != null);

                if (this.type.referencePrimary() != null) {
                    assertPrimaryAssigment();
                }

                addModifier(ApsLocalVariableModifierType.IS_FINAL.modifier());

                this.type.preprocess();
            }
        }
    }

    @Override
    public void postprocess() {
        if (this.doNotProcess) {
            return;
        }

        if (this.assignment != null) {
            this.assignment.postprocess();
        }

        this.type.postprocess();

        this.reference.postprocess();
    }

    @Override
    public void consequence() {
        if (this.doNotProcess) {
            return;
        }

        this.type.consequence();

        this.reference.consequence();

        if (this.assignment != null) {
            this.assignment.consequence();
        }
    }

    public void assertPrimaryAssigment() {
        if (this.assignment != null) {
            ApsMethodBodyAst body = findAst(ApsMethodBodyAst.class);
            int index = body.searchHere(this);

            if (this.type.referencePrimary().sync()) {
                ApsInvokeObjectAst invoke = new ApsInvokeObjectAst(body);

                invoke.objectName(this.reference.dump(invoke));
                invoke.reference(new ApsRefReferenceAst(invoke).nameIdentity("delegate").doNotProcess(true));
                invoke.addParam(this.assignment);
                invoke.withEnd(true);

                body.insertStatement(index + 1, invoke);

                invoke.preprocess();
            } else {
                ApsVariableAst assignment = new ApsVariableAst(body);

                assignment.reference(this.reference.dump(assignment));
                assignment.defining(false);
                assignment.assignment(this.assignment);

                body.insertStatement(index + 1, assignment);
                assignment.preprocess();
            }

            ApsNewInstanceStatementAst newApsarsPrimary = new ApsNewInstanceStatementAst(body);
            newApsarsPrimary.reference(new ApsRefReferenceAst(newApsarsPrimary).type(this.type).doNotProcess(true));

            this.assignment = ApsResultPresentingAst.statement(this, newApsarsPrimary);
            this.assignment.preprocess();
        }
    }

    public ApsVariableAst assignmentToSelf(ApsResultPresentingAst assignment) {
        return new ApsVariableAst(parent())
                .reference(this.reference.dump(this))
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
