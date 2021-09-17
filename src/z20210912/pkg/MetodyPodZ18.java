package z20210912.pkg;

public class MetodyPodZ18 {

    /*    Napisz
    program, który utworzy tablicę zawierającą 10 losowych liczb całkowitych z przedziału
0 9 Następnie wypisze ile razy dana liczba pojawiła się w tablicy*/

    static void Z18Wywowanie(int IleLiczb) {
        //wyswietlenie tablicy
        Z18WyswTablicy(IleLiczb);
        //System.out.println(Z18sumaLosowych(2));
        //Z18sumaLosowych(IleLiczb);
    }

    static int[][] Z18WyswTablicy(int IleLiczb){
        int[][] tbl1=new int[IleLiczb][IleLiczb];
        int j=0;
        for (int i=0; i<IleLiczb;i++) {
            tbl1[i][1]=i;
           System.out.print(tbl1[i][1]); //wyswietlenie 1 kolumny
            System.out.print(" ");
            //tu wywołanie sumy
           j=Z18sumaLosowych(i,IleLiczb);
          // j=6;
            tbl1[i][2]=j; //bo w drugiej kolumnie chce te sumy
            System.out.print(tbl1[i][2]);
            System.out.println();
        }
        return tbl1;
    }

    static int Z18sumaLosowych(int i, int Ileliczb){
        int[] tblTest=Z18TablicaLosowych(Ileliczb); //Tworzy tablice o dlugosci zero czyli tu jest ptoblem w argumencie
        tblTest[i]=5;
        int x=tblTest[i];
//tu musze pobrac wylosowana tablice i posumowac

        return x;
    }

    static int[] Z18TablicaLosowych(int IleLiczb) {
        int[] tblos= new int[IleLiczb];
        for (int i=0;i<IleLiczb;i++) {
            tblos[i]=(int)Math.random()*9;
            System.out.print(tblos[i] + " ");
        }
        return tblos;
    }

    static int[] Test () {
        int []test=Z18TablicaLosowych(4);
        return test;
    }


    //-----------------
}
