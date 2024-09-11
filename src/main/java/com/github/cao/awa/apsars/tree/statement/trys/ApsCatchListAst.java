package com.github.cao.awa.apsars.tree.statement.trys;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Objects;

@Accessors(fluent = true)
public class ApsCatchListAst extends ApsAst {
    private final List<ApsArgTypeAst> catchTargets = ApricotCollectionFactor.arrayList();
    @Getter
    @Setter
    private String catchName;

    public ApsCatchListAst(ApsAst parent) {
        super(parent);
    }

    public void addCatchTarget(ApsArgTypeAst target) {
        target.parent(this);
        this.catchTargets.add(target);
    }

    public ApsCatchListAst targetAll() {
        this.catchTargets.clear();
        addCatchTarget(new ApsArgTypeAst(this).nameIdentity("Throwable"));
        return this;
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps catching: " + this.catchName);
        ident += "    ";

        System.out.println(ident + "|_ catch target: " + this.catchTargets.stream().map(ApsArgTypeAst::generateJava).toList());
    }

    @Override
    public void generateJava(StringBuilder builder) {
        List<ApsArgTypeAst> catchTargets = this.catchTargets;
        int targetsSize = catchTargets.size();
        int edge = targetsSize - 1;
        for (int i = 0; i < targetsSize; i++) {
            ApsArgTypeAst target = catchTargets.get(i);
            target.generateJava(builder);
            if (i != edge) {
                builder.append("|");
            }
        }
        builder.append(" ");
        builder.append(Objects.requireNonNullElse(this.catchName, "ignored"));
    }

    @Override
    public void preprocess() {

    }
}
