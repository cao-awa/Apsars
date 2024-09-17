package com.github.cao.awa.apsars.tree.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsAccessibleModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBindingParameterAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

@Getter
@Accessors(fluent = true)
public class ApsClassAst extends ApsAst implements ApsModifierRequiredAst<ApsClassModifier> {
    @Setter
    private String nameIdentity;
    @Setter
    private ApsAccessibleModifier accessible = ApsAccessibleType.PRIVATE.generic();
    private final Map<ApsClassModifierType, ApsClassModifier> modifiers = ApricotCollectionFactor.hashMap();
    private final List<ApsMemberParameterAst> parameters = ApricotCollectionFactor.arrayList();
    private final List<ApsMethodAst> methods = ApricotCollectionFactor.arrayList();
    private final Set<ApsBinderAst> binders = ApricotCollectionFactor.hashSet();
    private final List<ApsLetAst> lets = ApricotCollectionFactor.arrayList();

    public ApsClassAst(ApsAst parent) {
        super(parent);
    }

    public void addMemberParameter(ApsMemberParameterAst parameterAst) {
        this.parameters.add(parameterAst);
    }

    public void addMethod(ApsMethodAst methodAst) {
        this.methods.add(methodAst);
    }

    public void addMethodByTemplate(String name, Function<ApsMethodAst, ApsMethodBodyAst> bodyGenerator) {
        addMethod(ApsMethodAst.createByTemplate(name, bodyGenerator, this));
    }

    public void addBinder(ApsBinderAst binderName) {
        this.binders.add(binderName);
    }

    public void addLet(ApsLetAst letAst) {
        this.lets.add(letAst);
    }

    @Override
    public Collection<ApsClassModifier> modifierValues() {
        return this.modifiers.values();
    }

    public void addModifier(ApsClassModifier modifier) {
        ApsClassModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    @Override
    public void addAccessible(ApsAccessibleModifier modifier) {
        this.accessible = modifier;
    }

    public boolean isFinal() {
        return this.modifiers.get(ApsClassModifierType.IS_FINAL) != null;
    }

    @Override
    public void print(String ident, boolean endElement) {
        String concat = endElement ? " " : ".";

        System.out.println(ident + "|_ Aps class: " + this.nameIdentity);
        if (!this.modifiers.isEmpty()) {
            System.out.println(ident + concat + "   |_ Aps class modifier: ");
            String modifierIdent = ident + ".       ";
            this.modifiers.forEach((type, modifier) -> {
                System.out.println(modifierIdent + "|_ " + modifier.type() + ": " + modifier.literal());
            });
        }
        System.out.println(ident + concat + "   |_ params: ");
        for (ApsMemberParameterAst parameter : this.parameters) {
            parameter.print(ident + concat + "   |   ");
        }
        System.out.println(ident + concat + "   |_ binders: " + this.binders);
        System.out.println(ident + concat + "   |_ methods: ");
        int i = 1;
        for (ApsMethodAst method : this.methods) {
            method.print(ident + concat + "       ", i++ == this.methods.size());
        }
    }

    @Override
    public void preprocess() {
        for (ApsLetAst let : this.lets) {
            let.preprocess();
        }

        for (ApsMemberParameterAst parameterAst : this.parameters) {
            parameterAst.preprocess();
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.preprocess();
        }

        if (!this.binders.isEmpty()) {
            for (ApsBinderAst binder : findAst(ApsClassAst.class).binders()) {
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
