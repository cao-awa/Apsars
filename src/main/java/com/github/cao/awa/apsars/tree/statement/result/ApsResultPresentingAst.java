package com.github.cao.awa.apsars.tree.statement.result;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsResultPresentingAst extends ApsAst {
    private ApsConstantAst constant;
    private ApsLiteralStatementAst literal;
    private String refToken;
    private ApsResultingStatementAst resultingStatement;

    public ApsResultPresentingAst(ApsAst parent) {
        super(parent);
    }

    public static ApsResultPresentingAst statement(ApsAst parent, ApsResultingStatementAst statement) {
        return new ApsResultPresentingAst(parent).resultingStatement(statement);
    }

    public static ApsResultPresentingAst ref(ApsAst parent, String refToken) {
        return new ApsResultPresentingAst(parent).refToken(refToken);
    }

    public static ApsResultPresentingAst literal(ApsAst parent, String constant) {
        return new ApsResultPresentingAst(parent).literal(new ApsLiteralStatementAst(null, constant));
    }

    public static ApsResultPresentingAst constant(ApsAst parent, ApsConstantAst constant) {
        return new ApsResultPresentingAst(parent).constant(constant);
    }

    @Override
    public void print(String ident) {
        if (this.refToken != null) {
            System.out.println("Ref to: " + this.refToken);
        } else if (this.resultingStatement != null) {
            this.resultingStatement.print(ident);
        } else if (this.literal != null) {
            System.out.println("Literal: " + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.LITERAL_STATEMENT, this.literal));
        } else if (this.constant != null) {
            System.out.println("Constant: " + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.CONSTANT, this.constant));
        }
    }

    @Override
    public void preprocess() {
        if (this.resultingStatement != null) {
            this.resultingStatement.preprocess();
        }

        if (this.literal != null) {
            this.literal.preprocess();
        }

        if (this.constant != null) {
            this.constant.preprocess();
        }
    }
}
