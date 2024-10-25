package com.github.cao.awa.apsars.tree.statement.trys;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.lang.TranslateTarget;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Accessors(fluent = true)
public class ApsCatchListAst extends LanguageAst {
    private final List<ApsArgTypeAst> catchTargets = ApricotCollectionFactor.arrayList();
    @Setter
    private String catchName;

    public ApsCatchListAst(LanguageAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        // TODO
    }

    public void addCatchTarget(ApsArgTypeAst target) {
        target.parent(this);
        this.catchTargets.add(target);
    }

    public ApsCatchListAst targetAll() {
        this.catchTargets.clear();
        addCatchTarget(new ApsArgTypeAst(this).nameIdentity("Throwable"));
        return this;
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps catching: " + this.catchName);
        ident += "    ";

        System.out.println(ident + "|_ catch target: " + this.catchTargets.stream().map(arg -> LanguageTranslator.translate(TranslateTarget.JAVA, ApsarsTranslateElement.ARG_TYPE, arg)).toList());
    }

    @Override
    public void preprocess() {
        for (ApsArgTypeAst catchTarget : this.catchTargets) {
            catchTarget.preprocess();
        }
    }

    @Override
    public void postprocess() {
        for (ApsArgTypeAst catchTarget : this.catchTargets) {
            catchTarget.postprocess();
        }
    }

    @Override
    public void consequence() {
        for (ApsArgTypeAst catchTarget : this.catchTargets) {
            catchTarget.consequence();
        }
    }
}
