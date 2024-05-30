package com.github.cao.awa.apsars.parser.method.statement;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.tree.method.statement.ApsCatchListAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodExtraCatchAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ApsMethodExtraCatchParser extends ApsParser<ApsMethodExtraCatchAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMethodExtraParser");

    @Override
    public boolean canTryProcess(String codes) {
        reset(codes);
        return startWith("catch");
    }

    @Override
    public void parse(ApsMethodExtraCatchAst ast) {
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
                ApsMethodBodyAst bodyAst = new ApsMethodBodyAst(ast);
                ApsMethodBodyParser methodBodyParser = (ApsMethodBodyParser) parser(ApsElementType.METHOD_BODY);
                methodBodyParser.parse(makeSubstring(1, handlerCodes.first()), bodyAst);
                skipAndFeedback(handlerCodes.first() + 1);
                ast.methodBody(bodyAst);
            }
        }

        accumulateFeedbackSkip(stripedSkip());
    }
}
