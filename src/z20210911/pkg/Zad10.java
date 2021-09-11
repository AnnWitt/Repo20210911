package z20210911.pkg;

public class Zad10 {

    public static void main(String[] args) {
        int liczba=934;
        int liczba1=liczba;
        //dzieimy przez 10 12,3  1,2
       int suma=0;

       while (liczba>=9) {
           suma=suma+(liczba%10);
           liczba=liczba/10;
          // alternatywny zapis liczba/=10
       }
        System.out.println("suma liczb " + liczba1 + " wynosi: " + (suma+liczba));
    }




}
