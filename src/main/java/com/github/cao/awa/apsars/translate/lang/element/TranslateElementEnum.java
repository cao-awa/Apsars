package com.github.cao.awa.apsars.translate.lang.element;

public enum TranslateElementEnum {
    FILE,

    IMPORT,

    // >> START GLOBAL
    GLOBAL,
    // -- END GLOBAL

    // >> START CLASS.
    CLASS,
    MEMBER_PARAMETER,
    BINDER,
    BINDING_PARAMETER,

    ANNOTATION,

    METHOD,
    METHOD_EXTRA_CATCH,

    ARG_TYPE,
    VARARGS,
    STATEMENT_WITH_VARARGS,

    // >> START METHOD PARAMETER
    METHOD_PARAMETER_LIST,
    METHOD_PARAMETER,
    METHOD_PARAMETER_DEFAULT,
    // -- END METHOD PARAMETER

    METHOD_BODY,

    // >> START STATEMENTS.
    STATEMENT,
    RESULT_PRESENTING_STATEMENT,
    CALCULATE_STATEMENT,
    IF_STATEMENT,
    INVOKE_STATEMENT,
    INVOKE_OBJECT_STATEMENT,
    LITERAL_STATEMENT,
    NEW_INSTANCE_STATEMENT,
    RESULTING_STATEMENT,
    RETURN_STATEMENT,

    TRY_CATCH_STATEMENT,
    CATCH_LIST,

    VARIABLE_STATEMENT,
    YIELD_STATEMENT,
    // -- END STATEMENTS

    // -- END CLASS
}
