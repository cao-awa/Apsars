package com.github.cao.awa.apsars.tree.aps;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Accessors(fluent = true)
public class ApsFileAst extends LanguageAst {
    @Setter
    private String packageAt;
    private final List<ApsImportAst> imports = ApricotCollectionFactor.arrayList();
    private final List<ApsClassAst> classes = ApricotCollectionFactor.arrayList();

    public ApsFileAst() {
        super(null);
    }

    public void addImport(ApsImportAst importAst) {
        this.imports.add(importAst);
    }

    public void addClass(ApsClassAst classAst) {
        this.classes.add(classAst);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("package_at", this.packageAt);

        if (!this.imports.isEmpty()) {
            JSONArray imports = new JSONArray();
            for (ApsImportAst anImport : this.imports) {
                JSONObject theImport = new JSONObject();
                anImport.generateStructure(theImport);
                imports.add(theImport);
            }
            json.put("imports", imports);
        }

        if (!this.classes.isEmpty()) {
            JSONObject classes = new JSONObject();
            for (ApsClassAst anClass : this.classes) {
                JSONObject theClass = new JSONObject();
                anClass.generateStructure(theClass);
                classes.put(anClass.formatCompletedName(), theClass);
            }
            json.put("classes", classes);
        }
    }

    public void print(String ident) {
        System.out.println("--Aps file");
        System.out.println("    |_ package at: " + this.packageAt);
        int i = 1;
        for (ApsImportAst importAst : this.imports) {
            importAst.print(ident + "    ", i++ == this.imports.size());
        }
        i = 1;
        for (ApsClassAst classAst : this.classes) {
            classAst.print(ident + "    ", i++ == this.classes.size());
        }
    }

    @Override
    public void preprocess() {
        ApsImportAst globalImportAst = new ApsImportAst(this);
        globalImportAst.fullName("com.github.cao.awa.apsars.ApsGlobal");
        globalImportAst.argType(new ApsArgTypeAst(globalImportAst).nameIdentity("ApsGlobal"));
        globalImportAst.importStatic(true);
        globalImportAst.importAll(true);
        addImport(globalImportAst);

        for (ApsImportAst importAst : this.imports) {
            importAst.preprocess();
        }
        for (ApsClassAst classAst : this.classes) {
            classAst.preprocess();
        }
    }

    @Override
    public void postprocess() {
        for (ApsImportAst importAst : this.imports) {
            importAst.postprocess();
        }
        for (ApsClassAst classAst : this.classes) {
            classAst.postprocess();
        }
    }

    @Override
    public void consequence() {
        for (ApsImportAst importAst : this.imports) {
            importAst.consequence();
        }
        for (ApsClassAst classAst : this.classes) {
            classAst.consequence();
        }
    }

    public ApsArgTypeAst findValidArgType(String name) {
        for (ApsImportAst anImport : this.imports) {
            if (anImport.argType().nameIdentity().equals(name)) {
                return anImport.argType();
            }
        }

        return null;
    }
}
