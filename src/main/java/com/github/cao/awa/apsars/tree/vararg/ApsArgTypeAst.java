package com.github.cao.awa.apsars.tree.vararg;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.LinkedList;

@Getter
@Accessors(fluent = true)
public class ApsArgTypeAst extends ApsAst {
    public static final ApsArgTypeAst UNKNOWN = new ApsArgTypeAst(null);
    public static final ApsArgTypeAst SHORT = new ApsArgTypeAst(null).nameIdentity("short");
    public static final ApsArgTypeAst INT = new ApsArgTypeAst(null).nameIdentity("int");
    public static final ApsArgTypeAst LONG = new ApsArgTypeAst(null).nameIdentity("long");
    public static final ApsArgTypeAst BYTE = new ApsArgTypeAst(null).nameIdentity("byte");
    public static final ApsArgTypeAst CHAR = new ApsArgTypeAst(null).nameIdentity("char");
    public static final ApsArgTypeAst FLOAT = new ApsArgTypeAst(null).nameIdentity("float");
    public static final ApsArgTypeAst DOUBLE = new ApsArgTypeAst(null).nameIdentity("double");
    public static final ApsArgTypeAst BOOLEAN = new ApsArgTypeAst(null).nameIdentity("boolean");
    public static final ApsArgTypeAst APSARS_SHORT = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("ApsarsShort");
    public static final ApsArgTypeAst APSARS_INT = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("ApsarsInt");
    public static final ApsArgTypeAst APSARS_LONG = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("ApsarsLong");
    public static final ApsArgTypeAst APSARS_BYTE = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("ApsarsByte");
    public static final ApsArgTypeAst APSARS_CHAR = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("ApsarsChar");
    public static final ApsArgTypeAst APSARS_FLOAT = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("ApsarsFloat");
    public static final ApsArgTypeAst APSARS_DOUBLE = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("ApsarsDouble");
    public static final ApsArgTypeAst APSARS_BOOLEAN = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("ApsarsBoolean");
    public static final ApsArgTypeAst SYNC_APSARS_SHORT = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("SyncApsarsShort");
    public static final ApsArgTypeAst SYNC_APSARS_INT = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("SyncApsarsInt");
    public static final ApsArgTypeAst SYNC_APSARS_LONG = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("SyncApsarsLong");
    public static final ApsArgTypeAst SYNC_APSARS_BYTE = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("SyncApsarsByte");
    public static final ApsArgTypeAst SYNC_APSARS_CHAR = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("SyncApsarsChar");
    public static final ApsArgTypeAst SYNC_APSARS_FLOAT = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("SyncApsarsFloat");
    public static final ApsArgTypeAst SYNC_APSARS_DOUBLE = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("SyncApsarsDouble");
    public static final ApsArgTypeAst SYNC_APSARS_BOOLEAN = new ApsArgTypeAst(null).isRefPrimary(true).nameIdentity("SyncApsarsBoolean");
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
    private boolean isRefPrimary = false;

    public ApsArgTypeAst(ApsAst parent) {
        super(parent);
    }

    public void addArg(ApsArgTypeAst argType) {
        this.args.add(argType);
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
            if (isRefPrimary() || findAst(ApsClassAst.class).isAnnotationPresent(ApsAnnotationAst.DO_NOT_REF_PRIMARY)) {
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
        if (isRefPrimary() || findAst(ApsClassAst.class).isAnnotationPresent(ApsAnnotationAst.DO_NOT_REF_PRIMARY)) {
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
    public void preprocess() {

    }
}
