package com.github.cao.awa.apsars.tree.statement.calculate.symbol;

import com.github.cao.awa.apsars.tree.statement.calculate.symbol.arithmetic.*;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.comparing.*;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.not.ApsNotSymbol;

public class ApsOperators {
    public static final ApsNotSymbol NOT = new ApsNotSymbol(null);

    public static final ApsMinusSymbol MINUS = new ApsMinusSymbol(null);
    public static final ApsPlusSymbol PLUS = new ApsPlusSymbol(null);
    public static final ApsMultiplySymbol MULTIPLY = new ApsMultiplySymbol(null);
    public static final ApsDivideSymbol DIVIDE = new ApsDivideSymbol(null);
    public static final ApsPowSymbol POW = new ApsPowSymbol(null);

    public static final ApsEqualsSymbol EQUALS = new ApsEqualsSymbol(null);

    public static final ApsMoreThanSymbol MORE_THAN = new ApsMoreThanSymbol(null);
    public static final ApsLessThanSymbol LESS_THAN = new ApsLessThanSymbol(null);

    public static final ApsAndSymbol AND = new ApsAndSymbol(null);
    public static final ApsBreakingAndSymbol BREAKING_AND = new ApsBreakingAndSymbol(null);
    public static final ApsOrSymbol OR = new ApsOrSymbol(null);
    public static final ApsBreakingOrSymbol BREAKING_OR = new ApsBreakingOrSymbol(null);

}
