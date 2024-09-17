package com.github.cao.awa.apsars.tree.statement.result;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsResultPresentingAst extends ApsAst {
    private ApsLiteralStatementAst constantLiteral;
    private String refToken;
    private ApsResultingStatementAst resultingStatement;

    public ApsResultPresentingAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {
        if (this.refToken != null) {
            System.out.println("Ref to: " + this.refToken);
        } else if (this.resultingStatement != null) {
            this.resultingStatement.print(ident);
        } else if (this.constantLiteral != null) {
            System.out.println("Constant: " + ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.LITERAL_STATEMENT, this.constantLiteral));
        }
    }

    @Override
    public void preprocess() {
        if (this.resultingStatement != null) {
            this.resultingStatement.preprocess();
        }

        if (this.constantLiteral != null) {
            this.constantLiteral.preprocess();
        }
    }
}
