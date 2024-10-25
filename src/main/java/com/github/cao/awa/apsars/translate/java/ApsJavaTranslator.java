package com.github.cao.awa.apsars.translate.java;

import com.github.cao.awa.apsars.element.ApsarsTranslateElement;
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
import com.github.cao.awa.language.translator.translate.LanguageTranslator;
import com.github.cao.awa.language.translator.translate.lang.TranslateTarget;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public abstract class ApsJavaTranslator<T extends LanguageAst> extends LanguageTranslator<T> {
    public static void postRegister() {
        registerJava(ApsarsTranslateElement.FILE, new ApsFileJavaTranslator());

        registerJava(ApsarsTranslateElement.IMPORT, new ApsImportJavaTranslator());

        registerJava(ApsarsTranslateElement.ANNOTATION, new ApsAnnotationStatementJavaTranslator());

        registerJava(ApsarsTranslateElement.CLASS, new ApsClassJavaTranslator());
        registerJava(ApsarsTranslateElement.MEMBER_PARAMETER, new ApsMemberParameterJavaTranslator());

        registerJava(ApsarsTranslateElement.BINDER, new ApsBinderJavaTranslator());
        registerJava(ApsarsTranslateElement.BINDING_PARAMETER, new ApsBindingParameterJavaTranslator());

        registerJava(ApsarsTranslateElement.METHOD, new ApsMethodJavaTranslator());
        registerJava(ApsarsTranslateElement.METHOD_EXTRA_CATCH, new ApsMethodExtraCatchJavaTranslator());
        registerJava(ApsarsTranslateElement.CATCH_LIST, new ApsCatchListJavaTranslator());

        registerJava(ApsarsTranslateElement.ARG_TYPE, new ApsArgTypeJavaTranslator());
        registerJava(ApsarsTranslateElement.VARARGS, new ApsAstWithVarargsJavaTranslator());
        registerJava(ApsarsTranslateElement.STATEMENT_WITH_VARARGS, new ApsStatementWithVarargsJavaTranslator());

        registerJava(ApsarsTranslateElement.METHOD_PARAMETER_LIST, new ApsMethodParameterListJavaTranslator());
        registerJava(ApsarsTranslateElement.METHOD_PARAMETER, new ApsMethodParameterJavaTranslator());
        registerJava(ApsarsTranslateElement.METHOD_PARAMETER_DEFAULT, new ApsMethodParameterDefaultJavaTranslator());

        registerJava(ApsarsTranslateElement.METHOD_BODY, new ApsMethodBodyJavaTranslator());
        registerJava(ApsarsTranslateElement.STATEMENT, new ApsStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.RESULT_PRESENTING_STATEMENT, new ApsResultPresentingStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CALCULATE_STATEMENT, new ApsCalculateStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.IF_STATEMENT, new ApsIfStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.INVOKE_STATEMENT, new ApsInvokeStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.INVOKE_OBJECT_STATEMENT, new ApsInvokeObjectStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.NEW_INSTANCE_STATEMENT, new ApsNewInstanceStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.LITERAL_STATEMENT, new ApsLiteralStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.REFERENCE, new ApsReferenceStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT, new ApsConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_NULL, new ApsNullConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_SHORT, new ApsShortConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_INT, new ApsIntConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_LONG, new ApsLongConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_FLOAT, new ApsFloatConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_DOUBLE, new ApsDoubleConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_BYTE, new ApsByteConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_CHAR, new ApsCharConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_BOOLEAN, new ApsBooleanConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.CONSTANT_STRING, new ApsStringConstantStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.RESULTING_STATEMENT, new ApsResultingStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.RETURN_STATEMENT, new ApsReturnStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.TRY_CATCH_STATEMENT, new ApsTryCatchStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.VARIABLE_STATEMENT, new ApsVariableStatementJavaTranslator());
        registerJava(ApsarsTranslateElement.YIELD_STATEMENT, new ApsYieldStatementJavaTranslator());
    }

    @Override
    public TranslateTarget target() {
        return TranslateTarget.JAVA;
    }
}
