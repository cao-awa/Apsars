package com.github.cao.awa.apsars;

import com.github.cao.awa.apsars.std.ApsarsInt;

public class Sample2 {
    public static void main(String[] args) {
        final ApsarsInt a = new ApsarsInt();
        a.delegate = 1;
        final ApsarsInt b = new ApsarsInt();
        b.delegate = 1;
        final ApsarsInt c = new ApsarsInt();
        c.delegate = 1;
        final ApsarsInt d = new ApsarsInt();
        d.delegate = 1;
        final ApsarsInt e = new ApsarsInt();
        e.delegate = 1;
        final ApsarsInt f = new ApsarsInt();
        f.delegate = 1;
        final ApsarsInt g = new ApsarsInt();
        g.delegate = 1;
        final String[] array = null;
        array[1] = "awa";
        if ((a.delegate > b.delegate) && (b.delegate > c.delegate) && (c.delegate > d.delegate) && (d.delegate > e.delegate)) {
        }
    }
}