package com.github.cao.awa.apsars.tree.statement.invoke;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
public class ApsInvokeAst extends ApsStatementAst {
    @Getter
    @Setter
    private String nameIdentity;
    @Getter
    private final List<ApsMethodBodyAst> params = ApricotCollectionFactor.arrayList();
    @Getter
    @Setter
    private ApsStatementAst fluentInvoke;

    public void addParam(ApsMethodBodyAst param) {
        this.params.add(param);
    }

    public ApsInvokeAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public void print(String ident) {
        System.out.println("Aps invoke: " + this.nameIdentity + (this.fluentInvoke == null ? "" : " (fluent" + (withEnd() ? "/end" : "") + ")"));
        if (this.fluentInvoke != null) {
            System.out.println(ident + "    |_ invoke parent: " + this.fluentInvoke.generateJava());
        }
        System.out.println(ident + "    |_ params: ");
        for (ApsMethodBodyAst param : this.params) {
//            if (param instanceof ApsLiteralStatementAst) {
//                System.out.print(ident + "        ");
//            }
            param.print(ident + "    ");
        }
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void generateJava(StringBuilder builder) {
        if (this.fluentInvoke != null) {
            builder.append(".");
        }

        builder.append(this.nameIdentity);
        builder.append("(");

        int edge = this.params.size() - 1;
        int index = 0;
        for (ApsMethodBodyAst param : this.params) {
            param.generateJava(builder);
            if (index != edge) {
                builder.append(",");
            }
            index++;
        }

        builder.append(")");

        if (withEnd()) {
            builder.append(ApsTokens.SEMICOLON);
        }
    }
}
