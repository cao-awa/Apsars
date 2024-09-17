package com.github.cao.awa.apsars.tree.clazz.inherit;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.vararg.ApsStatementWithVarargs;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

@Accessors(fluent = true)
public class ApsBindingParameterAst extends ApsStatementWithVarargs {
    private static final Logger LOGGER = LogManager.getLogger("ApsMemberParameterAst");
    @Setter
    @Getter
    private String nameIdentity;
    @Setter
    @Getter
    private ApsResultPresentingAst value;
    private final Map<ApsMemberParameterModifierType, ApsMemberParameterModifier> modifiers = ApricotCollectionFactor.hashMap();

    public ApsBindingParameterAst(ApsBinderAst parent) {
        super(parent);
    }

    public void addModifier(ApsMemberParameterModifier modifier) {
        ApsMemberParameterModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    public void removeModifier(ApsMemberParameterModifierType modifierType) {
        this.modifiers.remove(modifierType);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps member parameter: " + this.nameIdentity);
        System.out.println(ident + "    |_ type: ");
        argType().print(ident + "        ");
        System.out.println(ident + "    |_ value: " + (this.value == null ? "<UNSETTED>" : this.value));
        System.out.println(ident + "    |_ Aps member parameter modifier: ");
        ident += "        ";
        for (ApsMemberParameterModifier apsMemberParameterModifier : this.modifiers.values()) {
            System.out.println(ident + "|_ " + apsMemberParameterModifier.type() + ": " + apsMemberParameterModifier.literal());
        }
    }

    @Override
    public void preprocess() {

    }

    public boolean isStatic() {
        return this.modifiers.get(ApsMemberParameterModifierType.IS_STATIC) != null;
    }

    public boolean isFinal() {
        return this.modifiers.get(ApsMemberParameterModifierType.IS_FINAL) != null;
    }

    public ApsMemberParameterAst toActual(ApsClassAst classAst) {
        ApsMemberParameterAst memberParameterAst = new ApsMemberParameterAst(
                classAst
        );
        for (ApsMemberParameterModifier modifier : this.modifiers.values()) {
            memberParameterAst.addModifier(modifier);
        }

        memberParameterAst.nameIdentity(this.nameIdentity);
        memberParameterAst.argType(argType());
        memberParameterAst.value(this.value);

        return memberParameterAst;
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
