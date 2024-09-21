grammar ApsarsMethod;

import ApsarsRules, ArgType, ApsarsStatement;

defineMethodUsingTemplate: template
                           identifier
                           // The method body.
                           leftBrace (
                               defineMethodBody ?
                           ) rightBrace
                           // Someone would like follow the semicolon wieh ending method defines.
                           semicolon            ?
;

defineMethod: permissionModifiers            ?
              alternateMethodModifiers       ?
              identifier
              leftParen (
                  // No params, direct done.
                  rightParen                 |
                  // Processes params, with right paren when ending params definition.
                  (
                   methodParamListDefinition
                   rightParen
                  )
              )
              // Return type.
              methodReturnType?
              (
               (
                (
                 Equal | RightPointing
                )
                (
                 resultPresenting            |
                 defineVariableStatement
                )
               )                             |
               (
                // The method body.
                leftBrace (
                    defineMethodBody         ?
                ) rightBrace
               )
              )
              // Someone would like follow the semicolon wieh ending method defines.
              semicolon                      ?
;

defineJavaMethod: permissionModifiers            ?
                  alternateMethodModifiers       ?
                  argType
                  identifier
                  leftParen (
                      // No params, direct done.
                      rightParen                 |
                      // Processes params, with right paren when ending params definition.
                      (
                       methodParamListDefinition
                       rightParen
                      )
                  )
                  (
                   (
                    (
                     Equal | RightPointing
                    )
                    (
                     resultPresenting            |
                     defineVariableStatement
                    )
                   )                             |
                   (
                    // The method body.
                    leftBrace (
                        defineMethodBody         ?
                    ) rightBrace
                   )
                  )
                  // Someone would like follow the semicolon wieh ending method defines.
                  semicolon                      ?
;

defineConstructor: permissionModifiers            ?
                   constructor
                   leftParen (
                       // No params, direct done.
                       rightParen                 |
                       // Processes params, with right paren when ending params definition.
                       (
                        methodParamListDefinition
                        rightParen
                       )
                   )
                   (
                    leftBrace (
                        defineMethodBody
                    ) rightBrace
                    semicolon                     ?
                   )
;

defineLetMethod: identifier
                 leftParen (
                     // No params, direct done.
                     rightParen                            |
                     // Processes params, with right paren when ending params definition.
                     (
                      methodParamListDefinition rightParen
                     )
                 )
                 // Return type.
                 methodReturnType                          ?
                 (
                  // The method body.
                  leftBrace (
                      defineMethodBody                     ?
                  ) rightBrace
                 )
                 // Someone would like follow the semicolon wieh ending method defines.
                 semicolon                                 ?
;

methodReturnType: (
 colon argType
) ;

alternateMethodModifiers: ( isFinal | isStatic | isInline | sync ) + ;

defineMethodBody: defineStatement* ;

methodParamListDefinition :
// When param definition, it must have at least one param.
paramType
// And processes extra params.
(comma paramType)*;