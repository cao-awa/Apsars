package com.github.cao.awa.apsars.tree.statement.variable;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.modifier.statement.ApsLocalVariableModifier;
import com.github.cao.awa.apsars.element.statement.ApsLocalVariableModifierType;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.calculate.ApsCalculateAst;
import com.github.cao.awa.apsars.tree.statement.control.ApsIfStatementAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
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
    private boolean isAlternate = false;
    private final Map<ApsLocalVariableModifierType, ApsLocalVariableModifier> modifiers = ApricotCollectionFactor.hashMap();

    public ApsVariableAst(ApsAst ast) {
        super(ast);
    }

    public void addModifier(ApsLocalVariableModifier modifier) {
        ApsLocalVariableModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    public void removeModifier(ApsLocalVariableModifierType modifierType) {
        this.modifiers.remove(modifierType);
    }

    @Override
    public void print(String ident) {
        if (this.defining) {
            System.out.println("Local variable (" + this.type.generateJava() + ") ‘" + this.nameIdentity + "': ");
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
    }

    public ApsVariableAst assignmentToSelf(ApsResultPresentingAst assignment) {
        return new ApsVariableAst(parent())
                .nameIdentity(this.nameIdentity)
                .assignment(assignment)
                .withEnd(true)
                .defining(false);
    }

    @Override
    public void generateJava(StringBuilder builder) {
        if (this.isAlternate) {
            if (this.defining) {
                if (this.type != null && this.nameIdentity != null) {
                    this.type.generateJava(builder);
                    builder.append(ApsTokens.SPACE);
                    builder.append(this.nameIdentity);
                    builder.append(ApsTokens.EQUAL);
                    builder.append("null;");
                }
            }

            this.assignment.generateJava(builder);
        } else {
            if (this.defining) {
                if (this.type != null && this.nameIdentity != null) {
                    this.type.generateJava(builder);
                    builder.append(ApsTokens.SPACE);
                    builder.append(this.nameIdentity);
                }
            } else {
                if (this.nameIdentity != null) {
                    builder.append(this.nameIdentity);
                }
            }

            if (this.assignment != null) {
                builder.append(ApsTokens.EQUAL);
                this.assignment.generateJava(builder);
            }

            if (withEnd()) {
                builder.append(ApsTokens.SEMICOLON);
            }
        }
    }

    @Override
    public ApsVariableAst withEnd(boolean withEnd) {
        super.withEnd(withEnd);
        return this;
    }
}
