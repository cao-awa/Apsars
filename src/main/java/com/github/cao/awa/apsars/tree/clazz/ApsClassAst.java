package com.github.cao.awa.apsars.tree.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBindingParameterAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Accessors(fluent = true)
public class ApsClassAst extends ApsAst {
    @Setter
    @Getter
    private String nameIdentity;
    private final Map<ApsClassModifierType, ApsClassModifier> modifiers = ApricotCollectionFactor.hashMap();
    private final List<ApsMemberParameterAst> parameters = ApricotCollectionFactor.arrayList();
    private final List<ApsMethodAst> methods = ApricotCollectionFactor.arrayList();
    private final Set<String> binders = ApricotCollectionFactor.hashSet();

    public ApsClassAst(ApsAst parent) {
        super(parent);
    }

    public void addMemberParameter(ApsMemberParameterAst parameterAst) {
        this.parameters.add(parameterAst);
    }

    public void addMethod(ApsMethodAst methodAst) {
        this.methods.add(methodAst);
    }

    public void addBinder(String binderName) {
        this.binders.add(binderName);
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
        System.out.println(ident + "    |_ binders: " + this.binders);
        System.out.println(ident + "    |_ methods: ");
        for (ApsMethodAst method : this.methods) {
            method.print(ident + "        ");
        }
    }

    @Override
    public void generateJava(StringBuilder builder) {
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
        if (!this.binders.isEmpty()) {
            builder.append(" implements ");
            int edge = this.binders.size() - 1;
            int index = 0;
            for (String binder : this.binders) {
                builder.append(binder);
                if (index != edge) {
                    builder.append(",");
                }
                index++;
            }
        }
        builder.append("{");

        for (ApsMemberParameterAst parameterAst : this.parameters) {
            parameterAst.generateJava(builder);
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.generateJava(builder);
        }

        builder.append("}");
    }

    @Override
    public void preprocess() {
        for (ApsMemberParameterAst parameterAst : this.parameters) {
            parameterAst.preprocess();
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.preprocess();
        }

        if (!this.binders.isEmpty()) {
            for (ApsBinderAst binder : findAst(ApsFileAst.class).binders()) {
                for (ApsBindingParameterAst parameter : binder.parameters()) {
                    parameter.preprocess();

                    addMemberParameter(parameter.toActual(this));

                    addMethod(ApsMethodAst.accessor(parameter.nameIdentity(), parameter.argType(), true, false, true, null));
                    if (!parameter.isFinal()) {
                        addMethod(ApsMethodAst.accessor(parameter.nameIdentity(), parameter.argType(), false, false, true, null));
                    }
                }
            }
        }
    }
}
