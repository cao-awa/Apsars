package com.github.cao.awa.apsars.parser.statement;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.statement.trys.ApsTryStatementParser;
import com.github.cao.awa.apsars.parser.statement.variable.ApsLocalVariableParser;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsTryCatchAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.catheter.pair.Pair;

import java.util.List;

public class ApsStatementParser extends ApsParser<ApsMethodBodyAst> {
    private static final ApsLocalVariableParser variableParser = new ApsLocalVariableParser();

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsMethodBodyAst ast) {
        while (readable()) {
            Pair<String, Boolean> nextTrys = nextToken(List.of(" ", "{", ";"), false);
            if (!nextTrys.second() && nextTrys.first().equals("try")) {
                ApsTryCatchAst tryCatchAst = new ApsTryCatchAst(ast, ast);
                ApsTryStatementParser parser = (ApsTryStatementParser) parser(ApsElementType.TRY_STATEMENT);
                parser.parse(codes(), tryCatchAst);
                ast.addStatement(tryCatchAst);
                skipAndFeedback(parser.feedbackSkip());
                continue;
            }
            Pair<String, Boolean> nextStatement = nextToken(";", false);
            if (nextStatement.second()) {
                break;
            }
            skipAndFeedback(nextStatement.first().length() + 1);
            if (variableParser.canTryProcess(nextStatement.first())) {
                ApsVariableAst variableAst = new ApsVariableAst(ast);
                variableParser.parse(nextStatement.first(), variableAst);
                ast.addStatement(variableAst);
                ast.addFieldVariable(variableAst);
            }
        }
    }
}
