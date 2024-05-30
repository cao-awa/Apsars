package com.github.cao.awa.apsars.tree.method;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodAst;
import lombok.experimental.Accessors;

import java.util.Iterator;
import java.util.Map;

@Accessors(fluent = true)
public class ApsMethodParamAst extends ApsAst {
    private final Map<String, ApsMethodParamElementAst> params = ApricotCollectionFactor.hashMap();

    public ApsMethodParamAst(ApsMethodAst parent) {
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
    public String generateJava() {
        StringBuilder builder = new StringBuilder();

        Iterator<ApsMethodParamElementAst> params = this.params.values().iterator();
        while (params.hasNext()) {
            builder.append(params.next().generateJava());
            if (params.hasNext()) {
                builder.append(",");
            }
        }

        return builder.toString();
    }

    @Override
    public void preprocess() {
        for (ApsMethodParamElementAst methodParamElementAst : this.params.values()) {
            methodParamElementAst.preprocess();
        }
    }
}
