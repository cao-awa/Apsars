package com.github.cao.awa.apsars.tree.statement.trys;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Supplier;

@Accessors(fluent = true)
public class ApsTryCatchAst extends ApsStatementAst {
    @Getter
    @Setter
    private ApsMethodBodyAst methodBody;
    @Getter
    @Setter
    private ApsMethodBodyAst catchingMethodBody;
    @Getter
    @Setter
    private ApsCatchListAst catchList;

    public ApsTryCatchAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {
        System.out.println("-- Aps try catch");
        ident += "    ";
        if (this.methodBody != null) {
            this.methodBody.print(ident);
        }
        if (this.catchList != null) {
            this.catchList.print(ident);
        }
        if (this.catchingMethodBody != null) {
            this.catchingMethodBody.print(ident);
        }
    }

    @Override
    public String generateJava() {
        StringBuilder builder = new StringBuilder();
        if (this.catchList != null) {
            builder.append("try{");
            if (this.methodBody != null) {
                builder.append(this.methodBody.generateJava());
            }
            builder.append("}catch(");
            builder.append(this.catchList.generateJava());
            builder.append("){");
            if (this.methodBody != null) {
                builder.append(this.catchingMethodBody.generateJava());
            }
            builder.append("}");
        } else {
            if (this.methodBody != null) {
                builder.append(this.methodBody.generateJava());
            }
        }
        return builder.toString();
    }

    @Override
    public void preprocess() {
        this.methodBody.preprocess();
        this.methodBody.preprocess();
        this.catchList.preprocess();
    }
}
