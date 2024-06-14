package com.github.cao.awa.apsars;

import com.github.cao.awa.apricot.util.io.IOUtil;
import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.ApsFileParser;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.global.ApsGlobalAst;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            String aps = IOUtil.read(new FileReader("aps/sample.aps"));
            System.out.println(aps);
            ApsGlobalAst.global = new ApsGlobalAst();
            ApsFileParser parser = (ApsFileParser) ApsParser.parser(ApsElementType.FILE);
            ApsFileAst ast = new ApsFileAst();
            parser.parse(aps, ast);

            ast.preprocess();
            ast.postprocess();
            ast.finalProcess();

            ast.print();

            System.out.println("-- Global build");
            StringBuilder builder = new StringBuilder();
            ApsGlobalAst.global.generateJava(builder);
            System.out.println(builder);

            System.out.println("-- File build");
            builder.setLength(0);
            ast.generateJava(builder);
            System.out.println(builder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}