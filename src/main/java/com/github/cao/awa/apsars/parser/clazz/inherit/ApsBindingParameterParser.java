package com.github.cao.awa.apsars.parser.clazz.inherit;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsMemberParameterKeyword;
import com.github.cao.awa.apsars.parser.vararg.ApsVarargParser;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBindingParameterAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ApsBindingParameterParser extends ApsParser<ApsBindingParameterAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMemberParameterParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsBindingParameterAst ast) {
        String withoutAssignmentReplace = makeLeast();
        replaceCodes(ApsTokens.LEFT_ASSIGNMENT, ApsTokens.EQUAL);
        replaceCodes(ApsMemberParameterKeyword.AS, ApsTokens.EQUAL, true);

        String[] assignments = codes().split(ApsTokens.EQUAL);
        if (assignments.length > 2) {
            LOGGER.warn("Extras assignment was found, unable to processes");
            return;
        }

        String defineCodes = assignments[0];

        reset(defineCodes);
        processDefine(ast);

        if (assignments.length == 2) {
            reset(withoutAssignmentReplace);
            // Skip the contents before the ’equal’ sign.
            skipAndFeedback(assignments[0]);
            // Find the assignment sign and skip it.
            skipAndFeedback(nextToken(ApsTokens.SPACE, false).first());
            processAssignment(ast);
        }
    }

    private void processDefine(ApsBindingParameterAst ast) {
        if (codes().contains(":")) {
            processApsarsDefine(ast);
        } else {
            processJavaDefine(ast);
        }
    }

    private void processApsarsDefine(ApsBindingParameterAst ast) {
        ApsElementType type = ApsElementType.LITERAL_IDENTITY;

        while (readable()) {
            Pair<String, Boolean> nextToken = nextToken(List.of(" ", ":"), List.of(new Pair<>("<", ">")), true);
            if (!nextToken.second()) {
                ApsMemberParameterKeyword keyword = ApsTokens.MEMBER_PARAMETER_KEYWORDS.get(nextToken.first());
                if (keyword != null) {
                    ast.addModifier(ApsMemberParameterModifier.create(keyword));
                } else {
                    if (type == ApsElementType.LITERAL_IDENTITY) {
                        type = ApsElementType.TYPE;
                        ast.nameIdentity(nextToken.first());
                        // 跳过冒号
                        skipAndFeedback(ApsTokens.COLON);
                    } else if (type == ApsElementType.TYPE) {
                        type = ApsElementType.UNEXPECTED;
                        processVararg(ast, nextToken.first());
                    } else {
                        LOGGER.warn("Unexpected token: " + nextToken.first());
                        break;
                    }
                }

                skip(nextToken.first().length());
            } else {
                break;
            }
        }

        if (type == ApsElementType.LITERAL_IDENTITY) {
            LOGGER.warn("Missing member parameter name");
        }
    }

    private void processJavaDefine(ApsBindingParameterAst ast) {
        ApsElementType type = ApsElementType.TYPE;

        while (readable()) {
            Pair<String, Boolean> nextToken = nextToken(" ", List.of(new Pair<>("<", ">")), true);
            if (!nextToken.second()) {
                ApsMemberParameterKeyword keyword = ApsTokens.MEMBER_PARAMETER_KEYWORDS.get(nextToken.first());
                if (keyword != null) {
                    ast.addModifier(ApsMemberParameterModifier.create(keyword));
                } else {
                    if (type == ApsElementType.TYPE) {
                        type = ApsElementType.LITERAL_IDENTITY;
                        processVararg(ast, nextToken.first());
                    } else if (type == ApsElementType.LITERAL_IDENTITY) {
                        type = ApsElementType.UNEXPECTED;
                        ast.nameIdentity(nextToken.first());
                    } else {
                        LOGGER.warn("Unexpected token: " + nextToken.first());
                        break;
                    }
                }

                skip(nextToken.first().length());
            } else {
                break;
            }
        }

        if (type == ApsElementType.LITERAL_IDENTITY) {
            LOGGER.warn("Missing member parameter name");
        }
    }

    private void processVararg(ApsBindingParameterAst ast, String token) {
        ApsVarargParser parser = (ApsVarargParser) parser(ApsElementType.VARARG);
        parser.parse(token, ast);
    }

    private void processAssignment(ApsBindingParameterAst ast) {
        stripCodes();
        ast.value(new ApsLiteralStatementAst(ast, codes()));
    }
}
