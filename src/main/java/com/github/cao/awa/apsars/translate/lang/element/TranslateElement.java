package com.github.cao.awa.apsars.translate.lang.element;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.aps.ApsImportAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBinderAst;
import com.github.cao.awa.apsars.tree.clazz.inherit.ApsBindingParameterAst;
import com.github.cao.awa.apsars.tree.global.ApsGlobalAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import com.github.cao.awa.apsars.tree.method.parameter.preset.ApsMethodParameterDefaultValueAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.calculate.ApsCalculateAst;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import com.github.cao.awa.apsars.tree.statement.constant.ApsStringAst;
import com.github.cao.awa.apsars.tree.statement.constant.primary.*;
import com.github.cao.awa.apsars.tree.statement.control.ApsIfStatementAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeObjectAst;
import com.github.cao.awa.apsars.tree.statement.result.*;
import com.github.cao.awa.apsars.tree.statement.result.instance.ApsNewInstanceStatementAst;
import com.github.cao.awa.apsars.tree.statement.special.literal.ApsLiteralStatementAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsCatchListAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsMethodExtraCatchAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsTryCatchAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.apsars.tree.vararg.ApsAstWithVarargs;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

import java.util.Map;

public class TranslateElement {
    private static final Map<Class<?>, TranslateElementData<?>> elements = ApricotCollectionFactor.hashMap();

    public static TranslateElementData<ApsFileAst> FILE = create(ApsFileAst.class, TranslateElementEnum.FILE);

    public static TranslateElementData<ApsImportAst> IMPORT = create(ApsImportAst.class, TranslateElementEnum.IMPORT);

    public static TranslateElementData<ApsGlobalAst> GLOBAL = create(ApsGlobalAst.class, TranslateElementEnum.GLOBAL);

    public static TranslateElementData<ApsClassAst> CLASS = create(ApsClassAst.class, TranslateElementEnum.CLASS);
    public static TranslateElementData<ApsMemberParameterAst> MEMBER_PARAMETER = create(ApsMemberParameterAst.class, TranslateElementEnum.MEMBER_PARAMETER);
    public static TranslateElementData<ApsBinderAst> BINDER = create(ApsBinderAst.class, TranslateElementEnum.BINDER);
    public static TranslateElementData<ApsBindingParameterAst> BINDING_PARAMETER = create(ApsBindingParameterAst.class, TranslateElementEnum.BINDING_PARAMETER);

    public static TranslateElementData<ApsAnnotationAst> ANNOTATION = create(ApsAnnotationAst.class, TranslateElementEnum.ANNOTATION);

    public static TranslateElementData<ApsMethodAst> METHOD = create(ApsMethodAst.class, TranslateElementEnum.METHOD);
    public static TranslateElementData<ApsMethodExtraCatchAst> METHOD_EXTRA_CATCH = create(ApsMethodExtraCatchAst.class, TranslateElementEnum.METHOD_EXTRA_CATCH);
    public static TranslateElementData<ApsCatchListAst> CATCH_LIST = create(ApsCatchListAst.class, TranslateElementEnum.CATCH_LIST);

    public static TranslateElementData<ApsArgTypeAst> ARG_TYPE = create(ApsArgTypeAst.class, TranslateElementEnum.ARG_TYPE);
    public static TranslateElementData<ApsAstWithVarargs> VARARGS = create(ApsAstWithVarargs.class, TranslateElementEnum.VARARGS);

    public static TranslateElementData<ApsMethodParameterAst> METHOD_PARAMETER_LIST = create(ApsMethodParameterAst.class, TranslateElementEnum.METHOD_PARAMETER_LIST);
    public static TranslateElementData<ApsMethodParamElementAst> METHOD_PARAMETER = create(ApsMethodParamElementAst.class, TranslateElementEnum.METHOD_PARAMETER);
    public static TranslateElementData<ApsMethodParameterDefaultValueAst> METHOD_PARAMETER_DEFAULT = create(ApsMethodParameterDefaultValueAst.class, TranslateElementEnum.METHOD_PARAMETER_DEFAULT);

