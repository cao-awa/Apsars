package com.github.cao.awa.apsars.parser.method;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.method.statement.ApsMethodBodyParser;
import com.github.cao.awa.apsars.parser.method.statement.ApsMethodExtraCatchParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMethodKeyword;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodExtraCatchAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodParamAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ApsMethodParser extends ApsParser<ApsMethodAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMethodParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsMethodAst ast) {
        ApsElementType type = ApsElementType.LITERAL_IDENTITY;

        while (true) {
            Pair<String, Boolean> nextToken = nextToken(List.of("(", " "), true);
            if (!nextToken.second()) {
                ApsMethodKeyword keyword = ApsTokens.METHOD_KEYWORDS.get(nextToken.first());
                if (keyword != null) {
                    ast.addModifier(ApsMethodModifier.create(keyword));
                } else {
                    if (type == ApsElementType.LITERAL_IDENTITY) {
                        type = ApsElementType.BRACES;

                        ast.nameIdentity(nextToken.first());
                    } else if (type == ApsElementType.BRACES) {
                        type = ApsElementType.METHOD_BODY;

                        Pair<Integer, Boolean> params = findClosureBraces(true);
                        ApsMethodParamAst paramAst = new ApsMethodParamAst(ast);
                        ApsMethodParamParser parser = (ApsMethodParamParser) parser(ApsElementType.METHOD_PARAM);
                        parser.parse(makeSubstring(1, params.first()), paramAst);
                        skipAndFeedback(params.first() + 1);
                        ast.param(paramAst);
                    } else if (type == ApsElementType.METHOD_BODY) {
                        if (startWith("{")) {
                            type = ApsElementType.METHOD_EXTRA_CATCH;

                            Pair<Integer, Boolean> body = findClosureBraces(true);
                            ApsMethodBodyAst bodyAst = new ApsMethodBodyAst(ast);
                            ApsMethodBodyParser parser = (ApsMethodBodyParser) parser(ApsElementType.METHOD_BODY);
                            parser.parse(makeSubstring(1, body.first()), bodyAst);
                            skipAndFeedback(body.first() + 1);
                            ast.methodBody(bodyAst);
                        } else {
                            // 若不是方法体，则此时预期的应该是返回值和异常
                            nextToken = nextToken("{", false);
                            ApsMethodExtraParser parser = (ApsMethodExtraParser) parser(ApsElementType.METHOD_EXTRA);
                            parser.parse(nextToken.first(), ast);
                        }
                    } else if (type == ApsElementType.METHOD_EXTRA_CATCH) {
                        type = ApsElementType.UNEXPECTED;

                        ApsMethodExtraCatchAst extraCatchAst = new ApsMethodExtraCatchAst(ast);
                        ApsMethodExtraCatchParser parser = (ApsMethodExtraCatchParser) parser(ApsElementType.METHOD_EXTRA_CATCH);
                        if (parser.canTryProcess(codes())) {
                            parser.parse(codes(), extraCatchAst);
                            skipAndFeedback(parser.feedbackSkip());
                            ast.extraCatch(extraCatchAst);
                        }
                    } else {
                        LOGGER.warn("Unexpected token: " + nextToken.first());
                        break;
                    }
                }

                skipAndFeedback(nextToken.first().length());
            } else {
                break;
            }
        }

        if (type == ApsElementType.LITERAL_IDENTITY) {
            LOGGER.warn("Missing member parameter name");
        }

        accumulateFeedbackSkip(stripedSkip());
    }
}
