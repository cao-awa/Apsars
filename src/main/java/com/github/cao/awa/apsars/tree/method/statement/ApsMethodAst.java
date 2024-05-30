package com.github.cao.awa.apsars.tree.method.statement;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.element.method.ApsMethodParamModifierType;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodExtraCatchAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodParamAst;
import com.github.cao.awa.sinuatum.function.ecception.consumer.ExceptingConsumer;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Accessors(fluent = true)
public class ApsMethodAst extends ApsAst {
    @Setter
    @Getter
    private String nameIdentity;
    @Getter
    @Setter
    private String returnType;
    @Getter
    @Setter
    private ApsMethodParamAst param;
    @Getter
    @Setter
    private ApsMethodBodyAst methodBody;
    @Getter
    @Setter
    private ApsMethodExtraCatchAst extraCatch;
    private final Map<ApsMethodModifierType, ApsMethodModifier> modifiers = ApricotCollectionFactor.hashMap();
    private final Map<String, ApsAnnotationAst> annotations = ApricotCollectionFactor.hashMap();
    private final List<String> compilerFlags = ApricotCollectionFactor.arrayList();

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
        System.out.println(ident + "|_ return type: " + (this.returnType == null ? "void" : this.returnType));
        if (this.param != null) {
            System.out.println(ident + "|_ param type: ");
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

        this.returnType = this.returnType == null ? "void" : this.returnType;
        builder.append(this.returnType);
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
        Manipulate.notNull(this.param, ApsMethodParamAst::preprocess);
        Manipulate.notNull(this.methodBody, ApsMethodBodyAst::preprocess);
        Manipulate.notNull(this.extraCatch, ApsMethodExtraCatchAst::preprocess);
    }
}
