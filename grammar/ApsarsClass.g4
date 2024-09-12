grammar ApsarsClass;

import ApsarsRules, ApsarsMethod;

defineClass: permissionModifiers                    ?
             classFinal                             ?
             classKeyword identifier
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

defineMemberField: defineApsarsMemberField | defineJavaMemberField ;

defineJavaMemberField: permissionModifiers? optionalFieldStaticAndFinal? argType fieldName (assignment (resultPresenting | assignmentIdentifier))? semicolon ;

defineApsarsMemberField: permissionModifiers? optionalFieldStaticAndFinal? fieldName colon argType (assignment (resultPresenting | assignmentIdentifier))? semicolon ;

defineLetMemberField: defineApsarsLetMemberField | defineJavaLetMemberField ;

defineJavaLetMemberField: fieldName colon argType (assignment (resultPresenting | assignmentIdentifier))? semicolon ;

defineApsarsLetMemberField: argType fieldName (assignment (resultPresenting | assignmentIdentifier))? semicolon ;

fieldName: identifier ;

