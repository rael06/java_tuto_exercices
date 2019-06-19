package com.company;

public class Pair_impair {

    int i;

    Pair_impair(int _i) {
        this.i = _i;
    }

    public static void testModulo(int _i) {
        if (_i % 2 == 0) {
            System.out.println(_i + " est un nombre Pair");
        } else {
            System.out.println(_i + " est un nombre Impair");
        }
    }
}
