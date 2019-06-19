package com.company;


import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MyArray array_1 = new MyArray("rael", "tanguy", "alex", "anissa");

        array_1.values.add("aladin");


        for (String item : array_1.values) {
            System.out.println(item);
        }

        array_1.values.forEach(System.out::println);

        for (int i = 0; i < array_1.values.size(); i++) {
            System.out.println(array_1.toString(i));
        }

        Iterator iterator = array_1.values.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
