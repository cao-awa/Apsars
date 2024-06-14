package com.github.cao.awa.apsars.tree.statement.trys;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Consumer;

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
    public void generateJava(StringBuilder builder) {

    }

    @Override
    public void generateJava(StringBuilder builder, Consumer<StringBuilder> outer) {
        builder.append("{");

        builder.append("try{");
        outer.accept(builder);
        builder.append("}catch(");
        this.catchList.generateJava(builder);
        builder.append("){");
        if (this.methodBody != null) {
            this.methodBody.generateJava(builder);
        }
        builder.append("}");

        builder.append("}");
    }

    @Override
    public void preprocess() {
        this.methodBody.preprocess();
        this.catchList.preprocess();
    }
}
