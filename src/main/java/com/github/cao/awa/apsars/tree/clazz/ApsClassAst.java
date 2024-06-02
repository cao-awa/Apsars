package com.github.cao.awa.apsars.tree.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassModifier;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Accessors(fluent = true)
public class ApsClassAst extends ApsAst {
    @Setter
    @Getter
    private String nameIdentity;
    private final Map<ApsClassModifierType, ApsClassModifier> modifiers = ApricotCollectionFactor.hashMap();
    private final List<ApsMemberParameterAst> parameters = ApricotCollectionFactor.arrayList();
    private final List<ApsMethodAst> methods = ApricotCollectionFactor.arrayList();

    public ApsClassAst(ApsAst parent) {
        super(parent);
    }

    public void addMemberParameter(ApsMemberParameterAst parameterAst) {
        this.parameters.add(parameterAst);
    }

    public void addMethod(ApsMethodAst methodAst) {
        this.methods.add(methodAst);
    }

    public void addModifier(ApsClassModifier modifier) {
        ApsClassModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    public boolean isFinal() {
        return this.modifiers.get(ApsClassModifierType.IS_FINAL) != null;
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps class: " + this.nameIdentity);
        if (!this.modifiers.isEmpty()) {
            System.out.println(ident + "|_ Aps method modifier: ");
            String modifierIdent = ident + "    ";
            this.modifiers.forEach((type, modifier) -> {
                System.out.println(modifierIdent + "|_ " + modifier.type() + ": " + modifier.literal());
            });
        }
        System.out.println(ident + "    |_ params: ");
        for (ApsMemberParameterAst parameter : this.parameters) {
            parameter.print(ident + "        ");
        }
        System.out.println(ident + "    |_ methods: ");
        for (ApsMethodAst method : this.methods) {
            method.print(ident + "        ");
        }
    }

    @Override
    public String generateJava() {
        StringBuilder builder = new StringBuilder();

        // 设置修饰符
        for (ApsClassModifierType modifierType : ApsClassModifierType.values()) {
            Manipulate.notNull(this.modifiers.get(modifierType), modifier -> {
                if (modifier.isLiteral()) {
                    builder.append(modifier.literal());
                    builder.append(" ");
                }
            });
        }

        builder.append("class ");
        builder.append(this.nameIdentity);
        builder.append("{");

        for (ApsMemberParameterAst parameterAst : this.parameters) {
            builder.append(parameterAst.generateJava());
        }

        for (ApsMethodAst methodAst : this.methods) {
            builder.append(methodAst.generateJava());
        }

        builder.append("}");
        return builder.toString();
    }

    @Override
    public void preprocess() {
        for (ApsMemberParameterAst parameterAst : this.parameters) {
            parameterAst.preprocess();
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.preprocess();
        }
    }
}
