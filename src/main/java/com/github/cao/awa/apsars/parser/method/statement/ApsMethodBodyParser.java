package com.github.cao.awa.apsars.parser.method.statement;

import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.method.statement.ApsStatementAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApsMethodBodyParser extends ApsParser<ApsMethodBodyAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMethodBodyParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsMethodBodyAst ast) {
        Pair<String, Boolean> nextToken = nextToken(";", false);
        while (!nextToken.second()) {
            ast.addStatement(new ApsStatementAst(ast, nextToken.first()));
            skipAndFeedback(nextToken.first().length() + 1);
            nextToken = nextToken(";", false);
        }

        accumulateFeedbackSkip(stripedSkip());
    }
}
