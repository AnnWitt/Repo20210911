package z20210912.pkg;

public class MetodyPodZ18 {

    static int[] wylosowana;

    /*    Napisz
    program, który utworzy tablicę zawierającą 10 losowych liczb całkowitych z przedziału
0 9 Następnie wypisze ile razy dana liczba pojawiła się w tablicy*/

    static void Z18Wywowanie(int ileLiczb) {
        wylosowana=Z18TablicaLosowych(ileLiczb);

        System.out.print("Tablica wylosowana: ");
        for (int wysw: wylosowana){
            System.out.print(" " + wysw );
        }
        System.out.println();
        Z18WyswTablicyPodSume(ileLiczb);
    }

    static int[][] Z18WyswTablicyPodSume(int IleLiczb){
        int[][] tbl1=new int[IleLiczb][IleLiczb];
        int j=0;
        for (int i=0; i<10;i++) {
            tbl1[i][1]=i;
           System.out.print(tbl1[i][1]);
            System.out.print(" ");
            tbl1[i][2]=Z18licznik(i);
            System.out.print(tbl1[i][2]);
            System.out.println();
        }
        return tbl1;
    }

/*    static int Z18sumaLosowych(int i, int Ileliczb){
        int[] tblTest=Z18TablicaLosowych(Ileliczb); //Tworzy tablice o dlugosci zero czyli tu jest ptoblem w argumencie
        tblTest[i]=5;
        int x=tblTest[i];
//tu musze pobrac wylosowana tablice i posumowac

        return x;
    }*/

    static int[] Z18TablicaLosowych(int IleLiczb) {
        int[] tblos= new int[IleLiczb];
        for (int i=0;i<IleLiczb;i++) {
            tblos[i]=(int)(Math.random()*10);
        }
        return tblos;
    }

    static int Z18licznik(int itbl) {
        int []tablicznik=wylosowana;
        int suma=0;
        for (int i=0;i< (tablicznik.length);i++) {
            if (tablicznik[i]==itbl) {
                suma=suma+1;
            }
        }
        return suma;
    }


    //-----------------
}
