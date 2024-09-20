package com.github.cao.awa.apsars.builtin;

import com.github.cao.awa.apricot.util.io.IOUtil;
import com.github.cao.awa.apsars.antlr.ApsarsLexer;
import com.github.cao.awa.apsars.antlr.ApsarsParser;
import com.github.cao.awa.apsars.antlr.pure.PureApsarsParser;
import com.github.cao.awa.apsars.translate.java.pool.ApsarsClassPool;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.visitor.ApsarsTreeVisitor;
import com.github.cao.awa.apsars.visitor.pure.PureApsarsTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.io.IOException;

public class ApsarsBuiltin {
    public static void generateBuiltin(String stdPath, String stdSourcePath, String packageAt) throws IOException {
        ApsarsClassPool.registerDefaultClasses();
        ApsarsClassPool.registerDefaultAnnotations();

        ApsBasicType.generateBuiltin(stdPath, stdSourcePath, packageAt);
    }

    public static void writeTo(String path, String name, String content) throws IOException {
        IOUtil.write(new FileWriter(path + "/" + name), content);
    }

    public static ApsFileAst readPureApsars(String content) {
        ApsarsLexer lexer = new ApsarsLexer(CharStreams.fromString(content));
        TokenStream tokens = new CommonTokenStream(lexer);
        PureApsarsParser parser = new PureApsarsParser(tokens);
        PureApsarsParser.ProgramContext programContext = parser.program();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new RuntimeException("Expected symbol '" + offendingSymbol + "' but error in line " + line + " chars " + charPositionInLine + ": " + msg, e);
            }
        });

        printTree("", programContext);

        PureApsarsTreeVisitor visitor = new PureApsarsTreeVisitor();
        return visitor.visitProgram(programContext);
    }

    public static ApsFileAst readApsars(String content) {
        ApsarsLexer lexer = new ApsarsLexer(CharStreams.fromString(content));
        TokenStream tokens = new CommonTokenStream(lexer);
        ApsarsParser parser = new ApsarsParser(tokens);
        ApsarsParser.ProgramContext programContext = parser.program();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new RuntimeException("Expected symbol '" + offendingSymbol + "' but error in line " + line + " chars " + charPositionInLine + ": " + msg, e);
            }
        });

        printTree("", programContext);

        ApsarsTreeVisitor visitor = new ApsarsTreeVisitor();
        return visitor.visitProgram(programContext);
    }

    public static void printTree(String ident, ParseTree tree) {
        if (tree instanceof TerminalNode) {
            if (tree instanceof ErrorNode error) {
                System.out.println(ident + "Token: " + tree.getText() + " (" + tree.getClass().getSimpleName() + ")");
            } else {
                System.out.println(ident + "Token: " + tree.getText());
            }
        } else {
            System.out.println(ident + tree.getClass().getSimpleName());
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(ident + "    ", tree.getChild(i));
        }
    }
}
