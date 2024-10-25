package com.github.cao.awa.apsars.tree.aps;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsImportAst extends LanguageAst {
    private String fullName;
    private ApsArgTypeAst argType;
    private boolean importStatic;
    private boolean importAll;

    public ApsImportAst(ApsFileAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("full_name", this.fullName);
        JSONObject theArgType = new JSONObject();
        if (this.argType != null) {
            this.argType.generateStructure(theArgType);
            json.put("arg_type", theArgType);
        }
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps import: " + this.fullName);
    }

    @Override
    public void preprocess() {
        this.argType = new ApsArgTypeAst(this);
        if (this.argType.nameIdentity() == null) {
            this.argType.nameIdentity(this.fullName.substring(this.fullName.lastIndexOf('.') + 1));
        }
    }

    @Override
    public void postprocess() {
        this.argType.postprocess();
    }

    @Override
    public void consequence() {
        this.argType.consequence();
    }
}
