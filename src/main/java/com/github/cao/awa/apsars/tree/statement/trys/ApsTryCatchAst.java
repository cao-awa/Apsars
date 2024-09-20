package com.github.cao.awa.apsars.tree.statement.trys;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class ApsTryCatchAst extends ApsStatementAst {
    @Setter
    private ApsMethodBodyAst methodBody;
    @Setter
    private ApsMethodBodyAst catchingMethodBody;
    @Setter
    private ApsCatchListAst catchList;
    private final ApsMethodBodyAst parentBody;

    public ApsTryCatchAst(ApsAst parent, ApsMethodBodyAst parentBody) {
        super(parent);
        this.parentBody = parentBody;
    }

    @Override
    public void generateStructure(JSONObject json) {
        // TODO
    }

    @Override
    public void print(String ident) {
        System.out.println("-- Aps try catch");
        ident += "    ";
        if (this.methodBody != null) {
            this.methodBody.print(ident);
        }
        if (this.catchList != null) {
            this.catchList.print(ident);
        }
        if (this.catchingMethodBody != null) {
            this.catchingMethodBody.print(ident);
        }
    }

    @Override
    public void preprocess() {
        this.methodBody.preprocess();
        this.catchingMethodBody.preprocess();
        this.catchList.preprocess();

        this.catchingMethodBody.addPresentingFieldVariable(
                new ApsVariableAst(this)
                        .reference(new ApsRefReferenceAst(this.catchList).nameIdentity(catchList().catchName()))
        );
    }

    @Override
    public void postprocess() {
        this.methodBody.postprocess();
        this.catchingMethodBody.postprocess();
        this.catchList.postprocess();
    }

    @Override
    public void consequence() {
        this.methodBody.consequence();
        this.catchingMethodBody.consequence();
        this.catchList.consequence();
    }
}
