package com.company;

public class Livre {
    public static int _id = 0;

    public int getId() {
        return id;
    }

    private int id;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    private String titre;
    private String auteur;
    private double prix;

    public Livre(String titre, String auteur, double prix) {
        this.id = Livre._id++ + 1;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public String toString() {
        return "Le prix du livre " + this.titre +
                " de l'auteur " + this.auteur +
                " est : " + this.prix + " DH";
    }
}
