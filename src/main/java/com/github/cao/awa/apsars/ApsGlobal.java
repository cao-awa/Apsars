package com.github.cao.awa.apsars;

public final class ApsGlobal {
    public static void println(Object x) {
        System.out.println(x);
    }

    public static void printlnAwa(Object x) {
        com.github.cao.awa.apsars.ApsGlobal.println(x);
    }
}