package com.github.cao.awa.apsars.parser.method.parameter;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.element.modifier.method.parameter.ApsMethodParamModifier;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.method.parameter.element.ApsMethodParameterPresetValueElementParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMethodParamKeyword;
import com.github.cao.awa.apsars.parser.vararg.ApsVarargParser;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsPresetValueElementAst;
import com.github.cao.awa.apsars.tree.vararg.producer.ApsVarargProducer;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ApsMethodParameterParser extends ApsParser<ApsMethodParameterAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMethodParameterParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsMethodParameterAst ast) {
        ApsElementType type = ApsElementType.LITERAL_IDENTITY;

        ApsMethodParamElementAst paramElement = new ApsMethodParamElementAst(ast);

        while (true) {
            Pair<String, Boolean> nextToken = nextTokenLimited(List.of(" ", ",", ":"), List.of("<"), true);
            if (!nextToken.second()) {
                ApsMethodParamKeyword keyword = ApsTokens.METHOD_PARAM_KEYWORDS.get(nextToken.first());
                if (keyword != null) {
                    paramElement.addModifier(ApsMethodParamModifier.create(keyword));
                    if (type == ApsElementType.METHOD_PARAM_DEFAULT){
                        type = ApsElementType.UNEXPECTED;

                        if (nextToken.first().equals(ApsMethodParamKeyword.DEFAULT.literal())) {
                            skipAndFeedback(nextToken.first().length());

                            nextToken = nextTokenLimited(List.of(" ", ","), true);

                            ApsMethodParameterPresetValueElementParser presetValueParser = (ApsMethodParameterPresetValueElementParser) parser(ApsElementType.METHOD_PARAM_DEFAULT);
                            ApsPresetValueElementAst defaultValue = new ApsPresetValueElementAst(paramElement);
                            presetValueParser.parse(nextToken.first(), defaultValue);

                            skipAndFeedback(nextToken.first().length());

                            paramElement.defaultValue(defaultValue);
                        }
                    }
                } else {
                    if (type == ApsElementType.LITERAL_IDENTITY) {
                        type = ApsElementType.TYPE;

                        paramElement.nameIdentity(nextToken.first());
                        // 跳过冒号
                        skipAndFeedback(1);
                    } else if (type == ApsElementType.TYPE) {
                        type = ApsElementType.METHOD_PARAM_DEFAULT;

                        ApsVarargParser varargParser = (ApsVarargParser) parser(ApsElementType.VARARG);
                        ApsVarargProducer varargProducer = new ApsVarargProducer(ast);
                        varargParser.parse(nextToken.first(), varargProducer);
                        if (varargProducer.argType() != null) {
                            paramElement.argType(varargProducer.argType());

                            skipAndFeedback(varargParser.feedbackSkip());

                            ast.addParam(paramElement);

                            continue;
                        }
                    } else {
                        LOGGER.warn("Unexpected token: " + nextToken.first());
                        break;
                    }
                }

                if (type != ApsElementType.UNEXPECTED) {
                    skipAndFeedback(nextToken.first().length());
                } else {
                    if (startWith(",")) {
                        type = ApsElementType.LITERAL_IDENTITY;
                        paramElement = new ApsMethodParamElementAst(ast);
                        // 跳过逗号
                        skipAndFeedback(1);
                    }
                }
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
