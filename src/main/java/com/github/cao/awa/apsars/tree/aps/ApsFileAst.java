package com.github.cao.awa.apsars.tree.aps;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Accessors(fluent = true)
public class ApsFileAst extends ApsAst {
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
        for (ApsClassAst classAst : this.classes) {
            classAst.preprocess();
        }
        for (ApsImportAst importAst : this.imports) {
            importAst.preprocess();
        }

        ApsImportAst importAst = new ApsImportAst(this);
        importAst.fullName("com.github.cao.awa.apsars.ApsGlobal");
        importAst.argType(new ApsArgTypeAst(importAst).nameIdentity("ApsGlobal"));
        importAst.importStatic(true);
        importAst.importAll(true);
        addImport(importAst);
    }

    @Override
    public void postprocess() {
        for (ApsClassAst classAst : this.classes) {
            classAst.postprocess();
        }
        for (ApsImportAst importAst : this.imports) {
            importAst.postprocess();
        }
    }

    @Override
    public void consequence() {
        for (ApsClassAst classAst : this.classes) {
            classAst.consequence();
        }
        for (ApsImportAst importAst : this.imports) {
            importAst.consequence();
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
