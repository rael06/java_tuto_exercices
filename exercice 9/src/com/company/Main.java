package com.company;

import static com.company.Constants.SCAN;
import static com.company.Constants.NEWLINE;

public class Main {

    public static void main(String[] args) {

        double[] scans = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            System.out.print("Entrez une note : ");
            scans[i] = Double.parseDouble(SCAN.nextLine());
            System.out.print(NEWLINE);
        }

        Notes notes = new Notes(scans);

        System.out.print("la moyenne de ces notes est : " + notes.moyenne() + " , la mention est : '" + notes.mention()+ "'.");
    }
}
