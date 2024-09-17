package com.github.cao.awa.apsars.tree.method.parameter;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamModifierType;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamDefaultValueModifier;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamModifier;
import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsMethodParameterDefaultValueAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

@Getter
@Accessors(fluent = true)
public class ApsMethodParamElementAst extends ApsAst {
    private static final Logger LOGGER = LogManager.getLogger("ApsMethodParamElementAst");
    @Setter
    private String nameIdentity;
    @Setter
    private ApsArgTypeAst argType;
    private final Map<ApsMethodParamModifierType, ApsMethodParamModifier> modifiers = ApricotCollectionFactor.hashMap();

    public ApsMethodParamElementAst(ApsAst parent) {
        super(parent);
    }

    public void addModifier(ApsMethodParamModifier modifier) {
        ApsMethodParamModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps method parameter: " + this.nameIdentity);
        System.out.println(ident + "    |_ type: ");
        this.argType.print(ident + "        ");
        ApsMethodParameterDefaultValueAst presetValueAst = defaultValue();
        if (presetValueAst != null) {
            System.out.println(ident + "    |_ default value: " + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.METHOD_PARAMETER_DEFAULT, presetValueAst));
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

    @Override
    public void preprocess() {
        if (this.modifiers.get(ApsMethodParamModifierType.DEFAULT_VALUE) != null) {
            Manipulate.notNull(defaultValue(), value -> {
                if (!value.type().literal().equals(ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.ARG_TYPE, this.argType))) {
                    defaultValue(null);
                    LOGGER.warn("The preset value of method parameter '{}' is not type matched to '{}', got '{}'",
                            this.nameIdentity,
                            ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.ARG_TYPE, this.argType),
                            value.type().literal()
                    );
                }
            });
            if (defaultValue() != null) {
                findAst(ApsMethodAst.class).addCompilerFlag("parameters-has-default-value");
            }
        }
    }
}
