package com.github.cao.awa.apsars.tree.statement.trys;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsMethodExtraCatchAst extends LanguageAst {
    private ApsMethodBodyAst methodBody;
    private ApsMethodBodyAst catchingMethodBody;
    private ApsCatchListAst catchList;

    public ApsMethodExtraCatchAst(LanguageAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        // TODO
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps extra catch");
        ident += "    ";
        this.catchList.print(ident);
        if (this.catchingMethodBody != null) {
            this.catchingMethodBody.print(ident);
        }
    }

    @Override
    public void preprocess() {
        this.methodBody.preprocess();
        this.catchingMethodBody.preprocess();
        this.catchList.preprocess();
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
