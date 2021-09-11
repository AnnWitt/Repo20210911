package z20210911.pkg;

import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
/*        System.out.println("first digit");
        int firstDigit=scanner.nextInt();*/
        int firstDigit=4;
    /*    System.out.println("second digit");
        int secondDigit=scanner.nextInt();*/
        int secondDigit=11;
        System.out.println("suma for: " + sumaFor(firstDigit, secondDigit));
        System.out.println("suma while: " + sumaWhile(firstDigit, secondDigit));
        System.out.println("suma Do while: " + sumaDoWhile(firstDigit, secondDigit));

    }

    private static int sumaFor(int firstDigit, int secondDigit) {
        int suma=0;
        for (int i = firstDigit; i<= secondDigit; i++) {
            suma=suma+i;
        }
        return suma;
    }

    private static int sumaWhile(int firstDigit, int secondDigit) {
        int suma=0; //najpierw sprawdza, wykona sie przynajmniej raz bo dowiaduje sie o
        //warunku na koniec
        while (firstDigit<=secondDigit) {
  /*          suma=suma+firstDigit;
            firstDigit++;*/  //opcja 1
            suma+=firstDigit++; //opcja 2
        }
        return suma;
    }

    private static int sumaDoWhile (int firstDigit, int secondDigit) {
        int suma=0;

        do {
            suma+=firstDigit++;

        } while (firstDigit<=secondDigit);


        return suma;
    }

//------------

}
