package com.github.cao.awa.apsars.tree.annotation;

import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.experimental.Accessors;

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
    public void generateJava(StringBuilder builder) {
        builder.append("@");
        builder.append(this.nameIdentity);
    }

    @Override
    public void preprocess() {

    }
}
