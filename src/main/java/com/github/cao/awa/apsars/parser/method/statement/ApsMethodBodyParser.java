package com.github.cao.awa.apsars.parser.method.statement;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.statement.ApsStatementParser;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
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
        ApsStatementParser parser = (ApsStatementParser) parser(ApsElementType.STATEMENT);
        parser.parse(codes(), ast);

        accumulateFeedbackSkip(stripedSkip());
    }
}
