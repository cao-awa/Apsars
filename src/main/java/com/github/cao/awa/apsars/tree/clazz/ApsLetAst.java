package com.github.cao.awa.apsars.tree.clazz;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.modifier.ApsAccessibleModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifier;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
public class ApsLetAst extends ApsAst implements ApsModifierRequiredAst<ApsModifier<?>> {
    @Getter
    private final List<ApsModifier<?>> modifiers = ApricotCollectionFactor.arrayList();
    @Getter
    @Setter
    private ApsAccessibleModifier accessible = null;

    public void addModifier(final ApsModifier<?> modifier) {
        this.modifiers.add(modifier);
    }

    @Override
    public void addAccessible(ApsAccessibleModifier modifier) {
        this.accessible = modifier;
    }

    public ApsLetAst(ApsAst parent) {
        super(parent);
    }

    @Override
    public void print(String ident) {

    }

    @Override
    public void preprocess() {
        for (ApsModifier<?> modifier : this.modifiers) {
            ApsMethodKeyword keyword = ApsMethodKeyword.ofNullable(modifier.literal());
            if (keyword != null) {
                ApsMethodModifier methodModifier = ApsMethodModifier.create(keyword);
                for (ApsMethodAst method : findAst(ApsClassAst.class).methods()) {
                    method.addModifierIgnoredPresent(methodModifier);
                }
            }
        }

    }

    @Override
    public void generateJava(StringBuilder builder) {

    }
}
