package cwiczenie.pkg;

import java.util.Scanner;

public class KlasaDoTestowJednostkowych {

    public static void main(String[] args) {
        System.out.println("Podaj 1 liczbę");
        Scanner scan=new Scanner(System.in);
        int liczba1= scan.nextInt();
        System.out.println("Podaj 2 liczbę");
        int liczba2= scan.nextInt();
        System.out.println("dzielenie " + liczbaDzielenie(liczba1,liczba2));
        System.out.println("suma " + liczbySuma(liczba1,liczba2));
        System.out.println(ciagZnakow("dupa"));
    }

    //metody

     static float liczbaDzielenie(int liczba1, int liczba2) {
        float dzielenie=(float)liczba1/liczba2;
        return dzielenie;
    }

    static int liczbySuma(int liczba1, int liczba2) {
        return  liczba1+liczba2;
    }

    static String ciagZnakow(String ciag) {
        return Character.toString((ciag.charAt(0)));

    }




}
