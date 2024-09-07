package com.github.cao.awa.apsars;

import com.github.cao.awa.apricot.util.io.IOUtil;
import com.github.cao.awa.apsars.antlr.ApsarsLexer;
import com.github.cao.awa.apsars.antlr.ApsarsParser;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.visitor.ApsarsTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            String aps = IOUtil.read(new FileReader("aps/sample.aps"));
            System.out.println(aps);

            ApsarsLexer lexer = new ApsarsLexer(CharStreams.fromString(aps));
            TokenStream tokens = new CommonTokenStream(lexer);
            ApsarsParser parser = new ApsarsParser(tokens);
            ParseTree programContext = parser.program();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    throw new RuntimeException("Expected symbol '" + offendingSymbol + "' but error in line " + line + " chars " + charPositionInLine + ": " + msg, e);
                }
            });

            printTree("", programContext);

            System.out.println("---------");

            System.out.println(programContext.getText());

            System.out.println("-- Visiting");

            ApsarsTreeVisitor visitor = new ApsarsTreeVisitor();
            ApsAst ast = visitor.visit(programContext);

            ast.print();

            System.out.println(ast);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printTree(String ident, ParseTree tree) {
        if (tree instanceof TerminalNode) {
            if (tree instanceof ErrorNode error) {
                System.out.println(error.getSymbol().getTokenSource());
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