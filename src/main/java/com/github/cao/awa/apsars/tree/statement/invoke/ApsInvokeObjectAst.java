package com.github.cao.awa.apsars.tree.statement.invoke;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
public class ApsInvokeObjectAst extends ApsResultingStatementAst {
    @Getter
    @Setter
    private String nameIdentity;
    @Getter
    @Setter
    private String methodName;
    @Getter
    private final List<ApsResultPresentingAst> params = ApricotCollectionFactor.arrayList();
    @Getter
    @Setter
    private ApsStatementAst fluentInvoke;

    public ApsInvokeObjectAst addParam(ApsResultPresentingAst param) {
        this.params.add(param);
        return this;
    }

    public ApsInvokeObjectAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void print(String ident) {
        System.out.println("Aps invoke: " + this.nameIdentity + (this.fluentInvoke == null ? "" : " (fluent" + (withEnd() ? "/end" : "") + ")"));
        if (this.fluentInvoke != null) {
            System.out.println(ident + "    |_ invoke parent: " + this.fluentInvoke.generateJava());
        }
        if (!this.params.isEmpty()) {
            System.out.println(ident + "    |_ params: ");
            int i = 0;
            for (ApsResultPresentingAst param : this.params) {
                System.out.print(ident + "        " + i++ + ": ");
                param.print("");
            }
        }
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void generateJava(StringBuilder builder) {
        if (this.fluentInvoke != null) {
            builder.append(".");
        } else {
            builder.append(this.nameIdentity);
            builder.append(".");
        }
        builder.append(this.methodName);
        builder.append("(");

        int edge = this.params.size() - 1;
        int index = 0;
        for (ApsResultPresentingAst param : this.params) {
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
