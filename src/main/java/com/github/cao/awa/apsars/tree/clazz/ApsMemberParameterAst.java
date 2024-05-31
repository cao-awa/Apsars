package com.github.cao.awa.apsars.tree.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.method.param.ApsMethodParamModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMemberParameterKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMethodKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMethodParamKeyword;
import com.github.cao.awa.apsars.tree.method.ApsMethodParamAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsAstWithVarargs;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

@Accessors(fluent = true)
public class ApsMemberParameterAst extends ApsAstWithVarargs {
    private static final Logger LOGGER = LogManager.getLogger("ApsMemberParameterAst");

    @Setter
    @Getter
    private String nameIdentity;
    @Setter
    @Getter
    private String value;
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
    public String generateJava() {
        StringBuilder builder = new StringBuilder();

        processConflictModifiers();

        // 设置修饰符
        for (ApsMemberParameterModifierType modifierType : ApsMemberParameterModifierType.values()) {
            Manipulate.notNull(this.modifiers.get(modifierType), modifier -> {
                if (modifier.isLiteral()) {
                    builder.append(modifier.literal());
                    builder.append(" ");
                }
            });
        }

        builder.append(super.generateJava());
        builder.append(" ");
        builder.append(this.nameIdentity);
        if (this.value != null) {
            builder.append("=");
            builder.append(this.value);
        }
        builder.append(";");
        return builder.toString();
    }

    @Override
    public void preprocess() {
        if (this.modifiers.get(ApsMemberParameterModifierType.ACCESSIBLE) == null) {
            this.modifiers.put(ApsMemberParameterModifierType.ACCESSIBLE, ApsMemberParameterModifier.create(ApsMemberParameterKeyword.PRIVATE));
        }

        if (this.modifiers.get(ApsMemberParameterModifierType.HOLDER) != null) {
            this.modifiers.remove(ApsMemberParameterModifierType.HOLDER_GET);
            this.modifiers.remove(ApsMemberParameterModifierType.HOLDER_SET);
        }

        for (ApsMemberParameterModifierType modifierType : ApsMemberParameterModifierType.values()) {
            Manipulate.notNull(this.modifiers.get(modifierType), modifier -> {
                if (!modifier.isLiteral()) {
                    switch (modifierType) {
                        case HOLDER -> {
                            appendGetHolder();
                            appendSetHolder();
                        }
                        case HOLDER_GET -> appendGetHolder();
                        case HOLDER_SET -> appendSetHolder();
                    }
                }
            });
        }
    }

    private void appendGetHolder() {
        if (findAst(ApsClassAst.class) instanceof ApsClassAst classAst) {
            ApsMethodAst methodAst = new ApsMethodAst(
                    classAst
            );
            methodAst.returnType(argType());
            methodAst.nameIdentity(this.nameIdentity);
            methodAst.addModifier(ApsMethodModifier.create(ApsMethodKeyword.PUBLIC));
            methodAst.addCompilerFlag("holder-set", "generated");
            if (isPublic()) {
                methodAst.addCompilerFlag("try-inline");
            }
            if (!isHolderOverridable()) {
                methodAst.addModifier(ApsMethodModifier.create(ApsMethodKeyword.FINAL));
            }
            ApsMethodBodyAst methodBodyAst = new ApsMethodBodyAst(methodAst);
            ApsStatementAst statementAst = new ApsStatementAst(
                    methodBodyAst,
                    "return " + (isStatic() ? "" : "this.") + this.nameIdentity
            );
            methodBodyAst.addStatement(statementAst);
            methodAst.methodBody(methodBodyAst);
            classAst.addMethod(methodAst);
        }
    }

    private void appendSetHolder() {
        if (isFinal()) {
            LOGGER.warn("The member parameter '{}' is final, cannot generate the setter", this.nameIdentity);
            return;
        }
        if (findAst(ApsClassAst.class) instanceof ApsClassAst classAst) {
            ApsMethodAst methodAst = new ApsMethodAst(
                    classAst
            );
            methodAst.nameIdentity(this.nameIdentity);
            methodAst.addModifier(ApsMethodModifier.create(ApsMethodKeyword.PUBLIC));
            methodAst.addCompilerFlag("holder-get", "generated");
            if (isPublic()) {
                methodAst.addCompilerFlag("try-inline");
            }
            if (!isHolderOverridable()) {
                methodAst.addModifier(ApsMethodModifier.create(ApsMethodKeyword.FINAL));
            }
            ApsMethodBodyAst methodBodyAst = new ApsMethodBodyAst(methodAst);
            ApsStatementAst statementAst = new ApsStatementAst(
                    methodBodyAst,
                    (isStatic() ? "" : "this.") + this.nameIdentity + "=" + this.nameIdentity + "_"
            );
            ApsMethodParamAst methodParamAst = new ApsMethodParamAst(methodAst);
            ApsMethodParamElementAst methodParamElementAst = new ApsMethodParamElementAst(methodParamAst);
            methodParamElementAst.addModifier(ApsMethodParamModifier.create(ApsMethodParamKeyword.FINAL));
            methodParamElementAst.argType(argType());
            methodParamElementAst.nameIdentity(this.nameIdentity + "_");
            methodParamAst.addParam(methodParamElementAst);
            methodAst.param(methodParamAst);
            methodBodyAst.addStatement(statementAst);
            methodAst.methodBody(methodBodyAst);
            classAst.addMethod(methodAst);
        }
    }

    private boolean isStatic() {
        return this.modifiers.get(ApsMemberParameterModifierType.IS_STATIC) != null;
    }

    private boolean isFinal() {
        return this.modifiers.get(ApsMemberParameterModifierType.IS_FINAL) != null;
    }

    private boolean isPublic() {
        return this.modifiers.get(ApsMemberParameterModifierType.ACCESSIBLE).literal().equals("public");
    }

    private boolean isPrivate() {
        return this.modifiers.get(ApsMemberParameterModifierType.ACCESSIBLE).literal().equals("private");
    }

    private boolean isHolderOverridable() {
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
