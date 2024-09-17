package com.github.cao.awa.apsars.tree.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.modifier.ApsAccessibleModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.List;

@Getter
@Accessors(fluent = true)
public class ApsLetAst extends ApsAst implements ApsModifierRequiredAst<ApsModifier<?>> {
    private final List<ApsModifier<?>> modifiers = ApricotCollectionFactor.arrayList();
    private final List<ApsMethodAst> methods = ApricotCollectionFactor.arrayList();
    private final List<ApsMemberParameterAst> parameters = ApricotCollectionFactor.arrayList();
    @Setter
    private ApsAccessibleModifier accessible = null;

    public void addMethod(ApsMethodAst method) {
        this.methods.add(method);
    }

    public void addMemberParameter(ApsMemberParameterAst parameter) {
        this.parameters.add(parameter);
    }

    @Override
    public Collection<ApsModifier<?>> modifierValues() {
        return this.modifiers;
    }

    public void addModifier(final ApsModifier<?> modifier) {
        this.modifiers.add(modifier);
    }

    @Override
    public void addAccessible(ApsAccessibleModifier modifier) {
        this.accessible = modifier;
    }

    public ApsLetAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {
        System.out.println();
    }

    @Override
    public void preprocess() {
        ApsClassAst classAst = findAst(ApsClassAst.class);

        if (!this.modifiers.isEmpty()) {
            for (ApsModifier<?> modifier : this.modifiers) {
                if (modifier instanceof ApsMethodModifier methodModifier) {
                    for (ApsMethodAst method : methods()) {
                        method.addModifierIgnoredPresent(methodModifier);
                        method.accessible(this.accessible);
                    }
                }

                if (modifier instanceof ApsMemberParameterModifier parameterModifier) {
                    for (ApsMemberParameterAst parameter : parameters()) {
                        parameter.addModifierIgnoredPresent(parameterModifier);
                        parameter.accessible(this.accessible);
                    }
                }
            }
        }

        // Extract methods to class.
        for (ApsMethodAst method : methods()) {
            method.accessible(this.accessible);
            classAst.addMethod(method);
        }

        // Extract fields to class.
        for (ApsMemberParameterAst parameter : parameters()) {
            parameter.accessible(this.accessible);
            classAst.addMemberParameter(parameter);
        }
    }
}
