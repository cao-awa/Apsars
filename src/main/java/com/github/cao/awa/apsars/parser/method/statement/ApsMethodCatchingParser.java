package com.github.cao.awa.apsars.parser.method.statement;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsAstWithCatching;
import com.github.cao.awa.apsars.tree.statement.trys.ApsCatchListAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ApsMethodCatchingParser extends ApsParser<ApsAstWithCatching> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMethodExtraCatchParser");

    @Override
    public boolean canTryProcess(String codes) {
        reset(codes);
        return startWith("catch");
    }

    @Override
    public void parse(ApsAstWithCatching ast) {
        if (startWith("catch")) {
            Pair<String, Boolean> catchToken = nextToken(List.of(" ", "("), false);
            if (!catchToken.second() && catchToken.first().equals("catch")) {
                skipAndFeedback(catchToken.first().length());

                Pair<Integer, Boolean> catchTargets = findClosureBraces(true);
                ApsCatchListAst catchListAst = new ApsCatchListAst(ast);
                ApsCatchListParser catchListParser = (ApsCatchListParser) parser(ApsElementType.CATCH_LIST);
                catchListParser.parse(makeSubstring(1, catchTargets.first()), catchListAst);
                skipAndFeedback(catchTargets.first() + 1);
                ast.catchList(catchListAst);

                Pair<Integer, Boolean> handlerCodes = findClosureBraces(true);
                ApsMethodBodyAst bodyAst = new ApsMethodBodyAst(ast, ast.parentBody());
                ApsMethodBodyParser methodBodyParser = (ApsMethodBodyParser) parser(ApsElementType.METHOD_BODY);
                methodBodyParser.parse(makeSubstring(1, handlerCodes.first()), bodyAst);
                skipAndFeedback(handlerCodes.first() + 1);
                ast.catchingMethodBody(bodyAst);
            }

            accumulateFeedbackSkip(stripedSkip());
        }
    }
}
