package com.company;

import static com.company.Constants.SCAN;
import static com.company.Constants.NEWLINE;

public class Main_2 {

    public static void main(String[] args) {

        int input = 0;
        System.out.print("Entrez un nombre : ");
        input = Integer.parseInt(SCAN.nextLine());
        System.out.print(NEWLINE);

        Number number = new Number (input);

        System.out.println(number.isPair());

    }


}
