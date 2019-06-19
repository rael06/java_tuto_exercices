package com.company;

public class Rectangle {
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double perimetre() {
        return (this.longueur + this.largeur) * 2;
    }

    public double aire() {
        return (this.longueur * this.largeur);
    }

    public boolean isCarre() {
        return (this.longueur == this.largeur);
    }

    public String toString() {
        String type;
        if (this.isCarre()) {
            type = "C'est un carre";
        } else {
            type = "Ce n'est pas un carre";
        }
        return "Longueur : " + this.longueur +
                " -Largeur : " + this.largeur +
                " -Perimetre : " + this.perimetre() +
                " -Aire : " + this.aire() +
                " -" + type;
    }
}
