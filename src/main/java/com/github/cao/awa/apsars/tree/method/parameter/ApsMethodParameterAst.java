package com.github.cao.awa.apsars.tree.method.parameter;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.LinkedList;

@Getter
@Accessors(fluent = true)
public class ApsMethodParameterAst extends LanguageAst {
    private final LinkedList<ApsMethodParamElementAst> params = ApricotCollectionFactor.linkedList();

    public ApsMethodParameterAst(ApsMethodAst parent) {
        super(parent);
    }

    public void addParam(ApsMethodParamElementAst param) {
        this.params.add(param);
    }

    @Override
    public void generateStructure(JSONObject json) {
        // TODO
    }

    @Override
    public void print(String ident) {
        this.params.forEach((value) -> value.print(ident));
    }

    @Override
    public void preprocess() {
        ApsMethodAst method = findAst(ApsMethodAst.class);

        for (ApsMethodParamElementAst methodParamElementAst : this.params) {
            methodParamElementAst.preprocess();

            method.methodBody().addPresentingFieldVariable(methodParamElementAst.toLocalVariable());
        }
    }

    @Override
    public void postprocess() {
        for (ApsMethodParamElementAst methodParamElementAst : this.params) {
            methodParamElementAst.postprocess();
        }
    }

    @Override
    public void consequence() {
        for (ApsMethodParamElementAst methodParamElementAst : this.params) {
            methodParamElementAst.consequence();
        }
    }

    public boolean isEmpty() {
        return this.params.isEmpty();
    }

    public static ApsMethodParameterAst empty(ApsMethodAst parent) {
        return new ApsMethodParameterAst(parent);
    }

    public static ApsMethodParameterAst param(ApsMethodAst parent, ApsArgTypeAst type, String nameIdentity) {
        ApsMethodParameterAst parameterAst = new ApsMethodParameterAst(parent);
        ApsMethodParamElementAst element = new ApsMethodParamElementAst(parameterAst);
        element.argType(type);
        element.nameIdentity(nameIdentity);
        parameterAst.addParam(element);
        return parameterAst;
    }
}
