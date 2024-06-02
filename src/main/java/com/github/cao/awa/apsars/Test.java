package com.github.cao.awa.apsars;

import java.util.ConcurrentModificationException;
import java.util.HashMap;

public class Test {
}

final class Sample2 {
    private int publicMember1;
    private int publicMember2;
    private int publicMember3;
    private int publicMember4;
    public int first;
    private int second = 13245;
    private HashMap<String, HashMap<Integer, Integer>> map;

    public static synchronized long xxx(int a, final int b) {
        long result = xxx$safepoint(a, b);
        try {
            Thread.sleep(0);
        } catch (InterruptedException ignored) {
        }
        return result;
    }

    void test() {
        System.out.println("Hello world");
    }

    void testXx() {
        testXx$safepoint();
        try {
            Thread.sleep(0);
        } catch (InterruptedException ignored) {

        }
    }

    public int first() {
        return this.first;
    }

    public void first(final int first_) {
        this.first = first_;
    }

    public int second() {
        return this.second;
    }

    public void second(final int second_) {
        this.second = second_;
    }

    public HashMap<String, HashMap<Integer, Integer>> map() {
        return this.map;
    }

    public void map(final HashMap<String, HashMap<Integer, Integer>> map_) {
        this.map = map_;
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

    void testXx$safepoint() {
        System.out.println("Hello world");
    }
}