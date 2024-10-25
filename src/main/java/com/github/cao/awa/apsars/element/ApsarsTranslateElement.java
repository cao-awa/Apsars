package com.github.cao.awa.apsars.element;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
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
import com.github.cao.awa.apsars.tree.vararg.ApsStatementWithVarargs;
import com.github.cao.awa.language.translator.translate.lang.element.TranslateElementData;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

import java.util.Map;

public class ApsarsTranslateElement {
    private static final Map<Class<?>, TranslateElementData<?>> elements = ApricotCollectionFactor.hashMap();

    public static TranslateElementData<ApsFileAst> FILE = create(ApsFileAst.class);

    public static TranslateElementData<ApsImportAst> IMPORT = create(ApsImportAst.class);

    public static TranslateElementData<ApsGlobalAst> GLOBAL = create(ApsGlobalAst.class);

    public static TranslateElementData<ApsClassAst> CLASS = create(ApsClassAst.class);
    public static TranslateElementData<ApsMemberParameterAst> MEMBER_PARAMETER = create(ApsMemberParameterAst.class);
    public static TranslateElementData<ApsBinderAst> BINDER = create(ApsBinderAst.class);
    public static TranslateElementData<ApsBindingParameterAst> BINDING_PARAMETER = create(ApsBindingParameterAst.class);

    public static TranslateElementData<ApsAnnotationAst> ANNOTATION = create(ApsAnnotationAst.class);

    public static TranslateElementData<ApsMethodAst> METHOD = create(ApsMethodAst.class);
    public static TranslateElementData<ApsMethodExtraCatchAst> METHOD_EXTRA_CATCH = create(ApsMethodExtraCatchAst.class);
    public static TranslateElementData<ApsCatchListAst> CATCH_LIST = create(ApsCatchListAst.class);

    public static TranslateElementData<ApsArgTypeAst> ARG_TYPE = create(ApsArgTypeAst.class);
    public static TranslateElementData<ApsAstWithVarargs> VARARGS = create(ApsAstWithVarargs.class);

    public static TranslateElementData<ApsMethodParameterAst> METHOD_PARAMETER_LIST = create(ApsMethodParameterAst.class);
    public static TranslateElementData<ApsMethodParamElementAst> METHOD_PARAMETER = create(ApsMethodParamElementAst.class);
    public static TranslateElementData<ApsMethodParameterDefaultValueAst> METHOD_PARAMETER_DEFAULT = create(ApsMethodParameterDefaultValueAst.class);

    public static TranslateElementData<ApsMethodBodyAst> METHOD_BODY = create(ApsMethodBodyAst.class);
    public static TranslateElementData<ApsStatementAst> STATEMENT = create(ApsStatementAst.class);
    public static TranslateElementData<ApsResultPresentingAst> RESULT_PRESENTING_STATEMENT = create(ApsResultPresentingAst.class);
    public static TranslateElementData<ApsCalculateAst> CALCULATE_STATEMENT = create(ApsCalculateAst.class);
    public static TranslateElementData<ApsIfStatementAst> IF_STATEMENT = create(ApsIfStatementAst.class);
    public static TranslateElementData<ApsInvokeAst> INVOKE_STATEMENT = create(ApsInvokeAst.class);
    public static TranslateElementData<ApsInvokeObjectAst> INVOKE_OBJECT_STATEMENT = create(ApsInvokeObjectAst.class);
    public static TranslateElementData<ApsLiteralStatementAst> LITERAL_STATEMENT = create(ApsLiteralStatementAst.class);
    public static TranslateElementData<ApsRefReferenceAst> REFERENCE = create(ApsRefReferenceAst.class);
    public static TranslateElementData<ApsConstantAst> CONSTANT = create(ApsConstantAst.class);
    public static TranslateElementData<ApsNullAst> CONSTANT_NULL = create(ApsNullAst.class);
    public static TranslateElementData<ApsShortAst> CONSTANT_SHORT = create(ApsShortAst.class);
    public static TranslateElementData<ApsIntAst> CONSTANT_INT = create(ApsIntAst.class);
    public static TranslateElementData<ApsLongAst> CONSTANT_LONG = create(ApsLongAst.class);
    public static TranslateElementData<ApsByteAst> CONSTANT_BYTE = create(ApsByteAst.class);
    public static TranslateElementData<ApsCharAst> CONSTANT_CHAR = create(ApsCharAst.class);
    public static TranslateElementData<ApsFloatAst> CONSTANT_FLOAT = create(ApsFloatAst.class);
    public static TranslateElementData<ApsDoubleAst> CONSTANT_DOUBLE = create(ApsDoubleAst.class);
    public static TranslateElementData<ApsBooleanAst> CONSTANT_BOOLEAN = create(ApsBooleanAst.class);
    public static TranslateElementData<ApsStringAst> CONSTANT_STRING = create(ApsStringAst.class);
    public static TranslateElementData<ApsNewInstanceStatementAst> NEW_INSTANCE_STATEMENT = create(ApsNewInstanceStatementAst.class);
    public static TranslateElementData<ApsResultingStatementAst> RESULTING_STATEMENT = create(ApsResultingStatementAst.class);
    public static TranslateElementData<ApsStatementWithVarargs> STATEMENT_WITH_VARARGS = create(ApsStatementWithVarargs.class);
    public static TranslateElementData<ApsReturnAst> RETURN_STATEMENT = create(ApsReturnAst.class);
    public static TranslateElementData<ApsTryCatchAst> TRY_CATCH_STATEMENT = create(ApsTryCatchAst.class);
    public static TranslateElementData<ApsVariableAst> VARIABLE_STATEMENT = create(ApsVariableAst.class);
    public static TranslateElementData<ApsYieldAst> YIELD_STATEMENT = create(ApsYieldAst.class);

    public static <X extends LanguageAst> TranslateElementData<X> create(Class<X> ast) {
        TranslateElementData<X> elementData = new TranslateElementData<>(ast);
        elements.put(ast, elementData);
        return elementData;
    }

    public static <X extends LanguageAst> TranslateElementData<X> byType(Class<X> type) {
        return Manipulate.cast(elements.get(type));
    }
}
