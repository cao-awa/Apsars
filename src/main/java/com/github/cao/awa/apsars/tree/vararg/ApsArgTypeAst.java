package com.github.cao.awa.apsars.tree.vararg;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.LinkedList;

@Getter
@Accessors(fluent = true)
public class ApsArgTypeAst extends ApsAst {
    public static final ApsArgTypeAst UNKNOWN = new ApsArgTypeAst(null);
    private final LinkedList<ApsArgTypeAst> args = ApricotCollectionFactor.linkedList();
    @Setter
    private String nameIdentity;
    @Setter
    private boolean arrayArgType = false;
    @Setter
    private int arraySize = -1;
    @Setter
    private int arrayDepth = 1;

    public ApsArgTypeAst(ApsAst parent) {
        super(parent);
    }

    public void addArg(ApsArgTypeAst argType) {
        this.args.add(argType);
    }

    @Override
    public void print(String ident) {
        StringBuilder varargCountBuilder = new StringBuilder();
        if (!this.args.isEmpty()) {
            varargCountBuilder.append("<");
            varargCountBuilder.append("?, ".repeat(this.args.size()));
            varargCountBuilder.delete(varargCountBuilder.length() - 2, varargCountBuilder.length());
            varargCountBuilder.append(">");
        }
        System.out.println(ident + "|_ " + this.nameIdentity + varargCountBuilder + (this.arrayArgType ? "[?]".repeat(this.arrayDepth) : ""));
        for (ApsArgTypeAst argType : this.args) {
            argType.print(ident + "    ");
        }
    }

    @Override
    public void preprocess() {

    }
}
