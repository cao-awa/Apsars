package com.github.cao.awa.apsars.tree.method;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsCatchListAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodBodyAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Supplier;

@Accessors(fluent = true)
public class ApsMethodExtraCatchAst extends ApsAst {
    @Getter
    @Setter
    private ApsMethodBodyAst methodBody;
    @Getter
    @Setter
    private ApsCatchListAst catchList;

    public ApsMethodExtraCatchAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps extra catch");
        ident += "    ";
        this.catchList.print(ident);
        if (this.methodBody != null) {
            this.methodBody.print(ident);
        }
    }

    @Override
    public String generateJava() {
        return null;
    }

    @Override
    public String generateJava(Supplier<String> outer) {
        StringBuilder builder = new StringBuilder();
        builder.append("{");

        builder.append("try{");
        builder.append(outer.get());
        builder.append("}catch(");
        builder.append(this.catchList.generateJava());
        builder.append("){");
        if (this.methodBody != null) {
            builder.append(this.methodBody.generateJava());
        }
        builder.append("}");

        builder.append("}");
        return builder.toString();
    }

    @Override
    public void preprocess() {
        this.methodBody.preprocess();
        this.catchList.preprocess();
    }
}
