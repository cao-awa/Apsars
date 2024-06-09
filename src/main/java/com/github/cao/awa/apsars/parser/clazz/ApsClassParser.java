package com.github.cao.awa.apsars.parser.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassModifier;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.method.ApsMethodParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.parser.token.keyword.ApsClassKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMemberParameterKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.ApsMethodKeyword;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class ApsClassParser extends ApsParser<ApsClassAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsClassParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsClassAst ast) {
        while (true) {
            Pair<String, Boolean> modifierToken = nextToken(" ", false, true);
            ApsClassKeyword keyword = ApsTokens.CLASS_KEYWORDS.get(modifierToken.first());
            if (keyword != ApsClassKeyword.CLASS) {
                ast.addModifier(ApsClassModifier.create(keyword));
            } else {
                break;
            }
        }

        Pair<String, Boolean> nameIdentity = nextToken(List.of(" ", "{", ":"), false);

        ast.nameIdentity(nameIdentity.first());

        skipAndFeedback(nameIdentity.first().length());

        // 读取类中的内容
        Pair<Integer, Boolean> braceEndIndex = findClosureBraces(true);
        if (!braceEndIndex.second()) {
            // 跳过到右大括号外面的长度
            final int accumulatedFeedbackSkip = braceEndIndex.first() + 1 + stripedSkip() + feedbackSkip();

            substring(1, braceEndIndex.first());

            while (readable()) {
                if (startWith("let")) {
                    if (processLet(ast)) {
                        continue;
                    }
                } else {
                    if (processBrace(ast, Collections.emptyList(), Collections.emptyList())) {
                        continue;
                    }
                }
            }

            feedbackSkip(accumulatedFeedbackSkip);
        } else {
            LOGGER.warn("Wrongly parses braces at index " + braceEndIndex.first());
        }
    }

    private boolean processLet(ApsClassAst ast) {
        List<String> letApplies = ApricotCollectionFactor.arrayList();

        while (true) {
            Pair<String, Boolean> lets = nextToken(List.of(" ", "{"), false);

            if (lets.first().startsWith("{") || lets.second()) {
                break;
            }

            letApplies.add(lets.first());

            skip(lets.first().length());
        }

        letApplies.remove("let");

        List<ApsMemberParameterModifier> applyMemberParameterModifiers = ApricotCollectionFactor.arrayList();
        List<ApsMethodModifier> applyMethodModifiers = ApricotCollectionFactor.arrayList();

        for (String modifier : letApplies) {
            ApsMemberParameterKeyword memberParameterKeyword = ApsTokens.MEMBER_PARAMETER_KEYWORDS.get(modifier);
            if (memberParameterKeyword != null) {
                applyMemberParameterModifiers.add(ApsMemberParameterModifier.create(memberParameterKeyword));
            }

            ApsMethodKeyword methodModifierType = ApsTokens.METHOD_KEYWORDS.get(modifier);
            if (methodModifierType != null) {
                applyMethodModifiers.add(ApsMethodModifier.create(methodModifierType));
            }

            if (memberParameterKeyword == null && methodModifierType == null) {
                LOGGER.warn("The keyword '{}' cannot add to member parameters or methods", modifier);
            }
        }

        // 读取let中的内容
        Pair<Integer, Boolean> braceEndIndex = findClosureBraces(true);
        if (!braceEndIndex.second()) {
            String braceContent = makeSubstring(1, braceEndIndex.first());

            String least = makeSubstring(braceEndIndex.first() + 1, codes().length());

            reset(braceContent);
            while (readable()) {
                processBrace(ast, applyMemberParameterModifiers, applyMethodModifiers);
            }

            reset(least);
        }

        return true;
    }

    private boolean processBrace(ApsClassAst ast, List<ApsMemberParameterModifier> applyMemberParameterModifiers, List<ApsMethodModifier> applyMethodModifiers) {
        Pair<Integer, Boolean> memberParamEnd = findNext(";", false);
        Pair<Integer, Boolean> methodStart = findNext("{", false);

        if (memberParamEnd.first() == -1 && methodStart.first() == -1) {
            return true;
        }

        if (!memberParamEnd.second() && !methodStart.second()) {
            if (memberParamEnd.first() < methodStart.first()) {
                processMemberParameter(ast, applyMemberParameterModifiers);
            } else {
                processMethod(ast, applyMethodModifiers);
            }
        } else if (!memberParamEnd.second()) {
            processMemberParameter(ast, applyMemberParameterModifiers);
        } else {
            processMethod(ast, applyMethodModifiers);
        }
        return false;
    }

    private void processMemberParameter(ApsClassAst ast, List<ApsMemberParameterModifier> applyMemberParameterModifiers) {
        ApsMemberParameterAst parameterAst = new ApsMemberParameterAst(ast);

        Pair<String, Boolean> param = nextToken(";", false);

        ApsMemberParameterParser parameterParser = (ApsMemberParameterParser) parser(ApsElementType.MEMBER_PARAMETER);
        parameterParser.parse(param.first(), parameterAst);

        for (ApsMemberParameterModifier applyModifier : applyMemberParameterModifiers) {
            parameterAst.removeModifier(applyModifier.type());
            parameterAst.addModifier(applyModifier);
        }

        ast.addMemberParameter(parameterAst);

        skip(param.first().length());
        // 跳过分号的长度
        skip(1);
    }

    private void processMethod(ApsClassAst ast, List<ApsMethodModifier> applyMethodModifiers) {
        ApsMethodAst methodAst = new ApsMethodAst(ast);

        ApsMethodParser methodParser = (ApsMethodParser) parser(ApsElementType.METHOD);
        methodParser.parse(codes(), methodAst);

        for (ApsMethodModifier applyModifier : applyMethodModifiers) {
            methodAst.removeModifier(applyModifier.type());
            methodAst.addModifier(applyModifier);
        }

        ast.addMethod(methodAst);

        skip(methodParser.feedbackSkip());
    }
}
