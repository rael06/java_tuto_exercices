package com.rael;

public class Voiture {

    public static int _id = 0;

    private int id;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    private String marque;
    private int vitesse;
    private int puissance;

    public Voiture(String marque, int vitesse, int puissance) {
        this.id = Voiture._id++ + 1;
        this.marque = marque;
        this.vitesse = vitesse;
        this.puissance = puissance;
    }

    public String toString() {
        return "id=" + this.id + ", marque=" + this.marque +
                ", vitesse=" + this.vitesse + ", puissance=" +
                this.puissance;

    }
}
