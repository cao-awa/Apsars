package com.github.cao.awa.apsars.translate.java;

import com.github.cao.awa.apsars.translate.ApsTranslator;
import com.github.cao.awa.apsars.translate.java.file.ApsFileJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.annotation.ApsAnnotationStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.binder.ApsBinderJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.clazz.ApsClassJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.clazz.param.ApsBindingParameterJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.clazz.param.ApsMemberParameterJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.constant.ApsConstantStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.constant.ApsStringConstantStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.constant.primary.*;
import com.github.cao.awa.apsars.translate.java.file.importing.ApsImportJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.ApsMethodJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.ApsMethodBodyJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.exception.ApsCatchListJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.exception.ApsTryCatchStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.ApsStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.calculate.ApsCalculateStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.control.ApsIfStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.control.ApsReturnStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.control.ApsYieldStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.invoke.ApsInvokeObjectStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.invoke.ApsInvokeStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.invoke.ApsNewInstanceStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.literal.ApsLiteralStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.resulting.ApsResultPresentingStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.resulting.ApsResultingStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.body.statement.variable.ApsVariableStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.extra.ApsMethodExtraCatchJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.param.ApsMethodParameterDefaultJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.param.ApsMethodParameterJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.method.param.ApsMethodParameterListJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.reference.ApsReferenceStatementJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.type.ApsArgTypeJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.type.ApsAstWithVarargsJavaTranslator;
import com.github.cao.awa.apsars.translate.java.file.type.ApsStatementWithVarargsJavaTranslator;
import com.github.cao.awa.apsars.translate.lang.TranslateTarget;
import com.github.cao.awa.apsars.translate.lang.element.TranslateElementEnum;
import com.github.cao.awa.apsars.tree.ApsAst;

public abstract class ApsJavaTranslator<T extends ApsAst> extends ApsTranslator<T> {
    public static void postRegister() {
        registerJava(TranslateElementEnum.FILE, new ApsFileJavaTranslator());

        registerJava(TranslateElementEnum.IMPORT, new ApsImportJavaTranslator());

        registerJava(TranslateElementEnum.ANNOTATION, new ApsAnnotationStatementJavaTranslator());

        registerJava(TranslateElementEnum.CLASS, new ApsClassJavaTranslator());
        registerJava(TranslateElementEnum.MEMBER_PARAMETER, new ApsMemberParameterJavaTranslator());

        registerJava(TranslateElementEnum.BINDER, new ApsBinderJavaTranslator());
        registerJava(TranslateElementEnum.BINDING_PARAMETER, new ApsBindingParameterJavaTranslator());

        registerJava(TranslateElementEnum.METHOD, new ApsMethodJavaTranslator());
        registerJava(TranslateElementEnum.METHOD_EXTRA_CATCH, new ApsMethodExtraCatchJavaTranslator());
        registerJava(TranslateElementEnum.CATCH_LIST, new ApsCatchListJavaTranslator());

        registerJava(TranslateElementEnum.ARG_TYPE, new ApsArgTypeJavaTranslator());
        registerJava(TranslateElementEnum.VARARGS, new ApsAstWithVarargsJavaTranslator());
        registerJava(TranslateElementEnum.STATEMENT_WITH_VARARGS, new ApsStatementWithVarargsJavaTranslator());

        registerJava(TranslateElementEnum.METHOD_PARAMETER_LIST, new ApsMethodParameterListJavaTranslator());
        registerJava(TranslateElementEnum.METHOD_PARAMETER, new ApsMethodParameterJavaTranslator());
        registerJava(TranslateElementEnum.METHOD_PARAMETER_DEFAULT, new ApsMethodParameterDefaultJavaTranslator());

        registerJava(TranslateElementEnum.METHOD_BODY, new ApsMethodBodyJavaTranslator());
        registerJava(TranslateElementEnum.STATEMENT, new ApsStatementJavaTranslator());
        registerJava(TranslateElementEnum.RESULT_PRESENTING_STATEMENT, new ApsResultPresentingStatementJavaTranslator());
        registerJava(TranslateElementEnum.CALCULATE_STATEMENT, new ApsCalculateStatementJavaTranslator());
        registerJava(TranslateElementEnum.IF_STATEMENT, new ApsIfStatementJavaTranslator());
        registerJava(TranslateElementEnum.INVOKE_STATEMENT, new ApsInvokeStatementJavaTranslator());
        registerJava(TranslateElementEnum.INVOKE_OBJECT_STATEMENT, new ApsInvokeObjectStatementJavaTranslator());
        registerJava(TranslateElementEnum.NEW_INSTANCE_STATEMENT, new ApsNewInstanceStatementJavaTranslator());
        registerJava(TranslateElementEnum.LITERAL_STATEMENT, new ApsLiteralStatementJavaTranslator());
        registerJava(TranslateElementEnum.REFERENCE, new ApsReferenceStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT, new ApsConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT_SHORT, new ApsShortConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT_INT, new ApsIntConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT_LONG, new ApsLongConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT_FLOAT, new ApsFloatConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT_DOUBLE, new ApsDoubleConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT_BYTE, new ApsByteConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT_CHAR, new ApsCharConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT_BOOLEAN, new ApsBooleanConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.CONSTANT_STRING, new ApsStringConstantStatementJavaTranslator());
        registerJava(TranslateElementEnum.RESULTING_STATEMENT, new ApsResultingStatementJavaTranslator());
        registerJava(TranslateElementEnum.RETURN_STATEMENT, new ApsReturnStatementJavaTranslator());
        registerJava(TranslateElementEnum.TRY_CATCH_STATEMENT, new ApsTryCatchStatementJavaTranslator());
        registerJava(TranslateElementEnum.VARIABLE_STATEMENT, new ApsVariableStatementJavaTranslator());
        registerJava(TranslateElementEnum.YIELD_STATEMENT, new ApsYieldStatementJavaTranslator());
    }

    @Override
    public TranslateTarget target() {
        return TranslateTarget.JAVA;
    }
}
