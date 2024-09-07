grammar ApsarsMethod;

import ApsarsRules, ArgType;

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

methodReturnType: (
 colon argType
) ;

alternateStaticAndFinalAndSync: (
                                  optionalStaticAndFinal ? sync                     ? |
                                  sync                   ? optionalStaticAndFinal   ? |
                                 (optionalStaticAndFinal   sync                   ) ? |
                                 (sync                     optionalStaticAndFinal ) ?
) ;

defineMethodBody: defineStatement* ;

defineStatement: number;

methodParamListDefinition :
// When param definition, it must have at least one param.
paramType
// And processes extra params.
(comma paramType)*;