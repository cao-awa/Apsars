grammar PureApsarsClass;

import PureApsarsRules, PureApsarsMethod;

defineClass: annotation                             *
             permissionModifiers                    ?
             classFinal                             ?
             classKeyword identifier
             leftBrace
             (
              rightBrace                            |
              makeAlternateLetAndContent? rightBrace
             )
;

makeAlternateLetAndContent: ( defineLet | defineClassContent) +;

defineClassContent: ( defineMethodUsingTemplate | defineMemberField | defineConstructor | defineMethod ) + ;

defineLetClassContent: ( defineLetMemberField | defineLetMethod ) + ;

defineLet: let makeAlternateLet? leftBrace defineLetClassContent? rightBrace;

defineMemberField: permissionModifiers? optionalFieldStaticAndFinal? fieldName colon argType (assignment (resultPresenting | assignmentIdentifier))? semicolon ;

defineLetMemberField: argType fieldName (assignment (resultPresenting | assignmentIdentifier))? semicolon ;

fieldName: identifier ;

