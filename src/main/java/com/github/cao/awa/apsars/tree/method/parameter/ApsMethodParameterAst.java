package com.github.cao.awa.apsars.tree.method.parameter;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import lombok.experimental.Accessors;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Accessors(fluent = true)
public class ApsMethodParameterAst extends ApsAst {
    private final Map<String, ApsMethodParamElementAst> params = ApricotCollectionFactor.hashMap();

    public ApsMethodParameterAst(ApsMethodAst parent) {
        super(parent);
    }

    public void addParam(ApsMethodParamElementAst param) {
        this.params.put(param.nameIdentity(), param);
    }

    @Override
    public void print(String ident) {
        this.params.forEach((key, value) -> {
            value.print(ident + "    ");
        });
    }

    @Override
    public void generateJava(StringBuilder builder) {
        Iterator<ApsMethodParamElementAst> params = this.params.values().iterator();
        while (params.hasNext()) {
            params.next().generateJava(builder);
            if (params.hasNext()) {
                builder.append(",");
            }
        }
    }

    public Set<String> names() {
        return this.params.keySet();
    }

    @Override
    public void preprocess() {
        for (ApsMethodParamElementAst methodParamElementAst : this.params.values()) {
            methodParamElementAst.preprocess();
        }
    }
}
