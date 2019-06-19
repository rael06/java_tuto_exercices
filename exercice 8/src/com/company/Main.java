package com.company;

import java.util.Scanner;

import static com.company.Constants.NEWLINE;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Veuillez entrer un mot : ");
	    String word = scan.nextLine();

	    WordManager wordToManage = new WordManager(word);

	    wordToManage.charCounter();
    }
}
