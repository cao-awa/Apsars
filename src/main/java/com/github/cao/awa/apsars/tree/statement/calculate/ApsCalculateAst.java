package com.github.cao.awa.apsars.tree.statement.calculate;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsCalculateAst extends ApsResultingStatementAst {
    @Getter
    @Setter
    private ApsResultPresentingAst left;
    @Getter
    @Setter
    private String symbol;
    @Getter
    @Setter
    private ApsResultPresentingAst right;
    @Getter
    @Setter
    private boolean leftWithParen;
    @Getter
    @Setter
    private boolean rightWithParen;
    @Getter
    @Setter
    private boolean totalWithParen;

    public ApsCalculateAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void print(String ident) {
        String concat = this.symbol != null ? "|" : " ";

        System.out.println("Aps calculate" + (this.totalWithParen ? " with parenthesis" : "") + ": ");
        System.out.print(ident + "|_ Left: ");
        this.left.print(ident + concat + "   ");
        if (this.symbol != null) {
            System.out.println(ident + "|   Symbol: " + this.symbol);
            System.out.print(ident + "|_  Right: ");
            this.right.print(ident + "    ");
        }
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void generateJava(StringBuilder builder) {
        if (this.totalWithParen) {
            builder.append('(');
        }

        if (this.leftWithParen) {
            builder.append("(");
        }
        this.left.generateJava(builder);
        if (this.leftWithParen) {
            builder.append(")");
        }

        if (this.symbol != null) {
            builder.append(this.symbol);
            if (this.rightWithParen) {
                builder.append("(");
            }
            this.right.generateJava(builder);
            if (this.rightWithParen) {
                builder.append(")");
            }
        }

        if (this.totalWithParen) {
            builder.append(')');
        }
    }
}
