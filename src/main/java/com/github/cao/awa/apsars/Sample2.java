package com.github.cao.awa.apsars;

import java.util.IllformedLocaleException;

import static com.github.cao.awa.apsars.ApsGlobal.println;

final class Sample2 {
    public int name1 = 123;
    public int name2 = 123;
    private final int name3 = 123;

    private static void xxx() {
        xxx$safepoint();
        try {
            Thread.sleep(0);
        } catch (InterruptedException ignored) {
        }
    }

    private static void nullSafe1() {
    }

    private static void nullSafe2() {
    }

    private static void nullSafe3() {
    }

    private static void xxx$safepoint() {
        int x = 0;
        int y = 100;
        int z = 123;
        try {
            println("Hello world");
        } catch (IllegalArgumentException | IllegalStateException | IllformedLocaleException ex) {
            println("Hello exception");
        }
        int n = 111;
    }
}