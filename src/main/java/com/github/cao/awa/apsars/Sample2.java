package com.github.cao.awa.apsars;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Sample2 {
    private static final Logger LOGGER = LogManager.getLogger("Sample2");

    public static void main(String[] args) {
        String x = null;
        try {
            System.out.println(x);
        } catch (Throwable ignored) {
        }
        try {
            System.out.println(x);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        String somethingStr = "Something";
        try {
            System.out.println(x);
        } catch (Throwable ex) {
            LOGGER.error(somethingStr, ex);
        }
        try {
            System.out.println(x);
        } catch (Throwable ex) {
            Sample2.handleErr(ex);
        }
        System.out.println("Hello world");
    }

    private static void handleErr(Throwable err) {
        System.out.println("Call handling");
    }
}