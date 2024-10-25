package com.github.cao.awa.apsars.tree.statement.result;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.lang.TranslateTarget;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsResultPresentingAst extends LanguageAst {
    private ApsConstantAst<?> constant;
    private ApsLiteralStatementAst literal;
    private ApsRefReferenceAst reference;
    private ApsResultingStatementAst resultingStatement;

    public ApsResultPresentingAst(LanguageAst parent) {
        super(parent);
    }

    public static ApsResultPresentingAst statement(LanguageAst parent, ApsResultingStatementAst statement) {
        return new ApsResultPresentingAst(parent).resultingStatement(statement);
    }

    public static ApsResultPresentingAst ref(LanguageAst parent, String refToken) {
        return new ApsResultPresentingAst(parent).reference(new ApsRefReferenceAst(parent).nameIdentity(refToken));
    }

    public static ApsResultPresentingAst literal(LanguageAst parent, String constant) {
        return new ApsResultPresentingAst(parent).literal(new ApsLiteralStatementAst(null, constant));
    }

    public static ApsResultPresentingAst constant(LanguageAst parent, ApsConstantAst<?> constant) {
        return new ApsResultPresentingAst(parent).constant(constant);
    }

    public ApsArgTypeAst resultingType() {
        if (this.resultingStatement != null) {
            return this.resultingStatement.resultingType();
        }

        if (this.reference != null) {
            return this.reference.resultingType();
        }

        if (this.constant != null) {
            return this.constant.resultingType();
        }

        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void generateStructure(JSONObject json) {
        if (this.constant != null) {
            JSONObject theConstant = new JSONObject();
            this.constant.generateStructure(theConstant);
            json.put("constant", theConstant);
        }

        if (this.literal != null) {
            JSONObject theLiteral = new JSONObject();
            this.literal.generateStructure(theLiteral);
            json.put("literal", theLiteral);
        }

        if (this.resultingStatement != null) {
            JSONObject theResultingStatement = new JSONObject();
            this.resultingStatement.generateStructure(theResultingStatement);
            json.put("statement", theResultingStatement);
        }

        if (this.reference != null) {
            JSONObject theReference = new JSONObject();
            this.reference.generateStructure(theReference);
            json.put("reference", theReference);
        }
    }

    @Override
    public void print(String ident) {
        if (this.reference != null) {
            System.out.println("Ref to: " + this.reference.nameIdentity());
        } else if (this.resultingStatement != null) {
            this.resultingStatement.print(ident);
        } else if (this.literal != null) {
            System.out.println("Literal: " + LanguageTranslator.translate(TranslateTarget.JAVA, ApsarsTranslateElement.LITERAL_STATEMENT, this.literal));
        } else if (this.constant != null) {
            System.out.println("Constant: " + LanguageTranslator.translate(TranslateTarget.JAVA, ApsarsTranslateElement.CONSTANT, this.constant));
        }
    }

    @Override
    public void preprocess() {
        if (this.resultingStatement != null) {
            this.resultingStatement.parent(this);
            this.resultingStatement.preprocess();
        }

        if (this.reference != null) {
            this.reference.parent(this);
            this.reference.preprocess();
        }

        if (this.literal != null) {
            this.literal.parent(this);
            this.literal.preprocess();
        }

        if (this.constant != null) {
            this.constant.parent(this);
            this.constant.preprocess();
        }
    }

    @Override
    public void postprocess() {
        if (this.resultingStatement != null) {
            this.resultingStatement.postprocess();
        }

        if (this.reference != null) {
            this.reference.postprocess();
        }

        if (this.literal != null) {
            this.literal.postprocess();
        }

        if (this.constant != null) {
            this.constant.postprocess();
        }
    }

    @Override
    public void consequence() {
        if (this.resultingStatement != null) {
            this.resultingStatement.consequence();
        }

        if (this.reference != null) {
            this.reference.consequence();
        }

        if (this.literal != null) {
            this.literal.consequence();
        }

        if (this.constant != null) {
            this.constant.consequence();
        }
    }
}
