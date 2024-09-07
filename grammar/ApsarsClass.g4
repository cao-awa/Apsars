grammar ApsarsClass;

import ApsarsRules, ApsarsMethod;

defineClass: permissionModifiers                    ?
             classFinal                             ?
             class identifier
             leftBrace
             (
              rightBrace                            |
              makeAlternateLetAndContent? rightBrace
             )
;

makeAlternateLetAndContent: (defineLet | defineClassContent)+;

defineClassContent: (defineMethod | defineMemberField)+ ;

defineLet: let makeAlternateLet? leftBrace defineClassContent? rightBrace;

defineMemberField: permissionModifiers? optionalFieldStaticAndFinal identifier colon identifier (assignment defineStatement)? semicolon ;
