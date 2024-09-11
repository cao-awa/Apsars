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

makeAlternateLetAndContent: (defineLet | defineClassContent) +;

defineClassContent: (defineMethodUsingTemplate | defineMethod | defineMemberField) + ;

defineLetClassContent: (defineLetMethod | defineLetMemberField) + ;

defineLet: let makeAlternateLet? leftBrace defineLetClassContent? rightBrace;

defineMemberField: permissionModifiers? optionalFieldStaticAndFinal identifier colon argType (assignment resultPresenting)? semicolon ;

defineLetMemberField: identifier colon argType (assignment resultPresenting)? semicolon ;

