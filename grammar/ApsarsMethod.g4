grammar ApsarsMethod;

import ApsarsRules, ArgType, ApsarsStatement;

defineMethodUsingTemplate: template
                            identifier
                            // The method body.
                            leftBrace (
                                defineMethodBody                      ?
                            ) rightBrace
;

defineMethod: permissionModifiers                       ?
              alternateStaticAndFinalAndSync            ?
              identifier
              leftParen (
                  // No params, direct done.
                  rightParen                            |
                  // Processes params, with right paren when ending params definition.
                  (
                   methodParamListDefinition rightParen
                  )
              )
              // Return type.
              methodReturnType?
              // The method body.
              leftBrace (
                  defineMethodBody                      ?
              ) rightBrace
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
                 methodReturnType?
                 // The method body.
                 leftBrace (
                     defineMethodBody                      ?
                 ) rightBrace
;

methodReturnType: (
 colon argType
) ;

alternateStaticAndFinalAndSync: ( isFinal | isStatic | isInline | sync ) + ;

defineMethodBody: defineStatement* ;

methodParamListDefinition :
// When param definition, it must have at least one param.
paramType
// And processes extra params.
(comma paramType)*;