package com.github.cao.awa.apsars.tree.method.parameter;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamModifierType;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamDefaultValueModifier;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamModifier;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsMethodParameterDefaultValueAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.lang.TranslateTarget;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
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
import java.util.Map;

@Getter
@Accessors(fluent = true)
public class ApsMethodParamElementAst extends LanguageAst implements ModifierRequiredAst<ApsMethodParamModifier> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMethodParamElementAst");
    @Setter
    private String nameIdentity;
    @Setter
    private ApsArgTypeAst argType;
    private final Map<ApsMethodParamModifierType, ApsMethodParamModifier> modifiers = ApricotCollectionFactor.hashMap();

    public ApsMethodParamElementAst(LanguageAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("name", this.nameIdentity);

        JSONObject theArgType = new JSONObject();
        this.argType.generateStructure(theArgType);
        json.put("type", theArgType);
    }

    @Override
    public Collection<ApsMethodParamModifier> modifierValues() {
        return this.modifiers.values();
    }

    @Override
    public AccessibleModifier accessible() {
        return AccessibleType.PUBLIC.generic();
    }

    public void addModifier(ApsMethodParamModifier modifier) {
        ApsMethodParamModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    @Override
    public void addAccessible(AccessibleModifier modifier) {
        // Do nothing.
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps method parameter: " + this.nameIdentity);
        System.out.println(ident + "    |_ type: ");
        this.argType.print(ident + "        ");
        ApsMethodParameterDefaultValueAst presetValueAst = defaultValue();
        if (presetValueAst != null) {
            System.out.println(ident + "    |_ default value: " + LanguageTranslator.translate(TranslateTarget.JAVA, ApsarsTranslateElement.METHOD_PARAMETER_DEFAULT, presetValueAst));
        }
    }

    public ApsMethodParameterDefaultValueAst defaultValue() {
        ApsMethodParamDefaultValueModifier defaultValueModifier = (ApsMethodParamDefaultValueModifier) this.modifiers.get(ApsMethodParamModifierType.DEFAULT_VALUE);
        if (defaultValueModifier != null) {
            return defaultValueModifier.presetValueAst();
        }
        return null;
    }

    public void defaultValue(ApsMethodParameterDefaultValueAst apsPresetValueAst) {
        ApsMethodParamDefaultValueModifier defaultValueModifier = (ApsMethodParamDefaultValueModifier) this.modifiers.get(ApsMethodParamModifierType.DEFAULT_VALUE);
        if (defaultValueModifier != null) {
            defaultValueModifier.presetValueAst(apsPresetValueAst);
        }
    }

    public ApsVariableAst toLocalVariable() {
        ApsVariableAst variable = new ApsVariableAst(this);

        variable.reference(new ApsRefReferenceAst(variable).nameIdentity(this.nameIdentity));
        variable.defining(false);
        variable.type(argType());

        return variable;
    }

    @Override
    public void preprocess() {
        if (this.modifiers.get(ApsMethodParamModifierType.DEFAULT_VALUE) != null) {
            QuickManipulate.notNull(defaultValue(), value -> {
                if (!value.type().literal().equals(LanguageTranslator.translate(TranslateTarget.JAVA, ApsarsTranslateElement.ARG_TYPE, this.argType))) {
                    defaultValue(null);
                    LOGGER.warn("The preset value of method parameter '{}' is not type matched to '{}', got '{}'",
                            this.nameIdentity,
                            LanguageTranslator.translate(TranslateTarget.JAVA, ApsarsTranslateElement.ARG_TYPE, this.argType),
                            value.type().literal()
                    );
                }
            });
            if (defaultValue() != null) {
                findAst(ApsMethodAst.class).addCompilerFlag("parameters-has-default-value");
            }
        }

        if (this.argType.referencePrimary() == null) {
            this.argType = this.argType.varyPrimary();

            if (this.argType.referencePrimary() != null) {
                addModifier(ApsMethodParamModifierType.IS_FINAL.modifier());
            }
        }
    }

    @Override
    public void postprocess() {

    }

    @Override
    public void consequence() {

    }
}
