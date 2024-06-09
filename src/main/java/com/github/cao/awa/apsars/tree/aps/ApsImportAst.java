package com.github.cao.awa.apsars.tree.aps;

import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class ApsImportAst extends ApsAst {
    @Setter
    @Getter
    private String fullName;
    @Setter
    @Getter
    private boolean importStatic;
    @Setter
    @Getter
    private boolean importAll;

    public ApsImportAst(ApsFileAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps import: " + this.fullName);
    }

    @Override
    public String generateJava() {
        StringBuilder builder = new StringBuilder();
        builder.append("import ");
        if (this.importStatic) {
            builder.append("static ");
        }
        builder.append(this.fullName);
        if (this.importAll) {
            builder.append(".*");
        }
        builder.append(";");
        return builder.toString();
    }

    @Override
    public void preprocess() {

    }
}
