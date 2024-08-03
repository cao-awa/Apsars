package com.github.cao.awa.apsars.tree.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.clazz.ApsMemberParameterModifierType;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsMemberParameterKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodParamKeyword;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
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
    public void generateJava(StringBuilder builder) {
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

        super.generateJava(builder);
        builder.append(" ");
        builder.append(this.nameIdentity);
        if (this.value != null) {
            builder.append("=");
            builder.append(this.value);
        }
        builder.append(";");
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
            ApsMethodBodyAst methodBodyAst = new ApsMethodBodyAst(methodAst, null);
            ApsLiteralStatementAst statementAst = new ApsLiteralStatementAst(
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
            ApsMethodBodyAst methodBodyAst = new ApsMethodBodyAst(methodAst, null);
            ApsLiteralStatementAst statementAst = new ApsLiteralStatementAst(
                    methodBodyAst,
                    (isStatic() ? "" : "this.") + this.nameIdentity + "=" + this.nameIdentity + "_"
            );
            ApsMethodParameterAst methodParamAst = new ApsMethodParameterAst(methodAst);
            ApsMethodParamElementAst methodParamElementAst = new ApsMethodParamElementAst(methodParamAst);
            methodParamElementAst.addModifier(ApsMethodParamModifier.create(ApsMethodParamKeyword.VAL));
            methodParamElementAst.argType(argType());
            methodParamElementAst.nameIdentity(this.nameIdentity + "_");
            methodParamAst.addParam(methodParamElementAst);
            methodAst.param(methodParamAst);
            methodBodyAst.addStatement(statementAst);
            methodAst.methodBody(methodBodyAst);
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
        return this.modifiers.get(ApsMemberParameterModifierType.ACCESSIBLE).literal().equals("public");
    }

    public boolean isPrivate() {
        return this.modifiers.get(ApsMemberParameterModifierType.ACCESSIBLE).literal().equals("private");
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
