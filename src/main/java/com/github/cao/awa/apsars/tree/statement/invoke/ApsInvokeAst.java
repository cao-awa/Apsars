package com.github.cao.awa.apsars.tree.statement.invoke;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
public class ApsInvokeAst extends ApsResultingStatementAst {
    @Getter
    @Setter
    private String nameIdentity;
    @Getter
    private final List<ApsResultPresentingAst> params = ApricotCollectionFactor.arrayList();
    @Getter
    @Setter
    private List<ApsInvokeAst> fluentInvoke = ApricotCollectionFactor.arrayList();
    @Getter
    @Setter
    private boolean isFluent = false;

    public ApsInvokeAst addParam(ApsResultPresentingAst param) {
        this.params.add(param);

        return this;
    }

    public ApsInvokeAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void print(String ident, boolean endElement) {
        System.out.println("Aps invoke: " + this.nameIdentity + (this.fluentInvoke.isEmpty() ? "" : " (fluent" + (withEnd() ? "/end" : "") + ")"));
        if (!this.fluentInvoke.isEmpty()) {
            System.out.println(ident + "|_ next invoke: ");
            int i = 1;
            for (ApsInvokeAst fluentInvoke : this.fluentInvoke) {
                System.out.print(ident + "   " + i + ": ");
                fluentInvoke.print(ident, i++ == this.fluentInvoke.size());
            }
        }
        if (!this.params.isEmpty()) {
            System.out.println(ident + "|_ params: ");
            int i = 0;
            ident = ident + "   ";
            for (ApsResultPresentingAst param : this.params) {
                System.out.print(ident + i++ + ": ");
                param.print(ident);
            }
        }
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void generateJava(StringBuilder builder) {
        if (this.isFluent) {
            builder.append(".");
        }

        builder.append(this.nameIdentity);
        builder.append("(");

        generateParams(builder);

        builder.append(")");

        if (!this.fluentInvoke.isEmpty()) {
            for (ApsInvokeAst fluent : this.fluentInvoke) {
                fluent.generateJava(builder);
            }
        }

        if (withEnd()) {
            builder.append(ApsTokens.SEMICOLON);
        }
    }

    public void generateParams(StringBuilder builder) {
        int edge = this.params.size() - 1;
        int index = 0;
        for (ApsResultPresentingAst param : this.params) {
            param.generateJava(builder);
            if (index != edge) {
                builder.append(",");
            }
            index++;
        }
    }
}
