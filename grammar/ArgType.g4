grammar ArgType;

import ApsarsRules;

paramType: identifier colon argType ;

argType: identifier typedArgType? arrayArgType? ;

extraArgTypes: (comma | and | argAnd | or) argType ;

typedArgType: leftAngleBracket argType extraArgTypes* rightAngleBracket ;

arrayArgType: arrayDefinition* ;

arrayDefinition: leftBracket number? rightBracket ;