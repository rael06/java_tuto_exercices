package com.company;

public class Main {

    public static void main(String[] args) {
        int arrays_1[][] = {{2, 4, 5},{3, 33, 32}};
        int arrays_2[][] = {{3},{3, 4, 5},{3, 5}, {3, 1, 0}};
        
        Main.printArray(arrays_1);
        Main.printArray(arrays_2);


    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            String newLine = System.getProperty("line.separator");
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) System.out.print(array[i][j]);
                else System.out.print("-" + array[i][j]);
            }
            System.out.print(newLine);
        }
    }
}
