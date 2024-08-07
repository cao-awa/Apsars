package com.github.cao.awa.apsars.parser;

import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.clazz.ApsClassParser;
import com.github.cao.awa.apsars.parser.clazz.inherit.ApsBinderParser;
import com.github.cao.awa.apsars.parser.global.ApsGlobalParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.parser.token.keyword.ApsFileKeyword;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.aps.ApsImportAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;
import com.github.cao.awa.apsars.tree.global.ApsGlobalAst;
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

                System.out.println(nextToken.first());

                if (keyword == ApsFileKeyword.CLASS) {
                    processClass(ast);
                    continue;
                } else {
                    skipAndFeedback(nextToken.first().length());
                }

                if (keyword == null) {
                    continue;
                }

                switch (keyword) {
                    case IMPORT -> processImport(ast);
                    case GLOBAL -> processGlobal();
                    case BIND -> processBind(ast);
                }
            } else {
                LOGGER.warn("Wrongly parses next token");
                return;
            }
        }
    }

    private void processImport(ApsFileAst ast) {
        stripCodes();

        Pair<String, Boolean> nameIdentity = nextToken(";", false, true);

        ApsImportAst classAst = new ApsImportAst(ast);

        // 设置类名
        classAst.fullName(nameIdentity.first());

        // 跳过分号的长度
        skip(ApsTokens.SEMICOLON);

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

    private void processBind(ApsFileAst ast) {
        stripCodes();

        ApsBinderAst classAst = new ApsBinderAst(ast);

        ApsBinderParser binderParser = (ApsBinderParser) parser(ApsElementType.KEYWORD_BIND);

        binderParser.parse(codes(), classAst);

        skip(binderParser.feedbackSkip());

        ast.addBinder(classAst);
    }

    private void processGlobal() {
        stripCodes();

        ApsGlobalParser classParser = (ApsGlobalParser) parser(ApsElementType.GLOBAL);

        classParser.parse(codes(), ApsGlobalAst.global);

        skip(classParser.feedbackSkip());
    }
}
