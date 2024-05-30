package com.github.cao.awa.apsars.tree.annotation;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.aps.ApsImportAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
public class ApsAnnotationAst extends ApsAst {
    @Getter
    private final String nameIdentity;

    public ApsAnnotationAst(ApsAst ast, String nameIdentity) {
        super(ast);
        this.nameIdentity = nameIdentity;
    }

    public void print(String ident) {
        System.out.println(ident + "|_ Aps annotation: @" + this.nameIdentity);
    }

    @Override
    public String generateJava() {
        StringBuilder builder = new StringBuilder();
        builder.append("@");
        builder.append(this.nameIdentity);
        return builder.toString();
    }

    @Override
    public void preprocess() {

    }
}
