package com.github.cao.awa.apsars;

import static com.github.cao.awa.apsars.ApsGlobal.println;

class Sample2 implements TestBinder2, TestBinder {
    public int a;
    public int b;

    public void xxx() {
        println(123);
    }

    public int a() {
        return this.a;
    }

    public void a(final int a_) {
        this.a = a_;
    }

    public int b() {
        return this.b;
    }

    public void b(final int b_) {
        this.b = b_;
    }
}

interface TestBinder {
    void xxx();

    default void yyy() {
        println(321);
    }

    int a();

    void a(int a);
}

interface TestBinder2 {
    default void www() {
        println(987);
    }

    int b();

    void b(int b);
}