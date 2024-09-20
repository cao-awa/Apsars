package com.github.cao.awa.apsars.tree.clazz.inherit;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.clazz.inherit.ApsBinderModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsAccessibleModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.element.modifier.clazz.inherit.ApsBinderModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Getter
@Accessors(fluent = true)
public class ApsBinderAst extends ApsAst implements ApsModifierRequiredAst<ApsBinderModifier> {
    @Setter
    private String nameIdentity;
    private final Map<ApsBinderModifierType, ApsBinderModifier> modifiers = ApricotCollectionFactor.hashMap();
    private ApsAccessibleModifier accessible = ApsAccessibleType.PUBLIC.generic();
    private final List<ApsBindingParameterAst> parameters = ApricotCollectionFactor.arrayList();
    private final List<ApsMethodAst> methods = ApricotCollectionFactor.arrayList();

    public ApsBinderAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("name", this.nameIdentity);
        json.put("accessible", this.accessible);

        JSONArray parameters = new JSONArray();
        for (ApsBindingParameterAst parameter : this.parameters) {
            JSONObject theParameter = new JSONObject();
            parameter.generateStructure(theParameter);
            parameters.add(theParameter);
        }
        json.put("parameters", parameters);

        // TODO
    }

    public void addMemberParameter(ApsBindingParameterAst parameterAst) {
        this.parameters.add(parameterAst);
    }

    public void addMethod(ApsMethodAst methodAst) {
        this.methods.add(methodAst);
    }

    @Override
    public Collection<ApsBinderModifier> modifierValues() {
        return this.modifiers.values();
    }

    public void addModifier(ApsBinderModifier modifier) {
        ApsBinderModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    @Override
    public void addAccessible(ApsAccessibleModifier modifier) {
        this.accessible = modifier;
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
    public void postprocess() {
        for (ApsBindingParameterAst parameterAst : this.parameters) {
            parameterAst.postprocess();
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.postprocess();
        }
    }

    @Override
    public void consequence() {
        for (ApsBindingParameterAst parameterAst : this.parameters) {
            parameterAst.consequence();
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.consequence();
        }
    }
}
