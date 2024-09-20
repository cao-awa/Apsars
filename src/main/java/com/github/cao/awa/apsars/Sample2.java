package com.github.cao.awa.apsars;

import com.github.cao.awa.apsars.std.ApsarsInt;
import com.github.cao.awa.apsars.std.SyncApsarsInt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sample2 {
    private static final Logger LOGGER = LogManager.getLogger("Sample2");
    public static Logger field2 = LogManager.getLogger("Sample2");

    public static void main(String[] args) {
        final SyncApsarsInt a = new SyncApsarsInt();
        a.delegate(1);
        final ApsarsInt b = new ApsarsInt();
        b.delegate = 10;
        final ApsarsInt c = new ApsarsInt();
        c.delegate = 50;
        final ApsarsInt d = new ApsarsInt();
        d.delegate = 100;
        final ApsarsInt e = new ApsarsInt();
        e.delegate = 200;
        if (c.isMoreThan((a.delegate() * b.delegate))) {
            System.out.println("a is more than b");
        }
        if ((c.delegate < (a.delegate() * b.delegate))) {
            System.out.println("a is more than b");
        }
        if ((((b.isMoreThan(a.delegate()) && c.isEquals(b.delegate)) && d.isEquals(c.delegate)) && e.isMoreThan(d.delegate))) {
            System.out.println("a is more than b");
        }
    }
}