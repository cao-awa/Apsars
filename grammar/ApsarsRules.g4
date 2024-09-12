grammar ApsarsRules;

// Permissions.
Public    : 'public'    ;
Private   : 'private'   ;
Protected : 'protected' ;

isPublic    : Public    ;
isPrivate   : Private   ;
isProtected : Protected ;

// Final(s).
Final  : 'final'  ;
Val    : 'val'    ;
Unique : 'unique' ;

isFinal  : Final  ;
isVal    : Val    ;
isUnique : Unique ;

// Let in class define.
Let : 'let' ;

let : Let ;

// Package and import.
Package : 'package' ;
Import  : 'import'  ;

packageAt  : Package ;
importting : Import  ;

// Static(s).
Static : 'static' ;

isStatic : Static ;

// Class(s).
Class      : 'class'  ;
Return     : 'return' ;
Yield      : 'yield'  ;

classKeyword  : Class  ;
returnKeyword : Return ;
yieldKeyword  : Yield  ;

// Member field keywords.
Transient   : 'transient'   ;
Volatile    : 'volatile'    ;
Holder      : 'holder'      ;
HolderGet   : 'holder-get'  ;
HolderSet   : 'holder-set'  ;
Overridable : 'overridable' ;

isTransient   : Transient   ;
isVolatile    : Volatile    ;
isHolder      : Holder      ;
isGetHolder   : HolderGet   ;
isSetHolder   : HolderSet   ;
isOverridable : Overridable ;

// Method keywords.
Sync         : 'sync'         ;
Synchronized : 'synchronized' ;

// Try statement.
Try      : 'try'     ;
Catch    : 'catch'   ;
Ignored  : 'ignored' ;
Print    : 'print'   ;
Deliver  : 'deliver' ;
With     : 'with'    ;
catching : Catch     ;
ignored  : Ignored   ;
print    : Print     ;
deliver  : Deliver   ;
with     : With      ;

isSync         : Sync         ;
isSynchronized : Synchronized ;

sync : isSync | isSynchronized ;

// Template keyword.
template : 'template' ;

// Control statement.
ifKeyword   : 'if'       ;
elseKeyword : 'else'     ;

// Braces.
LeftBrace  : '{'        ;
RightBrace : '}'        ;
leftBrace  : LeftBrace  ;
rightBrace : RightBrace ;

LeftAngleBracket  : '<'               ;
RightAngleBracket : '>'               ;
leftAngleBracket  : LeftAngleBracket  ;
rightAngleBracket : RightAngleBracket ;
lessThan          : LeftAngleBracket  ;
moreThan          : RightAngleBracket ;

LeftBracket  : '['          ;
RightBracket : ']'          ;
leftBracket  : LeftBracket  ;
rightBracket : RightBracket ;

LeftParenthesis  : '('              ;
RightParenthesis : ')'              ;
leftParenthesis  : LeftParenthesis  ;
rightParenthesis : RightParenthesis ;
leftParen        : LeftParenthesis  ;
rightParen       : RightParenthesis ;

// Colon(s).
Colon      : ':' ;
Semicolon  : ';' ;
Comma      : ',' ;

colon      : Colon     ;
semicolon  : Semicolon ;
comma      : Comma     ;

Equals   : '=='   ;
Equal     : '='    ;
LeftEquals : '<-'   ;
As         : ' as ' ;

// Connect sign(s).
AndSign : '&'     ;
OrSign  : '|'     ;
ArgAnd  : ' and ' ;
ArgOr   : ' or '  ;
WordAnd : 'and'   ;
WordOr  : 'or'    ;
and     : AndSign ;
or      : OrSign  ;
argAnd  : ArgAnd  ;
argOr   : ArgOr   ;
wordAnd : WordAnd ;
wordOr  : WordOr  ;

//
Quotation : '"' ;

// Null
Null : ' null' | ' null ' | 'null ' ;
null : Null                         ;

// Boolean.
True  : 'true'       ;
False : 'false'      ;
bool  : True | False ;

assignment: Equal | LeftEquals | As ;

isEquals : Equals ;

Identifier : [a-zA-Z_][a-zA-Z_0-9]*           ;
FullName   : (Identifier '.')+ (Identifier)   ;
Number     : [0-9]+                           ;

fullNameOrIdentifier : FullName | Identifier ;
identifier           : Identifier            ;
fullName             : FullName              ;
number               : Number                ;

WHITESPACES : [ \r\t\n]+ -> skip ;

fieldModifiers: (
                 isTransient   |
                 isVolatile    |
                 (
                 isHolder      |
                  (
                   isGetHolder |
                   isSetHolder
                  ) +
                 )             |
                 isOverridable
) + ;

methodModifiers: isSynchronized |
                 isSync         ;

makeAlternateLet: permissionModifiers              ?
                  (
                   optionalFieldStaticAndFinal     |
                   optionalFieldAndMethodModifiers
) + ;

optionalFieldAndMethodModifiers: ( fieldModifiers | methodModifiers ) +;

optionalFieldStaticAndFinal: ( fieldFinal | isStatic ) + ;

optionalStaticAndFinal: ( isFinal | isStatic ) + ;


permissionModifiers: isPublic    |
                     isPrivate   |
                     isProtected ;

packageIdentifier: (FullName | identifier) ;

fullNameIdentifier: FullName ;

fieldFinal : isVal | isFinal ;

methodFinal : isFinal ;

classFinal: isUnique | isFinal ;

assignmentIdentifier: identifier ;
