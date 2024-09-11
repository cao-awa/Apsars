package com.github.cao.awa.apsars.tree.statement;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsResultPresentingAst extends ApsAst {
    @Getter
    @Setter
    private ApsLiteralStatementAst constantLiteral;
    @Getter
    @Setter
    private String refToken;
    @Getter
    @Setter
    private ApsResultingStatementAst resultingStatement;
//    @Getter
//    @Setter
//    private String refToken;

    public ApsResultPresentingAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {
        if (this.refToken != null) {
            System.out.println(ident + "Ref: " + this.refToken);
        } else if (this.resultingStatement != null) {
            System.out.println("Statement: " + this.resultingStatement.generateJava());
        } else if (this.constantLiteral != null) {
            System.out.println(ident + "Constant: " + this.constantLiteral.generateJava());
        }
    }

    @Override
    public void preprocess() {

    }

    @Override
    public void generateJava(StringBuilder builder) {
        if (this.refToken != null) {
            builder.append(this.refToken);
        } else if (this.resultingStatement != null) {
            this.resultingStatement.generateJava(builder);
        } else if (this.constantLiteral != null) {
            this.constantLiteral.generateJava(builder);
        }
    }
}
