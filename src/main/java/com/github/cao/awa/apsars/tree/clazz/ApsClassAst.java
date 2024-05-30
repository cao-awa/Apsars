package com.github.cao.awa.apsars.tree.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
public class ApsClassAst extends ApsAst {
    @Setter
    @Getter
    private String nameIdentity;
    private List<ApsMemberParameterAst> parameters = ApricotCollectionFactor.arrayList();
    private List<ApsMethodAst> methods = ApricotCollectionFactor.arrayList();

    public ApsClassAst(ApsAst parent) {
        super(parent);
    }

    public void addMemberParameter(ApsMemberParameterAst parameterAst) {
        this.parameters.add(parameterAst);
    }

    public void addMethod(ApsMethodAst methodAst) {
        this.methods.add(methodAst);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps class: " + this.nameIdentity);
        System.out.println(ident + "    |_ params: ");
        for (ApsMemberParameterAst parameter : this.parameters) {
            parameter.print(ident + "        ");
        }
        System.out.println(ident + "    |_ methods: ");
        for (ApsMethodAst method : this.methods) {
            method.print(ident + "        ");
        }
    }

    @Override
    public String generateJava() {
        StringBuilder builder = new StringBuilder();
        builder.append("class ");
        builder.append(this.nameIdentity);
        builder.append("{");

        for (ApsMemberParameterAst parameterAst : this.parameters) {
            builder.append(parameterAst.generateJava());
        }

        for (ApsMethodAst methodAst : this.methods) {
            builder.append(methodAst.generateJava());
        }

        builder.append("}");
        return builder.toString();
    }

    @Override
    public void preprocess() {
        for (ApsMemberParameterAst parameterAst : this.parameters) {
            parameterAst.preprocess();
        }

        for (ApsMethodAst methodAst : this.methods) {
            methodAst.preprocess();
        }
    }
}
