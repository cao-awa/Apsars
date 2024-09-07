package com.github.cao.awa.apsars.parser.token;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.parser.token.keyword.ApsFileKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsClassKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsMemberParameterKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.inherit.ApsBinderKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodParamKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.statement.ApsLocalVariableKeyword;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;

import java.util.Map;

public class ApsTokens {
    public static final String SPACE = " ";
    public static final String CURLY_BRACES_START = "{";
    public static final String CURLY_BRACES_END = "}";
    public static final String ANGLE_BRACES_START = "<";
    public static final String ANGLE_BRACES_END = ">";
    public static final String BRACES_START = "(";
    public static final String BRACES_END = ")";
    public static final String SEMICOLON = ";";
    public static final String COMMA = ",";
    public static final String COLON = ":";
    public static final String EQUAL = "=";
    public static final String LEFT_ASSIGNMENT = "<-";
    public static final String HYPHEN = "-";
    public static final String UNDERSCORE = "_";
    public static final String PUBLIC = "public";
    public static final String PUBLIC_OPEN = "open";
    public static final String PUBLIC_PUB = "pub";
    public static final String PRIVATE = "private";
    public static final String PRIVATE_PVT = "pvt";
    public static final String PROTECTED = "protected";
    public static final Map<String, String> BRACES = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        map.put(CURLY_BRACES_START, CURLY_BRACES_END);
        map.put(ANGLE_BRACES_START, ANGLE_BRACES_END);
        map.put(BRACES_START, BRACES_END);
    });
    public static final Map<String, String> REVERSE_BRACES = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        map.put(CURLY_BRACES_END, CURLY_BRACES_START);
        map.put(ANGLE_BRACES_END, ANGLE_BRACES_START);
        map.put(BRACES_END, BRACES_START);
    });

    public static final Map<String, ApsFileKeyword> FILE_KEYWORDS = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        for (ApsFileKeyword value : ApsFileKeyword.values()) {
            map.put(value.literal(), value);
        }
    });

    public static final Map<String, ApsMemberParameterKeyword> MEMBER_PARAMETER_KEYWORDS = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        for (ApsMemberParameterKeyword value : ApsMemberParameterKeyword.values()) {
            map.put(value.literal(), value);
        }
    });

    public static final Map<String, ApsLocalVariableKeyword> LOCAL_VARIABLE_KEYWORDS = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        for (ApsLocalVariableKeyword value : ApsLocalVariableKeyword.values()) {
            map.put(value.literal(), value);
        }
    });

    public static final Map<String, ApsMethodKeyword> METHOD_KEYWORDS = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        for (ApsMethodKeyword value : ApsMethodKeyword.values()) {
            map.put(value.literal(), value);
        }
    });

    public static final Map<String, ApsMethodParamKeyword> METHOD_PARAM_KEYWORDS = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        for (ApsMethodParamKeyword value : ApsMethodParamKeyword.values()) {
            map.put(value.literal(), value);
        }
    });

    public static final Map<String, ApsClassKeyword> CLASS_KEYWORDS = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        for (ApsClassKeyword value : ApsClassKeyword.values()) {
            map.put(value.literal(), value);
        }
    });

    public static final Map<String, ApsBinderKeyword> BINDER_KEYWORDS = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        for (ApsBinderKeyword value : ApsBinderKeyword.values()) {
            map.put(value.literal(), value);
        }
    });
}
