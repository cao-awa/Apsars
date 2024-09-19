package com.github.cao.awa.apsars;

import com.github.cao.awa.apsars.std.ApsarsInt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sample2 {
    private static final Logger LOGGER = LogManager.getLogger("Sample2");
    public static Logger field2 = LogManager.getLogger("Sample2");

    public static void main(String[] args) {
        ApsarsInt a = new ApsarsInt();
        ApsarsInt b = new ApsarsInt();
        ApsarsInt x = new ApsarsInt();
        x.delegate = a.multiply(a.delegate).multiply(b.delegate).plus(b.delegate).delegate;
        System.out.println(x.delegate);
    }
}