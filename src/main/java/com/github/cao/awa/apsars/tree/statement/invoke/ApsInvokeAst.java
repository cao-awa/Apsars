package com.github.cao.awa.apsars.tree.statement.invoke;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsRefReferenceAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Accessors(fluent = true)
public class ApsInvokeAst extends ApsResultingStatementAst {
    @Setter
    private ApsRefReferenceAst reference;
    private final List<ApsResultPresentingAst> params = ApricotCollectionFactor.arrayList();
    @Setter
    private List<ApsInvokeAst> fluentInvoke = ApricotCollectionFactor.arrayList();
    @Setter
    private boolean isFluent = false;
    @Setter
    private boolean accessingPublicField = false;

    public ApsInvokeAst addParam(ApsResultPresentingAst param) {
        this.params.add(param);

        return this;
    }

    public ApsInvokeAst addFluentInvoke(ApsInvokeAst invokeAst) {
        this.fluentInvoke.add(invokeAst);

        return this;
    }

    public ApsInvokeAst(LanguageAst ast) {
        super(ast);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("statement_type", "invoke");

        if (!this.fluentInvoke.isEmpty()) {
            JSONArray fluentInvokes = new JSONArray();
            for (ApsInvokeAst invoke : this.fluentInvoke) {
                JSONObject theInvoke = new JSONObject();
                invoke.generateStructure(theInvoke);
                fluentInvokes.add(theInvoke);
            }
            json.put("fluent_invokes", fluentInvokes);
        }

        if (!this.params.isEmpty()) {
            JSONArray params = new JSONArray();
            for (ApsResultPresentingAst param : this.params) {
                JSONObject theParam = new JSONObject();
                param.generateStructure(theParam);
                params.add(theParam);
            }
            json.put("params", params);
        }

        if (this.isFluent) {
            json.put("is_fluent", true);
        }

        if (this.accessingPublicField) {
            json.put("is_accessing_public_field", true);
            json.put("accessing_field_name", this.reference);
        } else {
            json.put("method_name", this.reference);
        }
    }

    @Override
    public ApsArgTypeAst resultingType() {
        ApsMethodAst callMethod = findAst(ApsClassAst.class).findMethod(
                this.reference.nameIdentity(),
                this.params.stream().map(
                        ApsResultPresentingAst::resultingType
                ).toList()
        );
        return callMethod.returnType();
    }

    @Override
    public void print(String ident, boolean endElement) {
        System.out.println("Aps invoke: " + this.reference.nameIdentity() + (this.fluentInvoke.isEmpty() ? "" : " (fluent" + (withEnd() ? "/end" : "") + ")"));
        System.out.println(ident + "|_ params: ");
        if (!this.params.isEmpty()) {
            int i = 0;
            for (ApsResultPresentingAst param : this.params) {
                System.out.print(ident + "   " + i++ + ": ");
                param.print(ident + "   ");
            }
        }
        if (!this.fluentInvoke.isEmpty()) {
            System.out.println(ident + "|_ next invoke: ");
            int i = 1;
            for (ApsInvokeAst fluentInvoke : this.fluentInvoke) {
                System.out.print(ident + "    " + i + ": ");
                fluentInvoke.print(ident + "    ", i++ == this.fluentInvoke.size());
            }
        }
    }

    @Override
    public void preprocess() {
        this.reference.noDelegate(true).doNotProcess(true);
        this.reference.preprocess();

        for (ApsInvokeAst ast : fluentInvoke()) {
            ast.preprocess();
        }

        for (ApsResultPresentingAst param : params()) {
            param.preprocess();
        }
    }

    @Override
    public void postprocess() {
        this.reference.postprocess();

        for (ApsInvokeAst ast : fluentInvoke()) {
            ast.postprocess();
        }

        for (ApsResultPresentingAst param : params()) {
            param.postprocess();
        }
    }

    @Override
    public void consequence() {
        this.reference.consequence();

        for (ApsInvokeAst ast : fluentInvoke()) {
            ast.consequence();
        }

        for (ApsResultPresentingAst param : params()) {
            param.consequence();
        }
    }
}
