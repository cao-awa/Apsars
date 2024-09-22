package com.github.cao.awa.apsars.tree.method;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsAccessibleModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamModifier;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodParamKeyword;
import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.java.pool.ApsarsClassPool;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
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

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

@Getter
@Accessors(fluent = true)
public class ApsMethodAst extends ApsAst implements ApsModifierRequiredAst<ApsMethodModifier> {
    @Setter
    private String nameIdentity;
    @Setter
    private ApsArgTypeAst returnType;
    @Setter
    private ApsMethodParameterAst param;
    @Setter
    private ApsMethodBodyAst methodBody;
    @Setter
    private ApsMethodExtraCatchAst extraCatch;
    @Setter
    private boolean isBinder;
    @Setter
    private boolean isVirtual;
    @Setter
    private boolean isConstructor;
    private final Map<ApsMethodModifierType, ApsMethodModifier> modifiers = ApricotCollectionFactor.hashMap();
    @Setter
    private ApsAccessibleModifier accessible = ApsAccessibleType.PRIVATE.generic();
    private final Set<ApsAnnotationAst> annotations = ApricotCollectionFactor.hashSet();
    private final Set<String> compilerFlags = ApricotCollectionFactor.hashSet();

    public ApsMethodAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("name", this.nameIdentity);

        if (!this.param.isEmpty()) {
            JSONObject parameters = new JSONObject();
            this.param.params().forEach((param) -> {
                JSONObject theParameter = new JSONObject();
                param.generateStructure(theParameter);
                parameters.put(param.nameIdentity(), theParameter);
            });
            json.put("parameters", parameters);
        }

        json.put("accessible", this.accessible.getAccessibleType().literal());

        if (this.isVirtual) {
            json.put("is_virtual", true);
        }

        if (this.isBinder) {
            json.put("is_binder", true);
        }

        if (this.returnType != null) {
            JSONObject theReturn = new JSONObject();
            this.returnType.generateStructure(theReturn);
            json.put("return_type", theReturn);
        }

        if (!this.methodBody.isEmpty()) {
            JSONObject theBody = new JSONObject();
            this.methodBody.generateStructure(theBody);
            json.put("method_body", theBody);
        }

        if (this.extraCatch != null) {
            JSONObject theExtraCatch = new JSONObject();
            this.extraCatch.generateStructure(theExtraCatch);
            json.put("extra_catch", theExtraCatch);
        }

