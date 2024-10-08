package com.github.cao.awa.apsars;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.github.cao.awa.apricot.util.io.IOUtil;
import com.github.cao.awa.apsars.builtin.ApsarsBuiltin;
import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElement;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            ApsTranslator.registerJava();

            ApsarsBuiltin.generateBuiltin(
                    "src/main/java/com/github/cao/awa/apsars/std",
                    "aps/std",
                    "com.github.cao.awa.apsars.std"
            );

            String aps = IOUtil.read(new FileReader("aps/sample.aps"));
            String nativeJava = IOUtil.read(new FileReader("aps/native_java.aps"));

            ApsFileAst ast = ApsarsBuiltin.readApsars(aps);
//            ApsFileAst nativeJavaAst = ApsarsBuiltin.readApsars(nativeJava);

            ast.prepares();
//            nativeJavaAst.prepares();

            System.out.println("-- Struct ");
            JSONObject struct = new JSONObject();
            ast.generateStructure(struct);
            System.out.println(struct.toString(JSONWriter.Feature.PrettyFormat));

            System.out.println("-- Ast struct");
            ast.print();

            System.out.println("-- Generate java");

            String generatedJava = ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.FILE, ast);
            System.out.println(generatedJava);

//            System.out.println("-- Native java");

//            generatedJava = ApsTranslator.translate(TranslateTarget.JAVA, TranslateElement.FILE, nativeJavaAst);
//            System.out.println(generatedJava);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}