package com.github.cao.awa.apsars.tree.clazz;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.clazz.ApsClassModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsAccessibleModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassModifier;
import com.github.cao.awa.apsars.translate.java.pool.ApsarsClassPool;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBindingParameterAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
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
    private final List<ApsAnnotationAst> annotations = ApricotCollectionFactor.arrayList();

    public ApsClassAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("name", this.nameIdentity);
        json.put("accessible", this.accessible.getAccessibleType().literal());

        if (!this.modifiers.isEmpty()) {
            JSONArray modifiers = new JSONArray();
            for (ApsClassModifier modifier : this.modifiers.values()) {
                modifiers.add(modifier.literal());
            }
            json.put("modifiers", modifiers);
        }

        if (!this.parameters.isEmpty()) {
            JSONObject parameters = new JSONObject();
            for (ApsMemberParameterAst parameter : this.parameters) {
                JSONObject theParameter = new JSONObject();
                parameter.generateStructure(theParameter);
                parameters.put(parameter.nameIdentity(), theParameter);
            }
            json.put("parameters", parameters);
        }

        if (!this.methods.isEmpty()) {
            JSONObject methods = new JSONObject();
            for (ApsMethodAst method : this.methods) {
                JSONObject theMethod = new JSONObject();
                method.generateStructure(theMethod);
                methods.put(method.formatCompletedName(), theMethod);
            }
            json.put("methods", methods);
        }

        if (!this.binders.isEmpty()) {
            JSONObject binders = new JSONObject();
            for (ApsBinderAst binder : this.binders) {
                JSONObject theBinder = new JSONObject();
                binder.generateStructure(theBinder);
                binders.put(binder.nameIdentity(), theBinder);
            }
            json.put("binders", binders);
        }

        if (!this.lets.isEmpty()) {
            JSONArray lets = new JSONArray();
            for (ApsLetAst let : this.lets) {
                JSONObject theLet = new JSONObject();
                let.generateStructure(theLet);
                lets.add(theLet);
            }
            json.put("lets", lets);
        }

        if (!this.annotations.isEmpty()) {
            JSONObject annotations = new JSONObject();
            for (ApsAnnotationAst annotation : this.annotations) {
                JSONObject theAnnotation = new JSONObject();
                annotation.generateStructure(theAnnotation);
                annotations.put(annotation.nameIdentity(), theAnnotation);
            }
            json.put("annotations", annotations);
        }
    }

    public boolean isAnnotationPresent(String fullName) {
        return this.annotations.contains(ApsarsClassPool.annotation(fullName));
    }

    public void addAnnotation(ApsAnnotationAst annotationAst) {
        this.annotations.add(annotationAst);
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

    public ApsMethodAst findMethod(String name, Collection<ApsArgTypeAst> args) {
        for (ApsMethodAst method : this.methods) {
            if (!method.nameIdentity().equals(name)) {
                continue;
            }

            for (ApsMethodParamElementAst value : method.param().params().values()) {
                if (!value.argType().equals(args)) {
                    break;
                }
            }

            return method;
        }

        return null;
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

    public String formatCompletedName() {
        return this.nameIdentity;
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
        if (!this.binders.isEmpty()) {
            System.out.println(ident + concat + "   |_ binders: " + this.binders);
        }
        if (!this.annotations.isEmpty()) {
            System.out.println(ident + concat + "   |_ annotations: " + this.annotations);
        }
        System.out.println(ident + concat + "   |_ methods: ");
        int i = 1;
        for (ApsMethodAst method : this.methods) {
            method.print(ident + concat + "       ", i++ == this.methods.size());
        }
    }

    @Override
    public void preprocess() {
        for (ApsMemberParameterAst parameterAst : this.parameters) {
            parameterAst.parent(this);
            parameterAst.preprocess();
        }

        for (ApsAnnotationAst annotation : this.annotations) {
            annotation.parent(this);
            annotation.preprocess();
        }

        for (ApsLetAst let : this.lets) {
            let.parent(this);
            let.preprocess();
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.parent(this);
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

    @Override
    public void postprocess() {
        for (ApsMemberParameterAst parameterAst : this.parameters) {
            parameterAst.postprocess();
        }

        for (ApsAnnotationAst annotation : this.annotations) {
            annotation.postprocess();
        }

        for (ApsLetAst let : this.lets) {
            let.postprocess();
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.postprocess();
        }

        if (!this.binders.isEmpty()) {
            for (ApsBinderAst binder : findAst(ApsClassAst.class).binders()) {
                for (ApsBindingParameterAst parameter : binder.parameters()) {
                    parameter.postprocess();
                }
            }
        }
    }

    @Override
    public void consequence() {
        for (ApsMemberParameterAst parameterAst : this.parameters) {
            parameterAst.consequence();
        }

        for (ApsAnnotationAst annotation : this.annotations) {
            annotation.consequence();
        }

        for (ApsLetAst let : this.lets) {
            let.consequence();
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.consequence();
        }

        if (!this.binders.isEmpty()) {
            for (ApsBinderAst binder : findAst(ApsClassAst.class).binders()) {
                for (ApsBindingParameterAst parameter : binder.parameters()) {
                    parameter.consequence();
                }
            }
        }
    }
}
