package z20210911.pkg;

public class Zad8 {

    public static void main(String[] args) {

        int x=10;
       // czyPierwsza(10);
        //pierwsza podzielna przez 1 i siebie. Wystarczy sprawdzic połowe zakresu
        // tj nie 100 ale polowe
        for (int i=0;i<=x;i++) { //choc tak naprawde i od 2 by moxna ale tu chcemy iterowac od 0
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    //----------------------
    private static boolean isPrimeNumber(int number){
        if (number<2) {
            return false;
        }
        for(int i=2;i<=number/2;i++) { //bo połowka zbioru wystarczy aby bylo wydajniej
            //najlepieju nmath.sqrt(number)
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }

    private static void czyPierwsza(int x) {
        int kontrolka=0;
        for (int i=2;i<=x;i++) {
            for (int j=2;j<i;j++) {
                if (i%j!=0) {

                    //System.out.println(i%j + "chyba peirwsza " + "i= " + i + " j= " + j + " kontrolka " + kontrolka);
                    kontrolka=0;
                } else {
                    kontrolka=kontrolka+1;
                    break;
                    //System.out.println("i= " + i + " j= " + j + " kontrolka " + kontrolka);
                }
                System.out.println("reszta "+ " i= " + i + " j= " + j + " " +i%j + " kontrolka " + kontrolka);

            }



        }

    }

    //
}
