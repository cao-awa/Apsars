package com.github.cao.awa.apsars.tree.method.parameter;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamModifierType;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamDefaultValueModifier;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsPresetValueAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsPresetValueElementAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

@Accessors(fluent = true)
public class ApsMethodParamElementAst extends ApsAst {
    private static final Logger LOGGER = LogManager.getLogger("ApsMethodParamElementAst");
    @Setter
    @Getter
    private String nameIdentity;
    @Getter
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
        ApsPresetValueElementAst presetValueAst = defaultValue();
        if (presetValueAst != null) {
            System.out.println(ident + "    |_ default value: " + presetValueAst.generateJava());
        }
    }

    @Override
    public String generateJava() {
        StringBuilder builder = new StringBuilder();

        // 设置修饰符
        for (ApsMethodParamModifierType modifierType : ApsMethodParamModifierType.values()) {
            Manipulate.notNull(this.modifiers.get(modifierType), modifier -> {
                if (modifier.isLiteral()) {
                    builder.append(modifier.literal());
                    builder.append(" ");
                }
            });
        }

        if (this.argType != null && this.nameIdentity != null) {
            builder.append(this.argType.generateJava());
            builder.append(" ");
            builder.append(this.nameIdentity);
        }
        return builder.toString();
    }

    public ApsPresetValueElementAst defaultValue() {
        ApsMethodParamDefaultValueModifier defaultValueModifier = (ApsMethodParamDefaultValueModifier) this.modifiers.get(ApsMethodParamModifierType.DEFAULT_VALUE);
        if (defaultValueModifier != null) {
            return defaultValueModifier.presetValueAst();
        }
        return null;
    }

    public void defaultValue(ApsPresetValueElementAst apsPresetValueAst) {
        ApsMethodParamDefaultValueModifier defaultValueModifier = (ApsMethodParamDefaultValueModifier) this.modifiers.get(ApsMethodParamModifierType.DEFAULT_VALUE);
        if (defaultValueModifier != null) {
            defaultValueModifier.presetValueAst(apsPresetValueAst);
        }
    }

    @Override
    public void preprocess() {
        if (this.modifiers.get(ApsMethodParamModifierType.DEFAULT_VALUE) != null) {
            Manipulate.notNull(defaultValue(), value -> {
                if (!value.type().literal().equals(this.argType.generateJava())) {
                    defaultValue(null);
                    LOGGER.warn("The preset value of method parameter '{}' is not type matched to '{}', got '{}'",
                            this.nameIdentity,
                            this.argType.generateJava(),
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
