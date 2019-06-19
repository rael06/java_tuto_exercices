package com.company;

import java.util.List;

public class PrintList {
    public static void print(String someString, List array) {
        System.out.print(someString);
        for (Object subArray : array) {
            System.out.print(subArray);
        }
    }

    public static void print (List array)
    {
        print (null, array) ;
    }
}
