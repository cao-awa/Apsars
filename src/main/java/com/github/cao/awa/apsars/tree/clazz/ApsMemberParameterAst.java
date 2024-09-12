package com.github.cao.awa.apsars.tree.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsAccessibleModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.vararg.ApsAstWithVarargs;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

@Accessors(fluent = true)
public class ApsMemberParameterAst extends ApsAstWithVarargs implements ApsModifierRequiredAst<ApsMemberParameterModifier> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMemberParameterAst");

    @Setter
    @Getter
    private String nameIdentity;
    @Setter
    @Getter
    private ApsResultPresentingAst value;
    @Getter
    @Setter
    private ApsAccessibleModifier accessible = ApsAccessibleType.PRIVATE.generic();
    private final Map<ApsMemberParameterModifierType, ApsMemberParameterModifier> modifiers = ApricotCollectionFactor.hashMap();

    public ApsMemberParameterAst(ApsClassAst parent) {
        super(parent);
    }

    public void addModifier(ApsMemberParameterModifier modifier) {
        ApsMemberParameterModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    @Override
    public void addAccessible(ApsAccessibleModifier modifier) {
        this.accessible = modifier;
    }

    public void addModifierIgnoredPresent(ApsMemberParameterModifier modifier) {
        this.modifiers.put(modifier.type(), modifier);
    }

    public void removeModifier(ApsMemberParameterModifierType modifierType) {
        this.modifiers.remove(modifierType);
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
    public void generateJava(StringBuilder builder) {
        processConflictModifiers();

        builder.append(this.accessible.getAccessibleType().literal());
        builder.append(" ");

        // 设置修饰符
        for (ApsMemberParameterModifierType modifierType : ApsMemberParameterModifierType.values()) {
            Manipulate.notNull(this.modifiers.get(modifierType), modifier -> {
                if (modifier.isLiteral()) {
                    builder.append(modifier.literal());
                    builder.append(" ");
                }
            });
        }

        super.generateJava(builder);
        builder.append(" ");
        builder.append(this.nameIdentity);
        if (this.value != null) {
            builder.append("=");
            this.value.generateJava(builder);
        }
        builder.append(";");
    }

    @Override
    public void preprocess() {
        if (this.modifiers.get(ApsMemberParameterModifierType.HOLDER) != null) {
            this.modifiers.remove(ApsMemberParameterModifierType.HOLDER_GET);
            this.modifiers.remove(ApsMemberParameterModifierType.HOLDER_SET);
        }

        for (ApsMemberParameterModifierType modifierType : List.of(ApsMemberParameterModifierType.HOLDER, ApsMemberParameterModifierType.HOLDER_GET, ApsMemberParameterModifierType.HOLDER_SET)) {
            Manipulate.notNull(this.modifiers.get(modifierType), modifier -> {
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
        return this.accessible.getAccessibleType() == ApsAccessibleType.PUBLIC;
    }

    public boolean isPrivate() {
        return this.accessible.getAccessibleType() == ApsAccessibleType.PRIVATE;
    }

    public boolean isHolderOverridable() {
        return this.modifiers.get(ApsMemberParameterModifierType.OVERRIDABLE) != null;
    }

    private void processConflictModifiers() {
        if (this.modifiers.get(ApsMemberParameterModifierType.VOLATILE) != null) {
            if (this.modifiers.get(ApsMemberParameterModifierType.IS_FINAL) != null) {
                LOGGER.warn("The volatile modifier do not compatible to final modifier, final been be removed");
                this.modifiers.remove(ApsMemberParameterModifierType.IS_FINAL);
            }
        }
    }
}
