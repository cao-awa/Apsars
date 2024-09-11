package com.github.cao.awa.apsars.tree.method;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsAccessibleModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamModifier;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodParamKeyword;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import com.github.cao.awa.apsars.tree.statement.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsReturnAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsCatchListAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsMethodExtraCatchAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsTryCatchAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

@Accessors(fluent = true)
public class ApsMethodAst extends ApsAst implements ApsModifierRequiredAst<ApsMethodModifier> {
    @Setter
    @Getter
    private String nameIdentity;
    @Getter
    @Setter
    private ApsArgTypeAst returnType;
    @Getter
    @Setter
    private ApsMethodParameterAst param;
    @Getter
    @Setter
    private ApsMethodBodyAst methodBody;
    @Getter
    @Setter
    private ApsMethodExtraCatchAst extraCatch;
    @Getter
    @Setter
    private boolean isBinder;
    @Getter
    @Setter
    private boolean isVirtual;
    private final Map<ApsMethodModifierType, ApsMethodModifier> modifiers = ApricotCollectionFactor.hashMap();
    @Getter
    @Setter
    private ApsAccessibleModifier accessible = ApsAccessibleType.PRIVATE.generic();
    private final Map<String, ApsAnnotationAst> annotations = ApricotCollectionFactor.hashMap();
    private final Set<String> compilerFlags = ApricotCollectionFactor.hashSet();

    public ApsMethodAst(ApsAst parent) {
        super(parent);
    }

