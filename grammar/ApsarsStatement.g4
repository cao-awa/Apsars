grammar ApsarsStatement;

import ApsarsRules, ArgType, ApsarsMethod;

defineStatement: theStatement+ ;

theStatement: (tryStatement | resultingStatement | defineVariableStatement | returnStatement | yieldStatement ) semicolon?;

resultingStatement: invokeStatement | ifStatement ;

ifStatement: ifKeyword
             leftParen (
              resultPresenting   |
              comparingStatement
             ) rightParen
             statementBlock
             (
              (
               elseIfStatement
              )                  |
              (
               elseStatement
              )
             ) ?
;

elseIfStatement: elseKeyword ifStatement ;

elseStatement: elseKeyword statementBlock ;

statementBlock: leftBrace (
                 defineMethodBody
                ) rightBrace
;

returnStatement: returnKeyword resultPresenting ;

yieldStatement: yieldKeyword resultPresenting ;

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

resultPresenting: constant | resultingStatement ;

comparingStatement: resultPresenting (moreThan | lessThan) resultPresenting ;

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

// <type> <name>
// <type> <name> = <value>
defineVariableStatement: argType? variableName (assignment ( resultPresenting | assignmentIdentifier ))? ;

variableName: identifier ;

