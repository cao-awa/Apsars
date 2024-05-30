package com.github.cao.awa.apsars.parser;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.clazz.ApsClassParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.parser.token.keyword.ApsFileKeyword;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.aps.ApsImportAst;
import com.github.cao.awa.catheter.pair.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApsFileParser extends ApsParser<ApsFileAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsFileParser");

    @Override
    public boolean canTryProcess(String codes) {
        return true;
    }

    public void parse(ApsFileAst ast) {
        while (readable()) {
            Pair<String, Boolean> nextToken = nextToken(" ", false);

            if (!nextToken.second()) {
                ApsFileKeyword keyword = ApsTokens.FILE_KEYWORDS.get(nextToken.first());

                if (keyword == null) {
                    LOGGER.warn("Wrongly parses next token: " + nextToken.first());
                    return;
                }

                skip(nextToken.first().length());

                switch (keyword) {
                    case CLASS -> processClass(ast);
                    case IMPORT -> processImport(ast);
                }
            } else {
                LOGGER.warn("Wrongly parses next token");
                return;
            }
        }
    }

    private void processImport(ApsFileAst ast) {
        stripCodes();

        Pair<String, Boolean> nameIdentity = nextToken(";", false);

        ApsImportAst classAst = new ApsImportAst(ast);

        // 设置类名
        classAst.fullName(nameIdentity.first());

        skip(nameIdentity.first().length());
        // 跳过分号的长度
        skip(1);

        ast.addImport(classAst);
    }

    private void processClass(ApsFileAst ast) {
        stripCodes();

        ApsClassAst classAst = new ApsClassAst(ast);

        ApsClassParser classParser = (ApsClassParser) parser(ApsElementType.KEYWORD_CLASS);

        classParser.parse(codes(), classAst);

        skip(classParser.feedbackSkip());

        ast.addClass(classAst);
    }
}
