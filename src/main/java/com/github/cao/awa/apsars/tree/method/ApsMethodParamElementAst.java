package com.github.cao.awa.apsars.tree.method;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.method.ApsMethodParamModifierType;
import com.github.cao.awa.apsars.element.modifier.method.param.ApsMethodParamModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.sinuatum.function.ecception.consumer.ExceptingConsumer;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Map;

@Accessors(fluent = true)
public class ApsMethodParamElementAst extends ApsAst {
    @Setter
    @Getter
    private String nameIdentity;
    @Getter
    @Setter
    private String type;
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
        System.out.println(ident + "    |_ type: " + this.type);
    }

    @Override
    public String generateJava() {
        StringBuilder builder = new StringBuilder();

        ExceptingConsumer<ApsMethodParamModifier, Throwable> modifierBuilder = modifier -> {
            builder.append(modifier.literal());
            builder.append(" ");
        };

        // 设置修饰符
        for (ApsMethodParamModifierType modifierType : ApsMethodParamModifierType.values()) {
            Manipulate.notNull(this.modifiers.get(modifierType), modifierBuilder);
        }

        builder.append(this.type);
        builder.append(" ");
        builder.append(this.nameIdentity);
        return builder.toString();
    }

    @Override
    public void preprocess() {

    }
}
