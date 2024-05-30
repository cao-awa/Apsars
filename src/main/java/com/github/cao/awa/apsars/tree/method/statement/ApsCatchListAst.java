package com.github.cao.awa.apsars.tree.method.statement;

import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Supplier;

@Accessors(fluent = true)
public class ApsCatchListAst extends ApsAst {
    @Getter
    @Setter
    private String catchTarget;
    @Getter
    @Setter
    private String catchName;

    public ApsCatchListAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps catching: " + this.catchName);
        ident += "    ";

        System.out.println(ident + "|_ catch target: " + this.catchTarget);
    }

    @Override
    public String generateJava() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.catchTarget);
        builder.append(" ");
        builder.append(this.catchName);
        return builder.toString();
    }

    @Override
    public void preprocess() {

    }
}
