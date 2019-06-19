package com.rael;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Voiture v1 = new Voiture("BMW", 220, 8);
        Voiture v2 = new Voiture("Ford", 200, 6);
        Voiture v3 = new Voiture("Audi", 240, 8);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());

        System.out.println("Le nombre des voitures est : " + Voiture._id);
    }
}
