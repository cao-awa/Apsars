package com.github.cao.awa.apsars.tree.clazz.inherit;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.clazz.inherit.ApsBinderModifierType;
import com.github.cao.awa.apsars.element.modifier.clazz.inherit.ApsBinderModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Accessors(fluent = true)
public class ApsBinderAst extends ApsAst {
    @Setter
    @Getter
    private String nameIdentity;
    private final Map<ApsBinderModifierType, ApsBinderModifier> modifiers = ApricotCollectionFactor.hashMap();
    @Getter
    private final List<ApsBindingParameterAst> parameters = ApricotCollectionFactor.arrayList();
    @Getter
    private final List<ApsMethodAst> methods = ApricotCollectionFactor.arrayList();

    public ApsBinderAst(ApsAst parent) {
        super(parent);
    }

    public void addMemberParameter(ApsBindingParameterAst parameterAst) {
        this.parameters.add(parameterAst);
    }

    public void addMethod(ApsMethodAst methodAst) {
        this.methods.add(methodAst);
    }

    public void addModifier(ApsBinderModifier modifier) {
        ApsBinderModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps binder: " + this.nameIdentity);
        if (!this.modifiers.isEmpty()) {
            System.out.println(ident + "|_ Aps method modifier: ");
            String modifierIdent = ident + "    ";
            this.modifiers.forEach((type, modifier) -> {
                System.out.println(modifierIdent + "|_ " + modifier.type() + ": " + modifier.literal());
            });
        }
        System.out.println(ident + "    |_ params: ");
        for (ApsBindingParameterAst parameter : this.parameters) {
            parameter.print(ident + "        ");
        }
        System.out.println(ident + "    |_ methods: ");
        for (ApsMethodAst method : this.methods) {
            method.print(ident + "        ");
        }
    }

    @Override
    public void preprocess() {
        for (ApsBindingParameterAst parameterAst : this.parameters) {
            parameterAst.preprocess();

            addMethod(ApsMethodAst.virtual(parameterAst.nameIdentity(), parameterAst.argType(), ApsMethodParameterAst::empty, this));
            if (!parameterAst.isFinal()) {
                addMethod(ApsMethodAst.virtual(parameterAst.nameIdentity(), null, method -> ApsMethodParameterAst.param(method, parameterAst.argType(), parameterAst.nameIdentity()), this));
            }
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.isBinder(true);
            methodAst.preprocess();
        }
    }

    @Override
    public void generateJava(StringBuilder builder) {
        // 设置修饰符
//        for (ApsClassModifierType modifierType : ApsClassModifierType.values()) {
//            Manipulate.notNull(this.modifiers.get(modifierType), modifier -> {
//                if (modifier.isLiteral()) {
//                    builder.append(modifier.literal());
//                    builder.append(" ");
//                }
//            });
//        }

        builder.append("interface ");
        builder.append(this.nameIdentity);
        builder.append("{");

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.generateJava(builder);
        }

        builder.append("}");
    }
}
