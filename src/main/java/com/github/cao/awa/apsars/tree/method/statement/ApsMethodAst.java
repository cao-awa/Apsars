package com.github.cao.awa.apsars.tree.method.statement;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodExtraCatchAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Accessors(fluent = true)
public class ApsMethodAst extends ApsAst {
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
    private final Map<ApsMethodModifierType, ApsMethodModifier> modifiers = ApricotCollectionFactor.hashMap();
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
            this.returnType.print(ident);
        }

        if (this.param != null && !this.param.names().isEmpty()) {
            System.out.println(ident + "|_ params: ");
            this.param.print(ident);
        }
        this.methodBody.print(ident);
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
    public String generateJava() {
        StringBuilder builder = new StringBuilder();

        if (!this.annotations.isEmpty()) {
            for (ApsAnnotationAst annotationAst : this.annotations.values()) {
                builder.append(annotationAst.generateJava());
                builder.append(" ");
            }
        }

        // 设置修饰符
        for (ApsMethodModifierType modifierType : ApsMethodModifierType.values()) {
            Manipulate.notNull(this.modifiers.get(modifierType), modifier -> {
                if (modifier.isLiteral()) {
                    builder.append(modifier.literal());
                    builder.append(" ");
                }
            });
        }

        if (this.returnType == null) {
            builder.append("void");
        } else {
            builder.append(this.returnType.generateJava());
        }
        builder.append(" ");

        builder.append(this.nameIdentity);
        builder.append("(");
        if (this.param != null) {
            builder.append(this.param.generateJava());
        }
        builder.append(")");

        if (this.extraCatch == null) {
            if (this.methodBody == null) {
                builder.append("{}");
            } else {
                builder.append("{");
                builder.append(this.methodBody.generateJava());
                builder.append("}");
            }
        } else {
            builder.append(this.extraCatch.generateJava(() -> {
                if (this.methodBody == null) {
                    return "";
                } else {
                    return this.methodBody.generateJava();
                }
            }));
        }

        return builder.toString();
    }

    @Override
    public void preprocess() {
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

            ApsMethodBodyAst selfMethodBody = new ApsMethodBodyAst(this);
            ApsStatementAst safepointStatementAst = new ApsStatementAst(selfMethodBody, "try{Thread.sleep(0);}catch (InterruptedException ignored){}");

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

            ApsStatementAst invokeStatementAst;
            if (this.returnType == null) {
                invokeStatementAst = new ApsStatementAst(selfMethodBody, safepointMethod + "(" + paramBuilder + ")");
            } else {
                invokeStatementAst = new ApsStatementAst(selfMethodBody, this.returnType.generateJava() + " result=" + safepointMethod + "(" + paramBuilder + ")");
            }

            selfMethodBody.addStatement(invokeStatementAst);
            selfMethodBody.addStatement(safepointStatementAst);
            if (this.returnType != null) {
                ApsStatementAst returnStatementAst = new ApsStatementAst(selfMethodBody, "return result");
                selfMethodBody.addStatement(returnStatementAst);
            }
            methodBody(selfMethodBody);

            extraCatch(null);
        }

        Manipulate.notNull(this.param, ApsMethodParameterAst::preprocess);
        Manipulate.notNull(this.methodBody, ApsMethodBodyAst::preprocess);
        Manipulate.notNull(this.extraCatch, ApsMethodExtraCatchAst::preprocess);
    }
}
