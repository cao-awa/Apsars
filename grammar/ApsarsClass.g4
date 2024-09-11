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

makeAlternateLetAndContent: ( defineLet | defineClassContent) +;

defineClassContent: ( defineMethodUsingTemplate | defineMemberField | defineMethod ) + ;

defineLetClassContent: ( defineLetMemberField | defineLetMethod ) + ;

defineLet: let makeAlternateLet? leftBrace defineLetClassContent? rightBrace;

defineMemberField: permissionModifiers? optionalFieldStaticAndFinal? fieldName colon argType (assignment (resultPresenting | assignmentIdentifier))? semicolon ;

defineLetMemberField: fieldName colon argType (assignment (resultPresenting | assignmentIdentifier))? semicolon ;

fieldName: identifier ;

