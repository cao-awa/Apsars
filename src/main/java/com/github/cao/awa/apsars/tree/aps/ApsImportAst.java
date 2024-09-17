package com.github.cao.awa.apsars.tree.aps;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
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
    private ApsArgTypeAst argType;
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
    public void preprocess() {
        this.argType = new ApsArgTypeAst(this);
        this.argType.nameIdentity(this.fullName.substring(
                this.fullName.lastIndexOf('.') + 1,
                this.fullName.length() - 1
        ));
    }
}