        if (!this.compilerFlags.isEmpty()) {
            json.put("compiler_flags", this.compilerFlags);
        }
    }

    @Override
    public Collection<ApsMethodModifier> modifierValues() {
        return this.modifiers.values();
    }

    public void addModifier(@Nullable ApsMethodModifier modifier) {
        if (modifier == null) {
            return;
        }
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
        this.annotations.add(annotation);
    }

    public void addCompilerFlag(String... flag) {
        this.compilerFlags.addAll(List.of(flag));
    }

    public void addCompilerFlag(Collection<String> flag) {
        this.compilerFlags.addAll(flag);
    }

    public boolean hasExtraCatch() {
        return this.extraCatch != null;
    }

    public String formatCompletedName() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.nameIdentity);
        if (!this.param.isEmpty()) {
            builder.append("(");
            int index = 0;
            int edge = this.param.params().size() - 1;
            for (ApsMethodParamElementAst value : this.param.params()) {
                builder.append(value.argType().formatCompletedName());
                if (edge != index) {
                    builder.append(",");
                }
                index++;
            }
            builder.append(")");
        }
        return builder.toString();
    }

    @Override
    public void print(String ident, boolean endElement) {
        String concat = endElement ? " " : "|";

        System.out.println(ident + "|_ Aps method: " + this.nameIdentity);
        ident += concat + "   ";
        if (!this.modifiers.isEmpty()) {
            System.out.println(ident + "|_ Aps method modifier: ");
            String modifierIdent = ident + ".   ";
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

        if (this.param != null && !this.param.params().isEmpty()) {
            System.out.println(ident + "|_ params: ");
            this.param.print(ident + ".   ");
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
            System.out.println(ident + "|_ annotations: ");
            for (ApsAnnotationAst annotationAst : this.annotations) {
                System.out.println(ident + "    |_ " + annotationAst.nameIdentity());
            }
        }
    }

    @Override
    public void preprocess() {
        ApsClassAst classAst = findAst(ApsClassAst.class);

        if (this.nameIdentity.equals(classAst.nameIdentity()) || this.isConstructor) {
            this.isConstructor = true;

            if (!this.modifiers.isEmpty() || this.returnType != null) {
                throw new IllegalArgumentException("The constructor method are not allow modifiers and return type");
            }

            if (this.methodBody == null) {
                for (ApsMethodParamElementAst params : this.param().params()) {
                    ApsMemberParameterAst memberParameter = classAst.findMemberParameter(params.nameIdentity(), params.argType());
                    if (memberParameter == null || memberParameter.isStatic()) {
                        throw new IllegalArgumentException("The direct constructor parameters must be match to class member parameters");
                    }
                }

                ApsMethodBodyAst body = new ApsMethodBodyAst(this, null);
                for (ApsMethodParamElementAst params : this.param().params()) {
                    body.addPresentingFieldVariable(
                            new ApsVariableAst(body)
                                    .reference(new ApsRefReferenceAst(body).nameIdentity(params.nameIdentity()))
                                    .type(params.argType())
                                    .defining(true)
                    );
                    ApsVariableAst variableAst = new ApsVariableAst(body);
                    variableAst.reference(
                                    new ApsRefReferenceAst(variableAst)
                                            .nameIdentity(params.nameIdentity())
                                            .instanceReference(true)
                            )
                            .instanceReference(true)
                            .type(params.argType())
                            .defining(false)
                            .assignment(
                                    new ApsResultPresentingAst(variableAst).reference(
                                            new ApsRefReferenceAst(variableAst).nameIdentity(
                                                    params.nameIdentity()
                                            ).instanceReference(false)
                                    )
                            )
                            .withEnd(true);
                    body.addReassignmentFieldVariable(variableAst);
                }
                this.methodBody = body;
            }
        }

        if (this.param != null) {
            this.param.parent(this);
            this.param.preprocess();
        }
        if (this.methodBody != null) {
            this.methodBody.parent(this);
            this.methodBody.preprocess();
        }

        for (ApsAnnotationAst annotation : this.annotations) {
            annotation.parent(this);
            annotation.preprocess();
        }

        if (this.compilerFlags.contains("virtual-method")) {
            this.isVirtual = true;
        }

        if (this.compilerFlags.contains("try-inline")) {
            Manipulate.notNull(ApsarsClassPool.annotation(ApsAnnotationAst.TRY_INLINE), this::addAnnotation);
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
            int edge = this.param.params().size() - 1;
            for (ApsMethodParamElementAst param : this.param.params()) {
                paramBuilder.append(param.nameIdentity());
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
                invokeStatementAst = new ApsLiteralStatementAst(selfMethodBody, ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.ARG_TYPE, this.returnType) + " result=" + safepointMethod + "(" + paramBuilder + ")");
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

        if (this.extraCatch != null) {
            this.extraCatch.parent(this);
            this.extraCatch.preprocess();
        }

        if (this.returnType != null) {
            this.returnType.parent(this);
            this.returnType.preprocess();
        }
    }

    @Override
    public void postprocess() {
        Manipulate.notNull(this.param, ApsMethodParameterAst::postprocess);
        Manipulate.notNull(this.methodBody, ApsMethodBodyAst::postprocess);
        Manipulate.notNull(this.extraCatch, ApsMethodExtraCatchAst::postprocess);
        Manipulate.notNull(this.returnType, ApsArgTypeAst::postprocess);

        for (ApsAnnotationAst value : this.annotations) {
            value.postprocess();
        }
    }

    @Override
    public void consequence() {
        Manipulate.notNull(this.param, ApsMethodParameterAst::consequence);
        Manipulate.notNull(this.methodBody, ApsMethodBodyAst::consequence);
        Manipulate.notNull(this.extraCatch, ApsMethodExtraCatchAst::consequence);
        Manipulate.notNull(this.returnType, ApsArgTypeAst::consequence);

        for (ApsAnnotationAst value : this.annotations) {
            value.consequence();
        }
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
                    new ApsResultPresentingAst(returnAst).reference(
                            new ApsRefReferenceAst(returnAst).nameIdentity(
                                    nameIdentity
                            ).instanceReference(!isStatic)
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
            variableAst.reference(
                            new ApsRefReferenceAst(variableAst).nameIdentity(nameIdentity)
                    )
                    .instanceReference(!isStatic)
                    .defining(false)
                    .assignment(
                            new ApsResultPresentingAst(variableAst).reference(
                                    new ApsRefReferenceAst(variableAst).nameIdentity(
                                            nameIdentity + "_"
                                    )
                            )
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
