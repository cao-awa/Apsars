package com.github.cao.awa.apsars.tree.aps;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
public class ApsFileAst extends ApsAst {
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

    public void print(String ident) {
        System.out.println("--Aps file");
        for (ApsImportAst importAst : this.imports) {
            importAst.print(ident + "    ");
        }
        for (ApsClassAst classAst : this.classes) {
            classAst.print(ident + "    ");
        }
    }

    @Override
    public String generateJava() {
        StringBuilder builder = new StringBuilder();
        for (ApsImportAst importAst : this.imports) {
            builder.append(importAst.generateJava());
        }
        for (ApsClassAst classAst : this.classes) {
            builder.append(classAst.generateJava());
        }
        return builder.toString();
    }

    @Override
    public void preprocess() {
        for (ApsClassAst classAst : this.classes) {
            classAst.preprocess();
        }
        for (ApsImportAst importAst : this.imports) {
            importAst.preprocess();
        }
    }
}
