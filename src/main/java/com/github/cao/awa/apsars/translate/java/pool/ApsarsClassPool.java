package com.github.cao.awa.apsars.translate.java.pool;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;

import java.util.Map;

public class ApsarsClassPool {
    private static final Map<String, ApsArgTypeAst> types = ApricotCollectionFactor.hashMap();
    private static final Map<String, ApsClassAst> classes = ApricotCollectionFactor.hashMap();
    private static final Map<String, ApsAnnotationAst> annotations = ApricotCollectionFactor.hashMap();

    public static void registerClass(String packageAt, ApsClassAst clazz) {
        classes.put(packageAt + clazz.nameIdentity(), clazz);
        types.put(clazz.nameIdentity(), new ApsArgTypeAst(clazz).nameIdentity(clazz.nameIdentity()));
    }

    public static void registerAnnotation(String fullName, ApsAnnotationAst annotation) {
        annotations.put(fullName, annotation);
    }

    public static ApsAnnotationAst annotation(String fullName) {
        return annotations.get(fullName);
    }

    public static ApsArgTypeAst type(String fullName) {
        return types.get(fullName);
    }

    public static void registerDefaultClasses() {
        registerClass("java.lang.Exception", new ApsClassAst(null).nameIdentity("Exception"));
    }

    public static void registerDefaultAnnotations() {
        registerAnnotation(ApsAnnotationAst.DO_NOT_REF_PRIMARY, new ApsAnnotationAst(null, "DoNotRefPrimary"));
        registerAnnotation(ApsAnnotationAst.TRY_INLINE, new ApsAnnotationAst(null, "TryInline"));
    }
}
