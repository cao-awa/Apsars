package com.github.cao.awa.apsars.tree.statement.trys;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public abstract class ApsAstWithCatching extends ApsAst {
    @Getter
    @Setter
    private ApsCatchListAst catchList;
    @Getter
    @Setter
    private ApsMethodBodyAst catchingMethodBody;

    public ApsAstWithCatching(ApsAst parent) {
        super(parent);
    }

    @Override
    public String generateJava() {
        return this.catchList.generateJava();
    }
}
