grammar PureArgType;

import PureApsarsRules;

paramType: identifier colon argType ;

argType: identifier typedArgType? arrayArgType? ;

extraArgTypes: (comma | and | argAnd | or) argType ;

typedArgType: leftAngleBracket argType extraArgTypes* rightAngleBracket ;

arrayArgType: arrayDefinition* ;

arrayDefinition: leftBracket number? rightBracket ;

tokenList: validToken extraToken*;

validToken: (identifier | constant) ;

extraToken: comma validToken ;

constant: ( string | number | null | bool);

string: Quotation identifierOrSpace* Quotation;

identifierOrSpace: identifier | spacing ;

spacing: '\\{' number? '}' ;