    public static TranslateElementData<ApsMethodBodyAst> METHOD_BODY = create(ApsMethodBodyAst.class, TranslateElementEnum.METHOD_BODY);
    public static TranslateElementData<ApsStatementAst> STATEMENT = create(ApsStatementAst.class, TranslateElementEnum.STATEMENT);
    public static TranslateElementData<ApsResultPresentingAst> RESULT_PRESENTING_STATEMENT = create(ApsResultPresentingAst.class, TranslateElementEnum.RESULT_PRESENTING_STATEMENT);
    public static TranslateElementData<ApsCalculateAst> CALCULATE_STATEMENT = create(ApsCalculateAst.class, TranslateElementEnum.CALCULATE_STATEMENT);
    public static TranslateElementData<ApsIfStatementAst> IF_STATEMENT = create(ApsIfStatementAst.class, TranslateElementEnum.IF_STATEMENT);
    public static TranslateElementData<ApsInvokeAst> INVOKE_STATEMENT = create(ApsInvokeAst.class, TranslateElementEnum.INVOKE_STATEMENT);
    public static TranslateElementData<ApsInvokeObjectAst> INVOKE_OBJECT_STATEMENT = create(ApsInvokeObjectAst.class, TranslateElementEnum.INVOKE_OBJECT_STATEMENT);
    public static TranslateElementData<ApsLiteralStatementAst> LITERAL_STATEMENT = create(ApsLiteralStatementAst.class, TranslateElementEnum.LITERAL_STATEMENT);
    public static TranslateElementData<ApsRefReferenceAst> REFERENCE = create(ApsRefReferenceAst.class, TranslateElementEnum.REFERENCE);
    public static TranslateElementData<ApsConstantAst> CONSTANT = create(ApsConstantAst.class, TranslateElementEnum.CONSTANT);
    public static TranslateElementData<ApsShortAst> CONSTANT_SHORT = create(ApsShortAst.class, TranslateElementEnum.CONSTANT_SHORT);
    public static TranslateElementData<ApsIntAst> CONSTANT_INT = create(ApsIntAst.class, TranslateElementEnum.CONSTANT_INT);
    public static TranslateElementData<ApsLongAst> CONSTANT_LONG = create(ApsLongAst.class, TranslateElementEnum.CONSTANT_LONG);
    public static TranslateElementData<ApsByteAst> CONSTANT_BYTE = create(ApsByteAst.class, TranslateElementEnum.CONSTANT_BYTE);
    public static TranslateElementData<ApsCharAst> CONSTANT_CHAR = create(ApsCharAst.class, TranslateElementEnum.CONSTANT_CHAR);
    public static TranslateElementData<ApsFloatAst> CONSTANT_FLOAT = create(ApsFloatAst.class, TranslateElementEnum.CONSTANT_FLOAT);
    public static TranslateElementData<ApsDoubleAst> CONSTANT_DOUBLE = create(ApsDoubleAst.class, TranslateElementEnum.CONSTANT_DOUBLE);
    public static TranslateElementData<ApsBooleanAst> CONSTANT_BOOLEAN = create(ApsBooleanAst.class, TranslateElementEnum.CONSTANT_BOOLEAN);
    public static TranslateElementData<ApsStringAst> CONSTANT_STRING = create(ApsStringAst.class, TranslateElementEnum.CONSTANT_STRING);
    public static TranslateElementData<ApsNewInstanceStatementAst> NEW_INSTANCE_STATEMENT = create(ApsNewInstanceStatementAst.class, TranslateElementEnum.NEW_INSTANCE_STATEMENT);
    public static TranslateElementData<ApsResultingStatementAst> RESULTING_STATEMENT = create(ApsResultingStatementAst.class, TranslateElementEnum.RESULTING_STATEMENT);
    public static TranslateElementData<ApsReturnAst> RETURN_STATEMENT = create(ApsReturnAst.class, TranslateElementEnum.RETURN_STATEMENT);
    public static TranslateElementData<ApsTryCatchAst> TRY_CATCH_STATEMENT = create(ApsTryCatchAst.class, TranslateElementEnum.TRY_CATCH_STATEMENT);
    public static TranslateElementData<ApsVariableAst> VARIABLE_STATEMENT = create(ApsVariableAst.class, TranslateElementEnum.VARIABLE_STATEMENT);
    public static TranslateElementData<ApsYieldAst> YIELD_STATEMENT = create(ApsYieldAst.class, TranslateElementEnum.YIELD_STATEMENT);

    public static <X extends ApsAst> TranslateElementData<X> create(Class<X> ast, TranslateElementEnum type) {
        TranslateElementData<X> elementData = new TranslateElementData<>(ast, type);
        elements.put(ast, elementData);
        return elementData;
    }

    public static <X extends ApsAst> TranslateElementData<X> byType(Class<X> type) {
        return Manipulate.cast(elements.get(type));
    }
}
