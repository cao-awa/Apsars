package com.github.cao.awa.apsars.tree.statement.calculate;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultingStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsCalculateAst extends ApsResultingStatementAst {
    private ApsResultPresentingAst left;
    private String symbol;
    private ApsResultPresentingAst right;
    private boolean leftWithParen;
    private boolean rightWithParen;
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
            System.out.println(ident + "|_ Symbol: " + this.symbol);
            System.out.print(ident + "|_ Right: ");
            this.right.print(ident + "    ");
        }
    }

    @Override
    public void preprocess() {

    }
}
