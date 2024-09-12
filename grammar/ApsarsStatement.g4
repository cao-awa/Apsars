grammar ApsarsStatement;

import ApsarsRules, ArgType, ApsarsMethod;

defineStatement: theStatement+ ;

theStatement: (tryStatement | resultingStatement | defineVariableStatement | returnStatement | yieldStatement ) semicolon?;

resultPresenting: constant | resultingStatement ;

resultingStatement: invokeStatement | newInstanceStatement | ifStatement | calculateStatement ;

calculatableResultPresenting: calculateStatementWithParen | invokeStatement | newInstanceStatement | constant ;

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

calculateStatementWithParen: leftParen ( calculateLeftStatementWithParen ) rightParen (operator ( calculateRightStatementWithParen ))? ;

calculateLeftStatementWithParen: calculateStatement | calculatableResultPresenting ;

calculateRightStatementWithParen: calculateStatement | calculatableResultPresenting ;

calculateStatement: (calculateLeft operator calculateRight extraCalculateStatement*) | (calculateStatementWithTotalParen extraCalculateStatement*) | calculateStatementWithParen ;

calculateStatementWithTotalParen: leftParen calculateLeft operator calculateRight extraCalculateStatement* rightParen;

calculateLeft: calculatableResultPresenting ;

calculateRight: calculatableResultPresenting ;

extraCalculateStatement: operator calculatableResultPresenting ;

returnStatement: returnKeyword resultPresenting ;

yieldStatement: yieldKeyword resultPresenting ;

// xxx(param?)
invokeStatement: fullNameOrIdentifier leftParen invokeParamList? rightParen fluentInvokeStatement*;

fluentInvokeStatement: point identifier leftParen invokeParamList? rightParen ;

newInstanceStatement: newKeyword identifier leftParen invokeParamList? rightParen ;

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

