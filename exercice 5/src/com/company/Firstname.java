package com.company;

public class Firstname {
    String firstname;

    public Firstname (String firstname) {
        this.firstname = firstname;
    }

    public String ucfirst() {
        String firstLetter = this.firstname.substring(0, 1).toUpperCase();
        String otherLetters = this.firstname.substring(1);
        return firstLetter + otherLetters;
    }

}
