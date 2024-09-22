package com.github.cao.awa.apsars.tree.method;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.reference.ApsReferenceLocatableStatement;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import kotlin.Pair;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Accessors(fluent = true)
public class ApsMethodBodyAst extends ApsAst implements ApsReferenceLocatableStatement {
    private final Map<String, Pair<ApsVariableAst, ApsVariableAst>> duplicatedFieldVariables = ApricotCollectionFactor.hashMap();
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
        this.fieldVariables.stream()
                .filter(v ->
                        {
                            System.out.println(v.reference() + ": " + variableAst.reference() + " / " + v.instanceReference() + ": " + variableAst.instanceReference());
                            return v.reference().equals(
                                    variableAst.reference()
                            ) && (v.instanceReference() == variableAst.instanceReference());
                        }
                )
                .forEach(this.fieldVariables::remove);
        if (!this.fieldVariables.contains(variableAst)) {
            this.fieldVariables.add(variableAst);
        }
        return this;
    }

    public ApsMethodBodyAst addFieldVariable(ApsVariableAst variableAst) {
        ApsVariableAst currentDuplicate = fieldVariable(variableAst.reference().nameIdentity());
        if (this.duplicatedFieldVariables.get(variableAst.reference().nameIdentity()) != null) {
            throw new IllegalArgumentException("Duplicated field variable: " + variableAst.reference());
        }
        if (currentDuplicate != null && currentDuplicate.instanceReference()) {
            this.duplicatedFieldVariables.put(
                    variableAst.reference().nameIdentity(),
                    new Pair<>(currentDuplicate, variableAst)
            );
        }
        if (variableAst.defining()) {
            this.fieldVariables.add(variableAst);
        }
        this.statements.add(variableAst);
        return this;
    }

    public ApsMethodBodyAst addReassignmentFieldVariable(ApsVariableAst variableAst) {
        this.statements.add(variableAst);
        return this;
    }

    public ApsMethodBodyAst insertStatement(int index, ApsStatementAst statement) {
        LinkedList<ApsStatementAst> newStatements = new LinkedList<>(this.statements.stream().limit(index).toList());
        newStatements.add(statement);
        AtomicInteger currentIndex = new AtomicInteger(0);
        newStatements.addAll(this.statements.stream().dropWhile(x -> currentIndex.getAndIncrement() < index).toList());

        this.statements.clear();
        this.statements.addAll(newStatements);

        return this;
    }

    public ApsVariableAst fieldVariable(String name) {
        return variables().stream()
                .filter(v -> v.reference().nameIdentity().equals(name))
                .findFirst()
                .orElse(null);
    }

    public boolean replaceMe(ApsStatementAst ast, ApsStatementAst newAst) {
        int index = 0;
        boolean isReplaceable = false;
        for (ApsStatementAst statement : this.statements) {
            if (statement == ast) {
                isReplaceable = true;
                break;
            }
            index++;
        }

        if (isReplaceable) {
            this.statements.set(index, newAst);
        }

        return isReplaceable;
    }

    public int searchHere(ApsStatementAst ast) {
        int index = 0;
        for (ApsStatementAst statement : this.statements) {
            if (statement == ast) {
                return index;
            }
            index++;
        }

        return -1;
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
    public void generateStructure(JSONObject json) {
        JSONObject statements = new JSONObject();
        int i = 0;
        for (ApsStatementAst statement : this.statements) {
            JSONObject theStatement = new JSONObject();
            statement.generateStructure(theStatement);
            statements.put("" + i, theStatement);
            i++;
        }
        json.put("statements", statements);
    }

    public boolean isEmpty() {
        return this.statements.isEmpty();
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps method body: ");
        ident += "    ";

        System.out.println(ident + "Field variables: " + collectVariables().stream().map(ApsVariableAst::reference).toList());

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
        return variableAsts.stream().distinct().toList();
    }

    @Override
    public void preprocess() {
        for (ApsMemberParameterAst parameter : findAst(ApsClassAst.class).parameters()) {
            addPresentingFieldVariable(parameter.variable());
        }

        for (ApsVariableAst fieldVariable : new LinkedList<>(this.fieldVariables)) {
            fieldVariable.parent(this);
            fieldVariable.preprocess();
        }

        for (ApsStatementAst statement : new LinkedList<>(this.statements)) {
            if (statement instanceof ApsVariableAst variable && this.fieldVariables.contains(variable)) {
                continue;
            }
            statement.parent(this);
            statement.withEnd(true);
            statement.preprocess();
        }
    }

    @Override
    public void postprocess() {
        for (ApsVariableAst fieldVariable : this.fieldVariables) {
            fieldVariable.postprocess();
        }

        for (ApsStatementAst statement : this.statements) {
            if (statement instanceof ApsVariableAst variable && this.fieldVariables.contains(variable)) {
                continue;
            }
            statement.postprocess();
        }
    }

    @Override
    public void consequence() {
        for (ApsVariableAst fieldVariable : this.fieldVariables) {
            fieldVariable.consequence();
        }

        for (ApsStatementAst statement : this.statements) {
            if (statement instanceof ApsVariableAst variable && this.fieldVariables.contains(variable)) {
                continue;
            }
            statement.consequence();
        }
    }

    @Override
    public Collection<ApsVariableAst> variables() {
        return this.fieldVariables;
    }

    @Override
    public ApsReferenceLocatableStatement parentLocator() {
        return null;
    }
}
