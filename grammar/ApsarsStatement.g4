grammar ApsarsStatement;

import ApsarsRules, ArgType, ApsarsMethod;

defineStatement: theStatement+ ;

theStatement: (tryStatement | resultingStatement | defineVariableStatement) semicolon?;

resultingStatement: invokeStatement ;

// xxx(param?)
invokeStatement: fullNameOrIdentifier leftParen invokeParamList? rightParen ;

tryStatement: Try
              leftBrace (
               tryStatementBody
              ) rightBrace
              (
               (
                catching
                leftParen (
                 tryCatchList
                ) rightParen
                leftBrace (
                 catchingStatementBody ?
                ) rightBrace
               )                       |
               (
                ignored
                semicolon
               )
              )
;

tryStatementBody: defineMethodBody ;

catchingStatementBody: defineMethodBody ;

tryCatchList: identifier colon argType tryCatchListExtraType* ;

tryCatchListExtraType: (or | wordOr) argType ;

invokeParamList: validInvokeParam validExtraInvokeParam* ;

validInvokeParam: (resultPresenting | validToken);

validExtraInvokeParam: comma validInvokeParam;

resultPresenting: resultingStatement | constant;

// <type> <name>
// <type> <name> = <value>
defineVariableStatement: argType identifier (assignment resultPresenting)? ;
