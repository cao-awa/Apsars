package com.github.cao.awa.apsars.tree.statement.result;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class ApsRefReferenceAst extends ApsStatementAst {
    private String nameIdentity;
    private ApsArgTypeAst type;
    private boolean instanceReference;
    private boolean definingVariable;
    private boolean doNotProcess;
    private boolean noDelegate;

    public ApsRefReferenceAst(LanguageAst ast) {
        super(ast);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("statement_type", "reference");
        json.put("name", this.nameIdentity);
        json.put("is_instance_reference", this.instanceReference);
    }

    public ApsRefReferenceAst dump(LanguageAst parent) {
        return new ApsRefReferenceAst(parent)
                .nameIdentity(this.nameIdentity)
                .type(this.type);
    }

    public ApsArgTypeAst resultingType() {
        return this.type;
    }

    @Override
    public void preprocess() {
        if (!this.doNotProcess) {
            if (this.nameIdentity.startsWith("this.")) {
                this.nameIdentity = this.nameIdentity.substring(this.nameIdentity.indexOf(".") + 1);
                this.instanceReference = true;
            }

            if (parent() instanceof ApsVariableAst x && x.defining()) {
                this.definingVariable = true;
            }

            if (this.type != null) {
                this.type.preprocess();
            }
        }
    }

    @Override
    public void postprocess() {
        if (!this.doNotProcess) {
            ApsVariableAst variable = findAst(ApsMethodBodyAst.class).fieldVariable(this.nameIdentity);

            this.type = variable.type();

            this.type.postprocess();
        }
    }

    @Override
    public void consequence() {
        if (!this.doNotProcess) {
            this.type.consequence();
        }
    }
}
