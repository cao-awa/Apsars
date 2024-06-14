package com.github.cao.awa.apsars.tree.statement.trys;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Objects;

@Accessors(fluent = true)
public class ApsCatchListAst extends ApsAst {
    private final List<String> catchTargets = ApricotCollectionFactor.arrayList();
    @Getter
    @Setter
    private String catchName;

    public ApsCatchListAst(ApsAst parent) {
        super(parent);
    }

    public void addCatchTarget(String target) {
        this.catchTargets.add(target);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + "|_ Aps catching: " + this.catchName);
        ident += "    ";

        System.out.println(ident + "|_ catch target: " + this.catchTargets);
    }

    @Override
    public void generateJava(StringBuilder builder) {
        List<String> catchTargets = this.catchTargets;
        int targetsSize = catchTargets.size();
        int edge = targetsSize - 1;
        for (int i = 0; i < targetsSize; i++) {
            String target = catchTargets.get(i);
            builder.append(target);
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
