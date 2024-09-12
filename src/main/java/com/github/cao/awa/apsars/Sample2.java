package com.github.cao.awa.apsars;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Sample2 {
    private static final Logger LOGGER = LogManager.getLogger("Sample2");
    public static Logger field2 = LogManager.getLogger("Sample2");

    public static void main(String[] args) {
        int x = (1 + 1);
        int y = (1 + 100) + (1 + 456);
        int z = 1 + (1 + 123 + 567);
        int awa = ((1 + 1) + 123 + 456 + ((((((789)))))));
    }

    private static void handleErr(Throwable err) {
        System.out.println("Call handling");
    }
}