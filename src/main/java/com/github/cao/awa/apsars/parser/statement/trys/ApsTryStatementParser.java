package com.github.cao.awa.apsars.parser.statement.trys;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.method.statement.ApsMethodCatchingParser;
import com.github.cao.awa.apsars.parser.statement.ApsStatementParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.parser.token.keyword.method.statement.ApsStatementKeyword;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsMethodExtraCatchAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsTryCatchAst;
import com.github.cao.awa.apsars.tree.statement.trys.producer.ApsCatchingProducer;
import com.github.cao.awa.catheter.pair.Pair;

import java.util.List;

public class ApsTryStatementParser extends ApsParser<ApsTryCatchAst> {
    @Override
    public boolean canTryProcess(String codes) {
        return codes.startsWith(ApsStatementKeyword.TRY.literal());
    }

    @Override
    public void parse(ApsTryCatchAst ast) {
        Pair<String, Boolean> nextTrys = nextToken(List.of(" ", "{"), false);
        skipAndFeedback(nextTrys.first().length());
        Pair<Integer, Boolean> tryBraces = findClosureBraces(true);
        if (!tryBraces.second()) {
            String trysCodes = makeSubstring(1, tryBraces.first());
            ApsMethodBodyAst methodBodyAst = new ApsMethodBodyAst(ast);
            ApsStatementParser statementParser = (ApsStatementParser) parser(ApsElementType.STATEMENT);
            statementParser.parse(trysCodes, methodBodyAst);
            ast.methodBody(methodBodyAst);
            skipAndFeedback(trysCodes.length());
            skipAndFeedback(ApsTokens.CURLY_BRACES_START);
            skipAndFeedback(ApsTokens.CURLY_BRACES_END);

            Pair<String, Boolean> nextCatch = nextToken(List.of(" ", "("), false);
            if (!nextCatch.second() && nextCatch.first().equals(ApsStatementKeyword.CATCH.literal())) {
                ApsCatchingProducer extraCatchAstProducer = new ApsCatchingProducer(ast);
                ApsMethodCatchingParser parser = (ApsMethodCatchingParser) parser(ApsElementType.TRY_CATCHING);
                parser.parse(codes(), extraCatchAstProducer, () -> {
                    skipAndFeedback(parser.feedbackSkip());
                    ast.catchList(extraCatchAstProducer.catchList());
                    ast.catchingMethodBody(extraCatchAstProducer.catchingMethodBody());
                });
            }
        }
        skipAndFeedback(stripedSkip());
    }
}
