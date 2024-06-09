package com.github.cao.awa.apsars.parser.method.statement;

import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.tree.statement.trys.ApsCatchListAst;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApsCatchListParser extends ApsParser<ApsCatchListAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsCatchListParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsCatchListAst ast) {
        String[] strings = codes().split(":");
        if (strings.length == 2) {
            reset(strings[0]);
            stripCodes();
            processName(ast);

            reset(strings[1]);
            stripCodes();
            processTargets(ast);
        }

        accumulateFeedbackSkip(stripedSkip());
    }

    private void processName(ApsCatchListAst ast) {
        ast.catchName(codes());
    }

    private void processTargets(ApsCatchListAst ast) {
        for (String target : codes().replaceAll(" or ", "|").replaceAll(" ", "").split("\\|")) {
            ast.addCatchTarget(target);
        }
    }
}
