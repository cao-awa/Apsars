package com.github.cao.awa.apsars.tree.vararg;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.vararg.primary.ReferencePrimary;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.LinkedList;
import java.util.List;

@Getter
@Accessors(fluent = true)
public class ApsArgTypeAst extends LanguageAst {
    public static final ApsArgTypeAst UNKNOWN = new ApsArgTypeAst(null);
    public static final ApsArgTypeAst STRING = new ApsArgTypeAst(null).nameIdentity("String");
    public static final ApsArgTypeAst SHORT = new ApsArgTypeAst(null).nameIdentity("short");
    public static final ApsArgTypeAst INT = new ApsArgTypeAst(null).nameIdentity("int");
    public static final ApsArgTypeAst LONG = new ApsArgTypeAst(null).nameIdentity("long");
    public static final ApsArgTypeAst BYTE = new ApsArgTypeAst(null).nameIdentity("byte");
    public static final ApsArgTypeAst CHAR = new ApsArgTypeAst(null).nameIdentity("char");
    public static final ApsArgTypeAst FLOAT = new ApsArgTypeAst(null).nameIdentity("float");
    public static final ApsArgTypeAst DOUBLE = new ApsArgTypeAst(null).nameIdentity("double");
    public static final ApsArgTypeAst BOOLEAN = new ApsArgTypeAst(null).nameIdentity("boolean");
    public static final ApsArgTypeAst APSARS_SHORT = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(false)).nameIdentity("ApsarsShort");
    public static final ApsArgTypeAst APSARS_INT = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(false)).nameIdentity("ApsarsInt");
    public static final ApsArgTypeAst APSARS_LONG = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(false)).nameIdentity("ApsarsLong");
    public static final ApsArgTypeAst APSARS_BYTE = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(false)).nameIdentity("ApsarsByte");
    public static final ApsArgTypeAst APSARS_CHAR = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(false)).nameIdentity("ApsarsChar");
    public static final ApsArgTypeAst APSARS_FLOAT = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(false)).nameIdentity("ApsarsFloat");
    public static final ApsArgTypeAst APSARS_DOUBLE = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(false)).nameIdentity("ApsarsDouble");
    public static final ApsArgTypeAst APSARS_BOOLEAN = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(false)).nameIdentity("ApsarsBoolean");
    public static final ApsArgTypeAst SYNC_APSARS_SHORT = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(true)).nameIdentity("SyncApsarsShort");
    public static final ApsArgTypeAst SYNC_APSARS_INT = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(true)).nameIdentity("SyncApsarsInt");
    public static final ApsArgTypeAst SYNC_APSARS_LONG = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(true)).nameIdentity("SyncApsarsLong");
    public static final ApsArgTypeAst SYNC_APSARS_BYTE = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(true)).nameIdentity("SyncApsarsByte");
    public static final ApsArgTypeAst SYNC_APSARS_CHAR = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(true)).nameIdentity("SyncApsarsChar");
    public static final ApsArgTypeAst SYNC_APSARS_FLOAT = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(true)).nameIdentity("SyncApsarsFloat");
    public static final ApsArgTypeAst SYNC_APSARS_DOUBLE = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(true)).nameIdentity("SyncApsarsDouble");
    public static final ApsArgTypeAst SYNC_APSARS_BOOLEAN = new ApsArgTypeAst(null).referencePrimary(new ReferencePrimary(true)).nameIdentity("SyncApsarsBoolean");
    private final LinkedList<ApsArgTypeAst> args = ApricotCollectionFactor.linkedList();
    @Setter
    private String nameIdentity;
    @Setter
    private boolean arrayArgType = false;
    @Setter
    private int arraySize = -1;
    @Setter
    private int arrayDepth = 1;
    @Setter
    private ReferencePrimary referencePrimary;

    public ApsArgTypeAst(LanguageAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {
        json.put("name", this.nameIdentity);
        if (this.arrayArgType) {
            json.put("arrayDepth", this.arrayDepth);
            if (this.arraySize != -1) {
                json.put("arraySize", this.arraySize);
            }
        }

        if (!this.args.isEmpty()) {
            JSONArray varargs = new JSONArray();
            for (ApsArgTypeAst arg : this.args) {
                JSONObject vararg = new JSONObject();
                arg.generateStructure(vararg);
                varargs.add(arg);
            }
            json.put("varargs", varargs);
        }

        if (this.referencePrimary != null) {
            json.put("is_primary_reference", true);
        }
    }

    public void addArg(ApsArgTypeAst argType) {
        this.args.add(argType);
    }

    public String formatCompletedName() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.nameIdentity);
        if (!this.args.isEmpty()) {
            builder.append("<");
            LinkedList<ApsArgTypeAst> args = this.args;
            int size = args.size();
            int edge = size - 1;
            for (int i = 0; i < size; i++) {
                ApsArgTypeAst arg = args.get(i);
                builder.append(arg.formatCompletedName());
                if (i != edge) {
                    builder.append(",");
                }
            }
            builder.append(">");
        }
        if (this.arrayArgType) {
            int depth = this.arrayDepth;
            while (depth-- > 0) {
                builder.append("[");
                if (this.arraySize == 1) {
                    builder.append(this.arraySize);
                }
                builder.append("]");
            }
        }

        return builder.toString();
    }

    @Override
    public void print(String ident) {
        StringBuilder varargCountBuilder = new StringBuilder();
        if (!this.args.isEmpty()) {
            varargCountBuilder.append("<");
            varargCountBuilder.append("?, ".repeat(this.args.size()));
            varargCountBuilder.delete(varargCountBuilder.length() - 2, varargCountBuilder.length());
            varargCountBuilder.append(">");
        }
        System.out.println(ident + "|_ " + this.nameIdentity + varargCountBuilder + (this.arrayArgType ? "[?]".repeat(this.arrayDepth) : ""));
        for (ApsArgTypeAst argType : this.args) {
            argType.print(ident + "    ");
        }
    }

    public ApsArgTypeAst varyPrimary(boolean sync) {
        if (sync) {
            if (this.referencePrimary != null || findAst(ApsClassAst.class).isAnnotationPresent(ApsAnnotationAst.DO_NOT_REF_PRIMARY)) {
                return this;
            }
            return switch (nameIdentity()) {
                case "short" -> ApsArgTypeAst.SYNC_APSARS_SHORT;
                case "int" -> ApsArgTypeAst.SYNC_APSARS_INT;
                case "long" -> ApsArgTypeAst.SYNC_APSARS_LONG;
                case "byte" -> ApsArgTypeAst.SYNC_APSARS_BYTE;
                case "char" -> ApsArgTypeAst.SYNC_APSARS_CHAR;
                case "float" -> ApsArgTypeAst.SYNC_APSARS_FLOAT;
                case "double" -> ApsArgTypeAst.SYNC_APSARS_DOUBLE;
                case "boolean" -> ApsArgTypeAst.SYNC_APSARS_BOOLEAN;
                default -> this;
            };
        }
        return varyPrimary();
    }

    public ApsArgTypeAst varyPrimary() {
        if (this.referencePrimary != null || findAst(ApsClassAst.class).isAnnotationPresent(ApsAnnotationAst.DO_NOT_REF_PRIMARY)) {
            return this;
        }
        return switch (nameIdentity()) {
            case "short" -> ApsArgTypeAst.APSARS_SHORT;
            case "int" -> ApsArgTypeAst.APSARS_INT;
            case "long" -> ApsArgTypeAst.APSARS_LONG;
            case "byte" -> ApsArgTypeAst.APSARS_BYTE;
            case "char" -> ApsArgTypeAst.APSARS_CHAR;
            case "float" -> ApsArgTypeAst.APSARS_FLOAT;
            case "double" -> ApsArgTypeAst.APSARS_DOUBLE;
            case "boolean" -> ApsArgTypeAst.APSARS_BOOLEAN;
            default -> this;
        };
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApsArgTypeAst argType) {
            List<ApsArgTypeAst> selfArgs = this.args;
            List<ApsArgTypeAst> targetArgs = argType.args;

            if (selfArgs.size() != targetArgs.size()) {
                return false;
            }

            for (int i = 0; i < this.args.size(); i++) {
                if (!selfArgs.get(i).equals(targetArgs.get(i))) {
                    return false;
                }
            }

            return argType.nameIdentity.equals(this.nameIdentity)
                    && argType.referencePrimary == this.referencePrimary
                    && argType.arrayDepth == this.arrayDepth
                    && argType.arraySize == this.arraySize;
        }
        return false;
    }

    @Override
    public void preprocess() {
        for (ApsArgTypeAst arg : this.args) {
            arg.preprocess();
        }
    }

    @Override
    public void postprocess() {
        for (ApsArgTypeAst arg : this.args) {
            arg.postprocess();
        }
    }

    @Override
    public void consequence() {
        for (ApsArgTypeAst arg : this.args) {
            arg.consequence();
        }
    }
}
