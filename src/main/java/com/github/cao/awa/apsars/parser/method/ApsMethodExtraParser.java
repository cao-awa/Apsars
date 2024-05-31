package com.github.cao.awa.apsars.parser.method;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.parser.vararg.ApsVarargParser;
import com.github.cao.awa.apsars.tree.method.statement.ApsMethodAst;
import com.github.cao.awa.apsars.tree.vararg.producer.ApsVarargProducer;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ApsMethodExtraParser extends ApsParser<ApsMethodAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsMethodExtraParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    @Override
    public void parse(ApsMethodAst ast) {
        if (startWith(":")) {
            skipAndFeedback(1);
            processReturnType(ast);
        }
    }

    private void processReturnType(ApsMethodAst ast) {
        Pair<String, Boolean> returnType = nextToken(" ", List.of(new Pair<>("<", ">")), true);
        if (!returnType.second()) {
            ApsVarargParser varargParser = (ApsVarargParser) parser(ApsElementType.VARARG);
            ApsVarargProducer varargProducer = new ApsVarargProducer(ast);
            varargParser.parse(returnType.first(), varargProducer);
            ast.returnType(varargProducer.argType());
        } else {
            LOGGER.warn("Missing method return type");
        }
    }
}
