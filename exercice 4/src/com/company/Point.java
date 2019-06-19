package com.company;

public class Point {
    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

    double abscisse;
    double ordonnee;

    public Point() {
    }

    public double distance() {
        double powAbscisse = Math.pow(abscisse, 2);
        double powOrdonnee = Math.pow(ordonnee, 2);
        double result = powAbscisse + powOrdonnee;
        double sqrtResult = Math.sqrt(result);
        return sqrtResult;
    }

    public String toString() {
        return "La distance entre l'origine et le point (" + this.abscisse + "," + this.ordonnee + ") est : " + this.distance();
    }
}
