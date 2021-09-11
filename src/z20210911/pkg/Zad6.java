package z20210911.pkg;

public class Zad6 {

    public static void main(String[] args) {
        //TabliczkaMnozenia();
       TabliczkaMnozeniafor(6, 5,2);
        TabliczkaMnozeniaWhile(6, 2,5);
    }

    //-----------
    private static void TabliczkaMnozeniafor() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("5 x " + i + " = " + 5 * i);
        }
    }
                                                        
    private static void TabliczkaMnozeniafor(int multiplier, int multiplicandMaxm, int multiplicandMinm) {
        for (; multiplicandMinm <= multiplicandMaxm; multiplicandMinm++) {
            System.out.println(multiplier + " x " + multiplicandMinm + " = " + multiplier * multiplicandMinm);
        //int i=multiplicandMinm -> mozna sie tego pozbyc w prostych forach
        }
    }


    private static void TabliczkaMnozeniaWhile(int multiplier, int multiplicandMin, int multiplicandMax) {
        while (multiplicandMin <= multiplicandMax) {
            int result=multiplier*multiplicandMin;
            System.out.println(multiplier + " x " + multiplicandMin + " = " + result);
            multiplicandMin++;

        }

    }


}
