package com.company;
public class Salutation {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Pair_impair.testModulo(i);
        }
    }

    public static void pair(int _i){
        if (_i % 2 == 0) {
            System.out.println(_i+ " est un nombre Pair");
        } else {
            System.out.println(_i + " est un nombre Impair");
        }
    }
}
