package com.company;

public class User {
    String name;
    String gender;

    public User (String name,String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String welcomeMessage () {
        if (gender.equals("h")) {
            return "Bonjour monsieur " + name;
        } else {
            return "Bonjour madame " + name;
        }
    }
}
