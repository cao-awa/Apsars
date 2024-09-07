package com.github.cao.awa.apsars.tree.vararg;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.LinkedList;

@Accessors(fluent = true)
public class ApsArgTypeAst extends ApsAst {
    private final LinkedList<ApsArgTypeAst> args = ApricotCollectionFactor.linkedList();
    @Getter
    @Setter
    private String nameIdentity;
    @Getter
    @Setter
    private boolean arrayArgType = false;
    @Getter
    @Setter
    private int arraySize = -1;
    @Getter
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
    public void generateJava(StringBuilder builder) {
        builder.append(this.nameIdentity);
        if (!this.args.isEmpty()) {
            builder.append("<");
            LinkedList<ApsArgTypeAst> args = this.args;
            int size = args.size();
            int edge = size - 1;
            for (int i = 0; i < size; i++) {
                ApsArgTypeAst arg = args.get(i);
                arg.generateJava(builder);
                if (i != edge) {
                    builder.append(",");
                }
            }
            builder.append(">");
        }
        if (this.arrayArgType) {
            int depth = this.arrayDepth;
            while (depth-- > 0) {
                builder.append("[");
                if (this.arraySize == 1) {
                    builder.append(this.arraySize);
                }
                builder.append("]");
            }
        }
    }

    @Override
    public void preprocess() {

    }
}
