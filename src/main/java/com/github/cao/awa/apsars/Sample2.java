package com.github.cao.awa.apsars;

import java.util.IllformedLocaleException;

import static com.github.cao.awa.apsars.ApsGlobal.*;

final class Sample2 {
    static void xxx() {
        int x = 0;
        int y = 100;
        int z = 123;
        try {
            println("Hello world");
        } catch (IllegalArgumentException | IllegalStateException | IllformedLocaleException ex) {
            println("Hello exception");
        }
        int n = 111;
    }
}

