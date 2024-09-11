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
               )                       |
               (
                print
                semicolon
               )                       |
               (
                deliver
                refCall
                (
                 with
                 withMessage
                )                      ?
               )
              )
;

refCall: refCallFrom colon colon refCallMethod ;

refCallFrom: identifier ;

refCallMethod: identifier ;

withMessage: validInvokeParam ;

tryStatementBody: defineMethodBody ;

catchingStatementBody: defineMethodBody ;

tryCatchList: identifier colon argType tryCatchListExtraType* ;

tryCatchListExtraType: (or | wordOr) argType ;

invokeParamList: validInvokeParam validExtraInvokeParam* ;

validInvokeParam: ( validToken | resultPresenting );

validExtraInvokeParam: comma validInvokeParam;

resultPresenting: constant | resultingStatement ;

// <type> <name>
// <type> <name> = <value>
defineVariableStatement: argType variableName (assignment ( resultPresenting | assignmentIdentifier ))? ;

variableName: identifier ;

