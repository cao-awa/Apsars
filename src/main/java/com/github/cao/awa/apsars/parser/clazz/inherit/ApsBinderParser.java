package com.github.cao.awa.apsars.parser.clazz.inherit;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.method.ApsMethodParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsClassKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsMemberParameterKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.inherit.ApsBinderKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBindingParameterAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class ApsBinderParser extends ApsParser<ApsBinderAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsBinderParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsBinderAst ast) {
//        while (true) {
//            Pair<String, Boolean> modifierToken = nextToken(" ", false, true);
//            ApsBinderKeyword keyword = ApsTokens.BINDER_KEYWORDS.get(modifierToken.first());
//            if (keyword != ApsBinderKeyword.BINDER) {
//                ast.addModifier(ApsBinderModifier.create(keyword));
//            } else {
//                break;
//            }
//        }

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

    private boolean processLet(ApsBinderAst ast) {
        List<String> letApplies = ApricotCollectionFactor.arrayList();

        while (true) {
            Pair<String, Boolean> lets = nextToken(List.of(" ", "{"), false);

            if (lets.first().startsWith("{") || lets.second()) {
                break;
            }

            letApplies.add(lets.first());

            skip(lets.first().length());
        }

        letApplies.remove(ApsClassKeyword.LET.literal());

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

    private boolean processBrace(ApsBinderAst ast, List<ApsMemberParameterModifier> applyMemberParameterModifiers, List<ApsMethodModifier> applyMethodModifiers) {
        Pair<Integer, Boolean> endDefine = findNext(";", false);
        Pair<Integer, Boolean> methodStart = findNext("{", false);

        if (endDefine.first() == -1 && methodStart.first() == -1) {
            return true;
        }

        Pair<Integer, Boolean> virtualMember = findNext(ApsBinderKeyword.VIRTUAL.literal(), false);

        if (virtualMember.first() != -1) {
            skip(ApsBinderKeyword.VIRTUAL);
            processMemberParameter(ast, applyMemberParameterModifiers);
        } else {
            processMethod(ast, applyMethodModifiers);
        }
        return false;
    }

    private void processMemberParameter(ApsBinderAst ast, List<ApsMemberParameterModifier> applyMemberParameterModifiers) {
        ApsBindingParameterAst parameterAst = new ApsBindingParameterAst(ast);

        Pair<String, Boolean> param = nextToken(";", false);

        System.out.println(param.first() + "???");

        ApsBindingParameterParser parameterParser = (ApsBindingParameterParser) parser(ApsElementType.BINDING_PARAMETER);
        parameterParser.parse(param.first(), parameterAst);

        for (ApsMemberParameterModifier applyModifier : applyMemberParameterModifiers) {
            parameterAst.removeModifier(applyModifier.type());
            parameterAst.addModifier(applyModifier);
        }

        ast.addMemberParameter(parameterAst);

        skip(param.first().length());
        // 跳过分号的长度
        skip(ApsTokens.SEMICOLON);
    }

    private void processMethod(ApsBinderAst ast, List<ApsMethodModifier> applyMethodModifiers) {
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
