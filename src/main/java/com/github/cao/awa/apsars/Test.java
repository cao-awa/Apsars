package com.github.cao.awa.apsars;

import java.util.ConcurrentModificationException;

public class Test {
}

class Sample2 {
    public int first;
    private int second = 13245;

    public static synchronized long xxx(int a, final int b) {
        try {
            int x = a + b;
            int y = x * b;
            int z = y * a;
            return z;
        } catch (ConcurrentModificationException | NullPointerException ex) {
            return a + b;
        }
    }

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
}