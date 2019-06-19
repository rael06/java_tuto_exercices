package com.company;

import java.util.*;

import static com.company.Constant.NEWLINE;

public class Main_2 {
    //private static final String NEWLINE = Constant.NEWLINE;
    public static Map<String, List> mapOfArrays = new HashMap();

    public static void main (String[] args) {
        List<Integer> array_1 = new ArrayList<Integer>();
        array_1.add(new Integer(3));
        array_1.add(new Integer(4));
        array_1.add(new Integer(5));

        List<Integer> array_2 = new ArrayList<Integer>();
        array_2.add(new Integer(3));
        array_2.add(new Integer(33));
        array_2.add(new Integer(32));

        List<Integer> array_3 = new ArrayList<Integer>();
        array_3.add(new Integer(3));

        List<Integer> array_4 = new ArrayList<Integer>();
        array_4.add(new Integer(3));
        array_4.add(new Integer(4));
        array_4.add(new Integer(5));

        List<Integer> array_5 = new ArrayList<Integer>();
        array_5.add(new Integer(3));
        array_5.add(new Integer(5));

        List<Integer> array_6 = new ArrayList<Integer>();
        array_6.add(new Integer(3));
        array_6.add(new Integer(1));
        array_6.add(new Integer(0));



        List<List> arrays_1 = new ArrayList<List>();
        arrays_1.add(array_1);
        arrays_1.add(array_2);

        List<List> arrays_2 = new ArrayList<List>();
        arrays_2.add(array_3);
        arrays_2.add(array_4);
        arrays_2.add(array_5);
        arrays_2.add(array_6);

        Main_2.mapOfArrays.put("arrays_1", arrays_1);
        Main_2.mapOfArrays.put("arrays_2", arrays_2);

        PrintList.print("Tableau n°1 dont le nom est 'arrays_1' : ", arrays_1);
        System.out.print(NEWLINE);

        PrintList.print("Tableau n°2 dont le nom est 'arrays_2' : ", arrays_2);
        System.out.print(NEWLINE);

        Scanner scan = new Scanner(System.in);

        System.out.print("What array do you want to know the size of ? ");
        String arrayName = scan.nextLine();
        System.out.println("The size of " + arrayName + " est : " + Test.main(arrayName));
        }
    }

