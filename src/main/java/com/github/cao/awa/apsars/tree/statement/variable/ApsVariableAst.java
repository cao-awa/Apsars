package com.github.cao.awa.apsars.tree.statement.variable;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.modifier.statement.ApsLocalVariableModifier;
import com.github.cao.awa.apsars.element.statement.ApsLocalVariableModifierType;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
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
    private ApsStatementAst assignment;
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
        System.out.println("Local variable ‘" + this.nameIdentity + "’ = " + this.assignment.generateJava());
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void generateJava(StringBuilder builder) {
        if (this.type != null && this.nameIdentity != null) {
            this.type.generateJava(builder);
            builder.append(ApsTokens.SPACE);
            builder.append(this.nameIdentity);

            if (this.assignment != null) {
                builder.append(ApsTokens.EQUAL);
                this.assignment.generateJava(builder);
            }
            builder.append(ApsTokens.SEMICOLON);
        }
    }
}
