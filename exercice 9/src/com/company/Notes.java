package com.company;

public class Notes {
    private double[] notes;
    public Notes (double[] scans) {
        notes = scans;
    }

    public double moyenne () {
        double moyenne = 0;
        double somme = 0;
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
            moyenne = somme / (i + 1);
        }
        return moyenne;
    }

    public String mention() {
        String mention = "";
        double moyenne = moyenne();
        if (moyenne > 12) {
            mention = "bien";
        } else if (moyenne >= 10 && moyenne <= 12) {
            mention = "passable";
        } else {
            mention = "non admis";
        }
        return mention;
    }
}
