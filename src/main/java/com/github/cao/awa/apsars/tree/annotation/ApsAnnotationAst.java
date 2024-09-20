package com.github.cao.awa.apsars.tree.annotation;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class ApsAnnotationAst extends ApsStatementAst {
    public static final String DO_NOT_REF_PRIMARY = "com.github.cao.awa.apsars.std.DoNotRefPrimary";
    public static final String TRY_INLINE = "com.github.cao.awa.apsars.std.TryInline";
    private final String nameIdentity;

    public ApsAnnotationAst(ApsAst ast, String nameIdentity) {
        super(ast);
        this.nameIdentity = nameIdentity;
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("name", this.nameIdentity);
    }

    public void print(String ident) {
        System.out.println(ident + "|_ Aps annotation: @" + this.nameIdentity);
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void postprocess() {

    }

    @Override
    public void consequence() {

    }
}
