package com.company;

public class Number {
    int number;

    public Number (int nombre) {
        this.number = nombre;
    }

    public String isPair() {
        if (number % 2 == 0) {
            return "Ce nombre est pair";
        } else {
            return "Ce nombre est impair";
        }
    }
}
