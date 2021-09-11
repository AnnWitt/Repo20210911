package z20210911.pkg;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("first digit");
        float firstDigit= scanner.nextFloat();
        System.out.println("second digit");
        float secondDigit= scanner.nextFloat();
        System.out.println("operacja (znak) digit");
        //String operacja= scanner.next();
        String operacja=scanner.next();


        KalkulatorString(firstDigit, secondDigit, operacja);

        System.out.println("xxx");
        char operacjaCh=operacja.charAt(0);
        KalkulatorChar(firstDigit, secondDigit, operacjaCh);

    }

    //--------------------
/*
    Napisz program realizującyprosty kalkulator. Program powinien:
    a) pobraćpierwsząliczbę(typu float)
    b) pobraćjeden ze znaków: + - / *
    c) pobraćdrugąliczbę(typu float)
    d) zwrócićwynik pobranego działania
    Jeśliużytkownikpoda znak inny niżobsługiwane,program powinien wypisać„Wrong operator”.
    Jeśliwpisanego działanianie da sięzrealizować(tj. jest niezgodne z zasadami matematyki), to
    program powinien wypisaćnapis „Error”.
            * Dodaj funkcjonalność, która pozwoli na wielokrotne wykonywanie działań, a zakończenie
    działaniaprogramu nastąpipo wpisaniu tekstu „Stop”.*/

    private static void KalkulatorString(float firstDigit, float secondDigit, String operacja) {
        Scanner scanner2=new Scanner(System.in);
        switch (operacja) {
            case "+" :
                System.out.println(firstDigit + " " + operacja +" " + secondDigit + " = " +
                        (firstDigit+secondDigit));
                break;
            case "-" :
                System.out.println(firstDigit + " " + operacja +" " + secondDigit + " = " +
                        (firstDigit-secondDigit));
                break;
            default:
                System.out.println("podano niewlasciwy znak. Podaj ponownie operacje Str");
                operacja= scanner2.next();
                KalkulatorString(firstDigit, secondDigit, operacja);
                break;
        }


    }

    //
    private static void KalkulatorChar(float firstDigit, float secondDigit, char operacjaCh) {
        Scanner scanner2=new Scanner(System.in);
        switch (operacjaCh) {
            case '+' :
                System.out.println(firstDigit + " " + operacjaCh +" " + secondDigit + " = " +
                        (firstDigit+secondDigit));
                break;
            case '-' :
                System.out.println(firstDigit + " " + operacjaCh +" " + secondDigit + " = " +
                        (firstDigit-secondDigit));
                break;
            default:
                System.out.println("podano niewlasciwy znak. Podaj ponownie operacje ch");
                operacjaCh= scanner2.next().charAt(0);
                KalkulatorChar(firstDigit, secondDigit, operacjaCh);
                break;
        }
    }

}
