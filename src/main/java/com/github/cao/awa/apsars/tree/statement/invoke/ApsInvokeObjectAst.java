package com.github.cao.awa.apsars.tree.statement.invoke;

import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.statement.result.ApsResultPresentingAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
public class ApsInvokeObjectAst extends ApsInvokeAst {
    private String objectName;

    public ApsInvokeObjectAst addParam(ApsResultPresentingAst param) {
        params().add(param);
        return this;
    }

    public ApsInvokeObjectAst(ApsAst ast) {
        super(ast);
    }

    @Override
    public ApsArgTypeAst resultingType() {
        return ApsArgTypeAst.UNKNOWN;
    }

    @Override
    public void print(String ident, boolean endElement) {
        super.print(ident, endElement);
    }

    @Override
    public void preprocess() {

    }
}