    public void addModifier(ApsMethodModifier modifier) {
        ApsMethodModifier definedModifier = this.modifiers.get(modifier.type());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The modifier type '" + definedModifier.type() + "' already defined as '" + definedModifier.literal() + "'");
        }
        this.modifiers.put(modifier.type(), modifier);
    }

    @Override
    public void addAccessible(ApsAccessibleModifier modifier) {
        this.accessible = modifier;
    }

    public void addModifierIgnoredPresent(ApsMethodModifier modifier) {
        this.modifiers.put(modifier.type(), modifier);
    }

    public void removeModifier(ApsMethodModifierType modifierType) {
        this.modifiers.remove(modifierType);
    }

    public void addAnnotation(ApsAnnotationAst annotation) {
        ApsAnnotationAst definedModifier = this.annotations.get(annotation.nameIdentity());
        if (definedModifier != null) {
            throw new IllegalArgumentException("The annotation '" + annotation.nameIdentity() + "' already defined as '" + annotation + "'");
        }
        this.annotations.put(annotation.nameIdentity(), annotation);
    }

    public void addCompilerFlag(String... flag) {
        this.compilerFlags.addAll(List.of(flag));
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps method: " + this.nameIdentity);
        ident += "    ";
        if (!this.modifiers.isEmpty()) {
            System.out.println(ident + "|_ Aps method modifier: ");
            String modifierIdent = ident + "    ";
            this.modifiers.forEach((type, modifier) -> {
                System.out.println(modifierIdent + "|_ " + modifier.type() + ": " + modifier.literal());
            });
        }
        if (this.returnType == null) {
            System.out.println(ident + "|_ return type: void");
        } else {
            System.out.println(ident + "|_ return type: ");
            this.returnType.print(ident + "    ");
        }

        if (this.param != null && !this.param.names().isEmpty()) {
            System.out.println(ident + "|_ params: ");
            this.param.print(ident);
        }
        if (this.methodBody != null) {
            this.methodBody.print(ident);
        }
        if (this.extraCatch != null) {
            this.extraCatch.print(ident);
        }
        if (!this.compilerFlags.isEmpty()) {
            System.out.println(ident + "|_ compiler flags: ");
            for (String compilerFlag : this.compilerFlags) {
                System.out.println(ident + "    |_ " + compilerFlag);
            }
        }
        if (!this.annotations.isEmpty()) {
            System.out.println(ident + "|_ compiler flags: ");
            for (ApsAnnotationAst annotationAst : this.annotations.values()) {
                System.out.println(ident + "    |_ " + annotationAst.nameIdentity());
            }
        }
    }

    @Override
    public void generateJava(StringBuilder builder) {
        if (!this.annotations.isEmpty()) {
            for (ApsAnnotationAst annotationAst : this.annotations.values()) {
                annotationAst.generateJava(builder);
                builder.append(" ");
            }
        }

        if (!this.isBinder) {
            builder.append(this.accessible.getAccessibleType().literal());
            builder.append(" ");

            // 设置修饰符
            for (ApsMethodModifierType modifierType : ApsMethodModifierType.values()) {
                Manipulate.notNull(this.modifiers.get(modifierType), modifier -> {
                    if (modifier.isLiteral()) {
                        builder.append(modifier.literal());
                        builder.append(" ");
                    }
                });
            }
        }

        if (this.isBinder && !this.isVirtual) {
            builder.append("default ");
        }

        if (this.returnType == null) {
            builder.append("void");
        } else {
            this.returnType.generateJava(builder);
        }
        builder.append(" ");

        builder.append(this.nameIdentity);
        builder.append("(");
        if (this.param != null) {
            this.param.generateJava(builder);
        }
        builder.append(")");

        if (!this.isVirtual) {
            if (this.extraCatch == null) {
                if (this.methodBody == null) {
                    builder.append("{}");
                } else {
                    builder.append("{");
                    this.methodBody.generateJava(builder);
                    builder.append("}");
                }
            } else {
                this.extraCatch.generateJava(builder, (innerBuilder) -> {
                    if (this.methodBody != null) {
                        this.methodBody.generateJava(innerBuilder);
                    }
                });
            }
        } else {
            builder.append(";");
        }
    }

    @Override
    public void preprocess() {
        if (this.compilerFlags.contains("virtual-method")) {
            this.isVirtual = true;
        }

        if (this.modifiers.get(ApsMethodModifierType.IS_FINAL) != null) {
            if (findAst(ApsClassAst.class).isFinal()) {
                // 让生成的代码更简洁，class是final时方法设置final是多余的
                this.modifiers.remove(ApsMethodModifierType.IS_FINAL);
            }
        }

        if (this.modifiers.get(ApsMethodModifierType.SAFEPOINT) != null) {
            Map<ApsMethodModifierType, ApsMethodModifier> newMethodModifiers = ApricotCollectionFactor.hashMap(this.modifiers);
            newMethodModifiers.remove(ApsMethodModifierType.SAFEPOINT);

            String safepointMethod = this.nameIdentity + "$safepoint";

            ApsMethodAst newMethod = new ApsMethodAst(parent());
            newMethod.nameIdentity(safepointMethod);
            newMethod.methodBody(this.methodBody);
            newMethod.param(this.param);
            newMethod.extraCatch(this.extraCatch);
            newMethod.returnType(this.returnType);
            newMethod.addCompilerFlag("generated");
            newMethod.addCompilerFlag("safepoint");
            for (ApsMethodModifier modifier : newMethodModifiers.values()) {
                newMethod.addModifier(modifier);
            }
            findAst(ApsClassAst.class).addMethod(newMethod);

            ApsMethodBodyAst selfMethodBody = new ApsMethodBodyAst(this, null);
            ApsTryCatchAst safepointStatementAst = new ApsTryCatchAst(selfMethodBody, selfMethodBody);
            ApsMethodBodyAst safepointStatementMethodBody = new ApsMethodBodyAst(safepointStatementAst, null);
            ApsLiteralStatementAst threadSleepStatement = new ApsLiteralStatementAst(safepointStatementMethodBody, "Thread.sleep(0)");
            safepointStatementMethodBody.addStatement(threadSleepStatement);
            safepointStatementAst.methodBody(safepointStatementMethodBody);
            ApsCatchListAst catchListAst = new ApsCatchListAst(safepointStatementAst);
            catchListAst.addCatchTarget(new ApsArgTypeAst(null).nameIdentity("InterruptedException"));
            safepointStatementAst.catchList(catchListAst);

            StringBuilder paramBuilder = new StringBuilder();
            int index = 0;
            int edge = this.param.names().size() - 1;
            for (String name : this.param.names()) {
                paramBuilder.append(name);
                if (index != edge) {
                    paramBuilder.append(",");
                }
                index++;
            }

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            ApsLiteralStatementAst invokeStatementAst;
            if (this.returnType == null) {
                invokeStatementAst = new ApsLiteralStatementAst(selfMethodBody, safepointMethod + "(" + paramBuilder + ")");
            } else {
                invokeStatementAst = new ApsLiteralStatementAst(selfMethodBody, this.returnType.generateJava() + " result=" + safepointMethod + "(" + paramBuilder + ")");
            }

            selfMethodBody.addStatement(invokeStatementAst);
            selfMethodBody.addStatement(safepointStatementAst);
            if (this.returnType != null) {
                ApsLiteralStatementAst returnStatementAst = new ApsLiteralStatementAst(selfMethodBody, "return result");
                selfMethodBody.addStatement(returnStatementAst);
            }
            methodBody(selfMethodBody);

            extraCatch(null);
        }

        if (this.modifiers.get(ApsMethodModifierType.NULLSAFE) != null) {
            addCompilerFlag("null-safe");
        }

        Manipulate.notNull(this.param, ApsMethodParameterAst::preprocess);
        Manipulate.notNull(this.methodBody, ApsMethodBodyAst::preprocess);
        Manipulate.notNull(this.extraCatch, ApsMethodExtraCatchAst::preprocess);
    }

    public static ApsMethodAst virtual(String nameIdentity, ApsArgTypeAst rType, Function<ApsMethodAst, ApsMethodParameterAst> param, ApsAst parentAst) {
        ApsMethodAst methodAst = new ApsMethodAst(
                parentAst
        );
        methodAst.nameIdentity(nameIdentity);
        methodAst.returnType(rType);
        methodAst.param(param.apply(methodAst));
        methodAst.isVirtual(true);
        methodAst.isBinder(true);

        return methodAst;
    }

    public static ApsMethodAst accessor(String nameIdentity, ApsArgTypeAst type, boolean isGetter, boolean isStatic, boolean isPublic, ApsAst parentAst) {
        if (isGetter) {
            ApsMethodAst methodAst = new ApsMethodAst(
                    parentAst
            );
            methodAst.returnType(type);
            methodAst.nameIdentity(nameIdentity);
            methodAst.accessible(isPublic ? ApsAccessibleType.PUBLIC.generic() : ApsAccessibleType.PRIVATE.generic());
            ApsMethodBodyAst methodBodyAst = new ApsMethodBodyAst(methodAst, null);
            ApsReturnAst returnAst = new ApsReturnAst(methodBodyAst);
            returnAst.result(
                    new ApsResultPresentingAst(returnAst).refToken(
                            (isStatic ? "" : "this.") + nameIdentity
                    )
            ).withEnd(true);
            methodBodyAst.addStatement(returnAst);
            methodAst.methodBody(methodBodyAst);
            return methodAst;
        } else {
            ApsMethodAst methodAst = new ApsMethodAst(
                    parentAst
            );
            methodAst.nameIdentity(nameIdentity);
            methodAst.addAccessible(isPublic ? ApsAccessibleType.PUBLIC : ApsAccessibleType.PRIVATE);
            ApsMethodBodyAst methodBodyAst = new ApsMethodBodyAst(methodAst, null);
            ApsVariableAst variableAst = new ApsVariableAst(methodAst);
            variableAst.nameIdentity(
                            (isStatic ? "" : "this.") + nameIdentity
                    )
                    .defining(false)
                    .assignment(
                            new ApsResultPresentingAst(variableAst).refToken(nameIdentity + "_")
                    )
                    .withEnd(true);
            ApsMethodParameterAst methodParamAst = new ApsMethodParameterAst(methodAst);
            ApsMethodParamElementAst methodParamElementAst = new ApsMethodParamElementAst(methodParamAst);
            methodParamElementAst.addModifier(ApsMethodParamModifier.create(ApsMethodParamKeyword.VAL));
            methodParamElementAst.argType(type);
            methodParamElementAst.nameIdentity(nameIdentity + "_");
            methodParamAst.addParam(methodParamElementAst);
            methodAst.param(methodParamAst);
            methodBodyAst.addStatement(variableAst);
            methodAst.methodBody(methodBodyAst);
            return methodAst;
        }
    }

    public static ApsMethodAst createByTemplate(String name, Function<ApsMethodAst, ApsMethodBodyAst> bodyGenerator, ApsAst parent) {
        ApsMethodAst methodAst = new ApsMethodAst(parent);
        switch (name) {
            case "main" -> {
                methodAst.nameIdentity("main");
                ApsMethodParameterAst parameters = new ApsMethodParameterAst(methodAst);
                ApsMethodParamElementAst stringArgsElement = new ApsMethodParamElementAst(parameters);
                parameters.addParam(stringArgsElement.argType(
                                new ApsArgTypeAst(stringArgsElement)
                                        .nameIdentity("String")
                                        .arrayArgType(true)
                        ).nameIdentity("args")
                );
                methodAst.addModifier(ApsMethodModifier.create(ApsMethodKeyword.STATIC));
                methodAst.accessible(ApsAccessibleType.PUBLIC.generic());
                methodAst.param(parameters);
                methodAst.methodBody(bodyGenerator.apply(methodAst));
            }
        }
        return methodAst;
    }
}
