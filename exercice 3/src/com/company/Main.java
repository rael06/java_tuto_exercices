package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Livre[] livres = new Livre[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Donner le titre du livre n° "+ (i+1) +" :");
            String titre = sc.nextLine();
            System.out.print("Donner l'auteur du livre n° "+ (i+1) +" :");
            String auteur = sc.nextLine();
            System.out.print("Donner le prix du livre n° "+ (i+1) +" :");
            double prix = Double.parseDouble(sc.nextLine());
            livres[i] = new Livre(titre, auteur, prix);
        }
        for (int i = 0; i < livres.length; i++) {
            System.out.println(livres[i]);
        }
        System.out.println("Le nombre de livres est :" + Livre._id);
    }
}
