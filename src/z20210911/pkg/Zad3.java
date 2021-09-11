package z20210911.pkg;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first digit");
        int firstDigit= scanner.nextInt();
        System.out.println("Please insert second digit");
        int secondDigit= scanner.nextInt();
       // Zad3_1(firstDigit, secondDigit);
        System.out.println("Czy liczba "+ firstDigit +" jest wieksze od " +
                secondDigit + " ? " +
                Zad3_1(firstDigit, secondDigit));
        System.out.println("Czy liczba "+ firstDigit +" przemnożona przez 3 jest wieksza od " +
                secondDigit + " ? " +
                Zad3_2(firstDigit, secondDigit));
        System.out.println("Czy liczba "+ firstDigit +" przemnożona przez 3 jest wieksza od " +
                secondDigit + " ? " +
                Zad3_3(firstDigit, secondDigit)); //sprawdz

    }

    //metody
    private static boolean Zad3_1(int firstDigit, int secondDigit) {
        return firstDigit>secondDigit;
    }

    private static boolean Zad3_2(int firstDigit, int secondDigit) {
        return (firstDigit*3)>secondDigit;
    }

    private static boolean Zad3_3(int firstDigit, int secondDigit) {

        //y++<++x i jednoczesnie --x < y++ (sprawdz
        return ((firstDigit++)<(++secondDigit))&&((--firstDigit<secondDigit++));
    }

    //dokoncz to zadanie


    //---
}
