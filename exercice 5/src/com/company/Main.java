package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un prénom :");
        String firstnameInput = sc.nextLine();

        System.out.print("Entrez un nom :");
        String lastnameInput = sc.nextLine();

        Firstname firstname = new Firstname(firstnameInput);

        // System.out.println(">> " + firstname);
        System.out.println(Main.ucfirst(firstnameInput) + " " + lastnameInput.toUpperCase());
    }

    public static String ucfirst(String firstnameInput) {
        String firstLetter = firstnameInput.substring(0, 1).toUpperCase();
        String otherLetters = firstnameInput.substring(1);
        return firstLetter + otherLetters;
    }
}
