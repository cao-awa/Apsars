package com.github.cao.awa.apsars.parser.clazz;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.method.ApsMethodParser;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ApsClassParser extends ApsParser<ApsClassAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsClassParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsClassAst ast) {
        Pair<String, Boolean> nameIdentity = nextToken(List.of(" ", "{", ":"), false);

        ast.nameIdentity(nameIdentity.first());

        skipAndFeedback(nameIdentity.first().length());

        // 读取类中的内容
        Pair<Integer, Boolean> braceEndIndex = findClosureBraces(true);
        if (!braceEndIndex.second()) {
            // 跳过到右大括号外面的长度
            final int accumulatedFeedbackSkip = braceEndIndex.first() + 1 + stripedSkip() + feedbackSkip();

            substring(1, braceEndIndex.first());

            while (true) {
                Pair<Integer, Boolean> memberParamEnd = findNext(";", false);
                Pair<Integer, Boolean> methodStart = findNext("{", false);

                if (memberParamEnd.first() == -1 && methodStart.first() == -1) {
                    break;
                }

                if (!memberParamEnd.second() && !methodStart.second()) {
                    if (memberParamEnd.first() < methodStart.first()) {
                        processMemberParameter(ast);
                    } else {
                        processMethod(ast);
                    }
                } else if (!memberParamEnd.second()) {
                    processMemberParameter(ast);
                } else {
                    processMethod(ast);
                }
            }

            feedbackSkip(accumulatedFeedbackSkip);
        } else {
            LOGGER.warn("Wrongly parses braces at index " + braceEndIndex.first());
        }
    }

    private void processMemberParameter(ApsClassAst ast) {
        ApsMemberParameterAst parameterAst = new ApsMemberParameterAst(ast);

        Pair<String, Boolean> param = nextToken(";", false);

        ApsMemberParameterParser parameterParser = (ApsMemberParameterParser) parser(ApsElementType.MEMBER_PARAMETER);
        parameterParser.parse(param.first(), parameterAst);

        ast.addMemberParameter(parameterAst);

        skip(param.first().length());
        // 跳过分号的长度
        skip(1);
    }

    private void processMethod(ApsClassAst ast) {
        ApsMethodAst methodAst = new ApsMethodAst(ast);

        ApsMethodParser methodParser = (ApsMethodParser) parser(ApsElementType.METHOD);
        methodParser.parse(codes(), methodAst);

        ast.addMethod(methodAst);

        skip(methodParser.feedbackSkip());
    }
}
