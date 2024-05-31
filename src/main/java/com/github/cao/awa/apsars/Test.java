package com.github.cao.awa.apsars;

import java.util.ConcurrentModificationException;
import java.util.HashMap;

public class Test {
}

class Sample2 {
    public int first;
    private int second = 13245;
    private HashMap<String, HashMap<Integer, Integer>> map;

    public final int first() {
        return this.first;
    }

    public final void first(final int first_) {
        this.first = first_;
    }

    public final int second() {
        return this.second;
    }

    public final void second(final int second_) {
        this.second = second_;
    }

    public final HashMap<String, HashMap<Integer, Integer>> map() {
        return this.map;
    }

    public final void map(final HashMap<String, HashMap<Integer, Integer>> map_) {
        this.map = map_;
    }

    public static synchronized long xxx(int a, final int b) {
        long result = xxx$safepoint(a, b);
        try {
            Thread.sleep(0);
        } catch (InterruptedException ignored) {
        }
        ;
        return result;
    }

    public static synchronized long xxx$safepoint(int a, final int b) {
        try {
            int x = a + b;
            int y = x * b;
            int z = y * a;
            return z;
        } catch (ConcurrentModificationException | NullPointerException ex) {
            return a + b;
        }
    }

    static void test() {
        System.out.println("Hello world");
    }

    static void testXx() {
        testXx$safepoint();
        try {
            Thread.sleep(0);
        } catch (InterruptedException ignored) {
        }
    }

    static void testXx$safepoint() {
        System.out.println("Hello world");
    }
}

