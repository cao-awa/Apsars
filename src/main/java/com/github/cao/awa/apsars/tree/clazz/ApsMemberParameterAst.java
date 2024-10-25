package com.github.cao.awa.apsars.tree.clazz;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsStatementWithVarargs;
import com.github.cao.awa.language.translator.translate.tree.modifier.ModifierRequiredAst;
import com.github.cao.awa.language.translator.translate.tree.modifier.accessible.AccessibleModifier;
import com.github.cao.awa.language.translator.translate.tree.modifier.accessible.AccessibleType;
import com.github.cao.awa.sinuatum.manipulate.QuickManipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Getter
@Accessors(fluent = true)
public class ApsMemberParameterAst extends ApsStatementWithVarargs implements ModifierRequiredAst<ApsMemberParameterModifier> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMemberParameterAst");
    @Getter
    private ApsVariableAst variable;
    @Setter
    private String nameIdentity;
    @Setter
    private ApsResultPresentingAst value;
    @Setter
    private AccessibleModifier accessible = AccessibleType.PRIVATE.generic();
    private final Map<ApsMemberParameterModifierType, ApsMemberParameterModifier> modifiers = ApricotCollectionFactor.hashMap();

    public ApsMemberParameterAst(ApsClassAst parent) {
        super(parent);
        withEnd(true);
    }

    @Override
    public Collection<ApsMemberParameterModifier> modifierValues() {
        return this.modifiers.values();
    }

    public void addModifier(ApsMemberParameterModifier modifier) {
        ApsMemberParameterModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    @Override
    public void addAccessible(AccessibleModifier modifier) {
        this.accessible = modifier;
    }

    public void addModifierIgnoredPresent(ApsMemberParameterModifier modifier) {
        this.modifiers.put(modifier.type(), modifier);
    }

    public void removeModifier(ApsMemberParameterModifierType modifierType) {
        this.modifiers.remove(modifierType);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("name", this.nameIdentity);

        JSONObject theArgType = new JSONObject();
        argType().generateStructure(theArgType);
        json.put("type", theArgType);

        json.put("accessible", this.accessible.getAccessibleType().literal());

        if (this.value != null) {
            JSONObject theValue = new JSONObject();
            this.value.generateStructure(theValue);
            json.put("value", theValue);
        }
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps member parameter: " + this.nameIdentity);
        System.out.println(ident + ".   |_ type: ");
        argType().print(ident + ".   |   ");
        if (this.value == null) {
            System.out.println(ident + ".   |_ value: " + "<UNSETTED>");
        } else {
            System.out.print(ident + ".   |_ value: ");
            this.value.print(ident + ".   |");
        }
        System.out.println(ident + ".   |_ Aps member parameter modifier: ");
        ident += ".        ";
        for (ApsMemberParameterModifier apsMemberParameterModifier : this.modifiers.values()) {
            System.out.println(ident + "|_ " + apsMemberParameterModifier.type() + ": " + apsMemberParameterModifier.literal());
        }
    }

    @Override
    public void preprocess() {
        if (this.modifiers.get(ApsMemberParameterModifierType.HOLDER) != null) {
            this.modifiers.remove(ApsMemberParameterModifierType.HOLDER_GET);
            this.modifiers.remove(ApsMemberParameterModifierType.HOLDER_SET);
        }

        this.variable = new ApsVariableAst(this)
                .reference(new ApsRefReferenceAst(this).nameIdentity(
                                this.nameIdentity
                        ).type(argType())
                )
                .type(argType())
                .defining(true)
                .assignment(this.value)
                .instanceReference(true)
                .doNotProcess(true);

        for (ApsMemberParameterModifierType modifierType : List.of(ApsMemberParameterModifierType.HOLDER, ApsMemberParameterModifierType.HOLDER_GET, ApsMemberParameterModifierType.HOLDER_SET)) {
            QuickManipulate.notNull(this.modifiers.get(modifierType), modifier -> {
                switch (modifierType) {
                    case HOLDER -> {
                        appendGetHolder();
                        appendSetHolder();
                    }
                    case HOLDER_GET -> appendGetHolder();
                    case HOLDER_SET -> appendSetHolder();
                }
            });
        }

        if (this.value != null) {
            this.value.preprocess();
        }
    }

    @Override
    public void postprocess() {
        if (this.value != null) {
            this.value.postprocess();
        }
    }

    @Override
    public void consequence() {
        if (this.value != null) {
            this.value.consequence();
        }
    }

    private void appendGetHolder() {
        if (findAst(ApsClassAst.class) instanceof ApsClassAst classAst) {
            ApsMethodAst methodAst = ApsMethodAst.accessor(nameIdentity(), argType(), true, isStatic(), true, classAst);
            methodAst.addCompilerFlag("holder-set", "generated");
            if (isPublic()) {
                methodAst.addCompilerFlag("try-inline");
            }
            if (!isHolderOverridable()) {
                methodAst.addModifier(ApsMethodModifier.create(ApsMethodKeyword.FINAL));
            }
            classAst.addMethod(methodAst);
        }
    }

    private void appendSetHolder() {
        if (isFinal()) {
            LOGGER.warn("The member parameter '{}' is final, cannot generate the setter", this.nameIdentity);
            return;
        }
        if (findAst(ApsClassAst.class) instanceof ApsClassAst classAst) {
            ApsMethodAst methodAst = ApsMethodAst.accessor(nameIdentity(), argType(), false, isStatic(), true, classAst);
            methodAst.addCompilerFlag("holder-get", "generated");
            if (isPublic()) {
                methodAst.addCompilerFlag("try-inline");
            }
            if (!isHolderOverridable()) {
                methodAst.addModifier(ApsMethodModifier.create(ApsMethodKeyword.FINAL));
            }
            classAst.addMethod(methodAst);
        }
    }

    public boolean isStatic() {
        return this.modifiers.get(ApsMemberParameterModifierType.IS_STATIC) != null;
    }

    public boolean isFinal() {
        return this.modifiers.get(ApsMemberParameterModifierType.IS_FINAL) != null;
    }

    public boolean isPublic() {
        return this.accessible.getAccessibleType() == AccessibleType.PUBLIC;
    }

    public boolean isPrivate() {
        return this.accessible.getAccessibleType() == AccessibleType.PRIVATE;
    }

    public boolean isHolderOverridable() {
        return this.modifiers.get(ApsMemberParameterModifierType.OVERRIDABLE) != null;
    }

    public void processConflictModifiers() {
        if (this.modifiers.get(ApsMemberParameterModifierType.VOLATILE) != null) {
            if (this.modifiers.get(ApsMemberParameterModifierType.IS_FINAL) != null) {
                LOGGER.warn("The volatile modifier do not compatible to final modifier, final been be removed");
                this.modifiers.remove(ApsMemberParameterModifierType.IS_FINAL);
            }
        }
    }
}
