package com.github.cao.awa.apsars.parser.global;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.method.parameter.ApsMethodParameterParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.global.ApsGlobalKeyword;
import com.github.cao.awa.apsars.tree.global.ApsGlobalAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApsGlobalParser extends ApsParser<ApsGlobalAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsGlobalParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsGlobalAst ast) {
        // 读取全局定义中的内容
        Pair<Integer, Boolean> braceEndIndex = findClosureBraces(true);
        if (!braceEndIndex.second()) {
            // 跳过到右大括号外面的长度
            final int accumulatedFeedbackSkip = braceEndIndex.first() + 1 + stripedSkip() + feedbackSkip();

            substring(1, braceEndIndex.first());

            while (readable()) {
                if (startWith(ApsGlobalKeyword.ALIAS)) {
                    skip(ApsGlobalKeyword.ALIAS);
                    Pair<String, Boolean> aliasName = nextToken(" ", false);
                    skip(aliasName.first().length());
                    stripCodes();

                    // 跳过'as'
                    skip(ApsGlobalKeyword.AS);
                    Pair<String, Boolean> methodTarget = nextToken("(", false);
                    skip(methodTarget.first().length());

                    Pair<Integer, Boolean> paramBraces = findClosureBraces(true);

                    String paramCodes = makeSubstring(1, paramBraces.first());

                    skip(paramCodes.length());
                    skip(ApsTokens.BRACES_START);
                    skip(ApsTokens.BRACES_END);
                    skip(ApsTokens.SEMICOLON);

                    // 生成方法
                    ApsMethodAst methodAst = new ApsMethodAst(ast);
                    ApsMethodParameterAst parameterAst = new ApsMethodParameterAst(methodAst);
                    ApsMethodParameterParser parameterParser = (ApsMethodParameterParser) parser(ApsElementType.METHOD_PARAM);
                    parameterParser.parse(paramCodes, parameterAst);
                    methodAst.param(parameterAst);
                    methodAst.nameIdentity(aliasName.first());
                    methodAst.addModifier(ApsMethodModifier.create(ApsMethodKeyword.STATIC));
                    methodAst.addModifier(ApsMethodModifier.create(ApsMethodKeyword.PUBLIC));

                    ApsMethodBodyAst bodyAst = new ApsMethodBodyAst(methodAst);

                    StringBuilder aliasInvokes = new StringBuilder();
                    aliasInvokes.append(methodTarget.first());
                    aliasInvokes.append("(");
                    int edge = methodAst.param().names().size() - 1;
                    int index = 0;
                    for (String paramName : methodAst.param().names()) {
                        aliasInvokes.append(paramName);
                        if (index != edge) {
                            aliasInvokes.append(",");
                        }
                        index ++;
                    }
                    aliasInvokes.append(")");

                    bodyAst.addStatement(new ApsLiteralStatementAst(bodyAst, aliasInvokes.toString()));
                    methodAst.methodBody(bodyAst);

                    String aliasFullName = aliasName.first() + "(" + methodAst.param().generateJava() + ")";

                    ast.addAliasMethod(aliasFullName, methodAst);
                }
            }

            feedbackSkip(accumulatedFeedbackSkip);
        } else {
            LOGGER.warn("Wrongly parses braces at index " + braceEndIndex.first());
        }
    }
}
