package com.github.cao.awa.apsars.tree.statement.trys;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

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
    public void generateJava(StringBuilder builder) {
        if (this.catchList != null) {
            builder.append("try{");
            if (this.methodBody != null) {
                this.methodBody.generateJava(builder);
            }
            builder.append("}catch(");
            this.catchList.generateJava(builder);
            builder.append("){");
            if (this.catchingMethodBody != null) {
                this.catchingMethodBody.generateJava(builder);
            }
            builder.append("}");
        } else {
            if (this.methodBody != null) {
                this.methodBody.generateJava(builder);
            }
        }
    }

    @Override
    public void preprocess() {
        this.methodBody.preprocess();
        this.methodBody.preprocess();
        this.catchList.preprocess();
    }
}
