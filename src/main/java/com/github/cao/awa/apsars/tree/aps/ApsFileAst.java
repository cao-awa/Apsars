package com.github.cao.awa.apsars.tree.aps;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
public class ApsFileAst extends ApsAst {
    @Getter
    private final List<ApsImportAst> imports = ApricotCollectionFactor.arrayList();
    @Getter
    private final List<ApsClassAst> classes = ApricotCollectionFactor.arrayList();
    @Getter
    private final List<ApsBinderAst> binders = ApricotCollectionFactor.arrayList();

    public ApsFileAst() {
        super(null);
    }

    public void addImport(ApsImportAst importAst) {
        this.imports.add(importAst);
    }

    public void addClass(ApsClassAst classAst) {
        this.classes.add(classAst);
    }

    public void addBinder(ApsBinderAst binderAst) {
        this.binders.add(binderAst);
    }

    public void print(String ident) {
        System.out.println("--Aps file");
        for (ApsImportAst importAst : this.imports) {
            importAst.print(ident + "    ");
        }
        for (ApsClassAst classAst : this.classes) {
            classAst.print(ident + "    ");
        }
        for (ApsBinderAst binderAst : this.binders) {
            binderAst.print(ident + "    ");
        }
    }

    @Override
    public void generateJava(StringBuilder builder) {
        for (ApsImportAst importAst : this.imports) {
            importAst.generateJava(builder);
        }
        for (ApsClassAst classAst : this.classes) {
            classAst.generateJava(builder);
        }
        for (ApsBinderAst binderAst : this.binders) {
            binderAst.generateJava(builder);
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
        for (ApsBinderAst binderAst : this.binders) {
            binderAst.preprocess();
        }

        ApsImportAst importAst = new ApsImportAst(this);
        importAst.fullName("com.github.cao.awa.apsars.ApsGlobal");
        importAst.importStatic(true);
        importAst.importAll(true);
        addImport(importAst);
    }
}
