package com.github.cao.awa.apsars.tree.statement.trys;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsMethodExtraCatchAst extends ApsAst {
    private ApsMethodBodyAst methodBody;
    private ApsMethodBodyAst catchingMethodBody;
    private ApsCatchListAst catchList;

    public ApsMethodExtraCatchAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps extra catch");
        ident += "    ";
        this.catchList.print(ident);
        if (this.catchingMethodBody != null) {
            this.catchingMethodBody.print(ident);
        }
    }

    @Override
    public void preprocess() {
        this.catchingMethodBody.preprocess();
        this.catchList.preprocess();
    }
}
