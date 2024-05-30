package com.github.cao.awa.apsars;

import com.github.cao.awa.apricot.util.io.IOUtil;
import com.github.cao.awa.apsars.parser.ApsFileParser;
import com.github.cao.awa.apsars.parser.ApsParser;
import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            String aps = IOUtil.read(new FileReader("aps/sample.aps"));
            System.out.println(aps);
            ApsFileParser parser = (ApsFileParser) ApsParser.parser(ApsElementType.FILE);
            ApsFileAst ast = new ApsFileAst();
            parser.parse(aps, ast);

            ast.preprocess();

            ast.print();

            System.out.println(ast.generateJava());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}