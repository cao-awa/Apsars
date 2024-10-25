package com.github.cao.awa.apsars.tree.clazz;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import com.github.cao.awa.language.translator.translate.tree.modifier.ElementModifier;
import com.github.cao.awa.language.translator.translate.tree.modifier.ModifierRequiredAst;
import com.github.cao.awa.language.translator.translate.tree.modifier.accessible.AccessibleModifier;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Getter
@Accessors(fluent = true)
public class ApsLetAst extends LanguageAst implements ModifierRequiredAst<ElementModifier<?>> {
    private final List<ElementModifier<?>> modifiers = ApricotCollectionFactor.arrayList();
    private final List<ApsMethodAst> methods = ApricotCollectionFactor.arrayList();
    private final List<ApsMemberParameterAst> parameters = ApricotCollectionFactor.arrayList();
    private final Set<String> compilerFlags = ApricotCollectionFactor.hashSet();
    @Setter
    private AccessibleModifier accessible = null;

    public void addMethod(ApsMethodAst method) {
        this.methods.add(method);
    }

    public void addMemberParameter(ApsMemberParameterAst parameter) {
        this.parameters.add(parameter);
    }

    @Override
    public Collection<ElementModifier<?>> modifierValues() {
        return this.modifiers;
    }

    public void addModifier(final ElementModifier<?> modifier) {
        this.modifiers.add(modifier);
    }

    @Override
    public void addAccessible(AccessibleModifier modifier) {
        this.accessible = modifier;
    }

    public ApsLetAst(LanguageAst parent) {
        super(parent);
    }

    public void addCompilerFlag(String... flag) {
        this.compilerFlags.addAll(List.of(flag));
    }

    @Override
    public void generateStructure(JSONObject json) {
        JSONObject methods = new JSONObject();
        for (ApsMethodAst method : this.methods) {
            JSONObject theMethod = new JSONObject();
            method.generateStructure(theMethod);
            methods.put(method.formatCompletedName(), theMethod);
        }
        json.put("methods", methods);

        JSONObject parameters = new JSONObject();
        for (ApsMemberParameterAst parameter : this.parameters) {
            JSONObject theParameter = new JSONObject();
            parameter.generateStructure(theParameter);
            methods.put(parameter.nameIdentity(), theParameter);
        }
        json.put("parameters", parameters);

        JSONArray modifiers = new JSONArray();
        for (ElementModifier<?> modifier : this.modifiers) {
            modifiers.add(modifier.literal());
        }
        json.put("apply_modifiers", modifiers);
    }

    @Override
    public void print(String ident) {
        System.out.println();
    }

    @Override
    public void preprocess() {
        ApsClassAst classAst = findAst(ApsClassAst.class);

        if (!this.modifiers.isEmpty()) {
            for (ElementModifier<?> modifier : this.modifiers) {
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
            method.addCompilerFlag(this.compilerFlags);
            classAst.addMethod(method);
            method.prepares();
        }

        // Extract fields to class.
        for (ApsMemberParameterAst parameter : parameters()) {
            parameter.accessible(this.accessible);
            classAst.addMemberParameter(parameter);
            parameter.preprocess();
        }
    }

    @Override
    public void postprocess() {

    }

    @Override
    public void consequence() {

    }
}
