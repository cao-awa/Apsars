package com.github.cao.awa.apsars;

import com.github.cao.awa.apsars.std.ApsarsInt;
import com.github.cao.awa.apsars.std.SyncApsarsInt;

import java.util.Random;

public class Sample2 {
    public static void main(String[] args) {
        final Random rand = new Random();
        final ApsarsInt a = new ApsarsInt();
        a.delegate = rand.nextInt();
        final ApsarsInt b = new ApsarsInt();
        b.delegate = rand.nextInt();
        final ApsarsInt c = new ApsarsInt();
        c.delegate = rand.nextInt();
        final SyncApsarsInt d = new SyncApsarsInt();
        d.delegate(rand.nextInt());
        final ApsarsInt e = new ApsarsInt();
        e.delegate = rand.nextInt();
        final ApsarsInt f = new ApsarsInt();
        f.delegate = rand.nextInt();
        final ApsarsInt g = new ApsarsInt();
        g.delegate = rand.nextInt();
        final ApsarsInt h = new ApsarsInt();
        h.delegate = rand.nextInt();
        a.delegate = a.delegate + b.delegate + c.delegate;
        d.delegate(d.delegate() + e.delegate + f.delegate);
        if (d.delegate() > a.delegate) {
            System.out.println("www");
        }
        if ((d.delegate(d.delegate() + b.delegate)) > c.delegate) {
            System.out.println("awa");
        }
    }
}