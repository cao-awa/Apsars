package com.github.cao.awa.apsars;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Sample2 {
    private static final Logger LOGGER = LogManager.getLogger("Sample2");
    public static Logger field2 = LogManager.getLogger("Sample2");

    public static void main(String[] args) {
        String str = null;
        if (true) {
            System.out.println("trues");
            str = "result1";
        } else if (false) {
            System.out.println("falses");
            str = "result2";
        } else if (true) {
            System.out.println("elses");
            str = "result3";
        } else if (false) {
            System.out.println("No_results");
        }
    }

    private static void handleErr(Throwable err) {
        System.out.println("Call handling");
    }
}