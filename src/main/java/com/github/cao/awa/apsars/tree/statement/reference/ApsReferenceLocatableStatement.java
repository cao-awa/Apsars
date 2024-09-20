package com.github.cao.awa.apsars.tree.statement.reference;

import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;

import java.util.Collection;

public interface ApsReferenceLocatableStatement {
    Collection<ApsVariableAst> variables();

    ApsReferenceLocatableStatement parentLocator();
}
