package com.company;

import static com.company.Constants.SCAN;
import static com.company.Constants.NEWLINE;

public class Main_3 {

    public static void main(String[] args) {

        System.out.print("Entrez votre nom : ");
        String name = SCAN.nextLine();
        System.out.print(NEWLINE);

        System.out.print("Entrez votre sexe (h) / (f) : ");
        String gender = SCAN.nextLine();
        System.out.print(NEWLINE);

        User user = new User (name, gender);

        System.out.println(user.welcomeMessage());

    }


}