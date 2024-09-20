package com.github.cao.awa.apsars.tree.method.parameter.preset;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.element.method.parameter.ApsMethodParamPresetValueType;
import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsMethodParameterDefaultValueAst extends ApsAst {
    private ApsResultPresentingAst value;
    private ApsMethodParamPresetValueType type = ApsMethodParamPresetValueType.NOTHING;

    public ApsMethodParameterDefaultValueAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        // TODO
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ value: " + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.RESULT_PRESENTING_STATEMENT, this.value));
    }

    @Override
    public void preprocess() {
        this.value.preprocess();
    }

    @Override
    public void postprocess() {
        this.value.postprocess();
    }

    @Override
    public void consequence() {
        this.value.consequence();
    }
}
