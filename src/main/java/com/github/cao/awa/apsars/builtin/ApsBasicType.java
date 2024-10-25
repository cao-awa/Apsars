package com.github.cao.awa.apsars.builtin;

import com.github.cao.awa.apricot.util.io.IOUtil;
import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.lang.TranslateTarget;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public abstract class ApsBasicType {
    public static void generateBuiltin(String stdPath, String stdSourcePath, String packageAt) throws IOException {
        LanguageTranslator<ApsFileAst> translator = LanguageTranslator.translator(TranslateTarget.JAVA, ApsarsTranslateElement.FILE);

        File sources = new File(stdSourcePath);

        File[] files = sources.listFiles();

        if (files == null) {
            return;
        }

        for (File file : files) {
            if (!file.isFile()) {
                continue;
            }

            ApsFileAst apsars = ApsarsBuiltin.readApsars(IOUtil.read(new FileReader(file, StandardCharsets.UTF_8)));

            apsars.prepares();

            String fileName = file.getName();

            if (fileName.contains(".")) {
                fileName = fileName.substring(0, fileName.indexOf(".") + 1) + "java";
            } else {
                fileName = fileName + ".java";
            }

            apsars.print("");

            ApsarsBuiltin.writeTo(stdPath, fileName, translator.postTranslateToString(apsars));
        }
    }
}
