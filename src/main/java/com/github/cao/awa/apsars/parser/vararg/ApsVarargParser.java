package com.github.cao.awa.apsars.parser.vararg;

import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.apsars.tree.vararg.ApsAstWithVarargs;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApsVarargParser extends ApsParser<ApsAstWithVarargs> {
    private static final Logger LOGGER = LogManager.getLogger("ApsVarargParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsAstWithVarargs ast) {
        int skip = codes().length();
        ast.argType(produceArgType(ast));
        feedbackSkip(skip);
    }

    private ApsArgTypeAst produceArgType(ApsAstWithVarargs ast) {
        Pair<String, Boolean> nextToken = nextToken("<", true, true);
        if (nextToken.second()) {
            return null;
        }
        ApsArgTypeAst argTypeAst = new ApsArgTypeAst(ast);
        argTypeAst.nameIdentity(nextToken.first());
        Pair<Integer, Boolean> braces = reservedClosureBraces();
        if (!braces.second()) {
            // 支持使用&符号替代|符号
            replaceCodes("&", "|");

            // 支持自然语言
            replaceCodes(" and ", "|");
            replaceCodes(" also ", "|");

            // 支持空格分隔
            while (codes().contains("  ")) {
                replaceCodes("  ", " ");
            }
            replaceCodes(" ", "|");

            // 逗号比左尖括号更前面说明必然有至少2个参数且后面的参数有vararg而前面（第一个）的没有
            if (codes().indexOf("|") < codes().indexOf("<")) {
                nextToken = nextToken("|", true, true);
                ApsArgTypeAst noVararg = new ApsArgTypeAst(ast);
                noVararg.nameIdentity(nextToken.first());
                argTypeAst.addArg(noVararg);

                // 跳过逗号
                skipAndFeedback(ApsTokens.COMMA);
            }

            if (codes().contains("<") && codes().contains(">")) {
                while (codes().contains("<") && codes().contains(">")) {
                    nextToken = nextToken("<", true, true);
                    Pair<Integer, Boolean> innerVarargs = findClosureBraces(false);
                    String innerStr = nextToken.first() + makeSubstring(0, innerVarargs.first());
                    String least = null;
                    if (startWith("|")) {
                        least = makeLeast();
                    }
                    reset(innerStr);
                    argTypeAst.addArg(produceArgType(ast));
                    if (least != null) {
                        reset(least);
                    }
                }
            } else {
                for (String s : codes().split("\\|")) {
                    ApsArgTypeAst noVararg = new ApsArgTypeAst(ast);
                    noVararg.nameIdentity(s.strip());
                    argTypeAst.addArg(noVararg);
                }
            }
        }

        return argTypeAst;
    }
}
