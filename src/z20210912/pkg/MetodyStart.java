package z20210912.pkg;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MetodyStart {
    //Z1----------------START----------------------------
     static String Convert(String text) {
        text = text.trim(); ///trim usuwa z przodu i z tyłu
        return text;
    }
     static String Z1(String text) {
        String wynik;
        if (Convert(text).length()>=1) {
            //wynik="cos";
          //wynik=(Convert(text).charAt(Convert(text).length() - 1));
          wynik=(Convert(text).substring(Convert(text).length() - 1));
        } else {
            wynik="Wprowadzono niepoprawna wartosc";
        }
        return wynik;
    }
   //Z1 ------------ koniec ----------------------------

    //Z2--------Start--------
    static void Z2(String input, String prefix) {
         int slPref=prefix.length();
         String StartInp=input.substring(0, slPref);
        System.out.println(StartInp.equals(prefix));

     /*  łatwiej
        startWith()
        endsWith*/
    }
    //Z2-------koniec-----------
    //Z3----start----
    static boolean Z3val(String input, String word){
     return (input.length()>0 && word.length()>0 && input.length()>word.length());
    }

    static void Z3(String input, String word) {

       if (Z3val(input, word) ==true) {
            if (input.contains(word)) {
                System.out.println(input.indexOf(word));
            } else {
                System.out.println("-1");
            }

           //input.contains(word)) ? System.out.println(input.indexOf(word)): System.out.println("-1");
        }
    }
    //Z3---=koniec---------
    //Z4----start---

    static void Z4(String text) {
         //replace
      /*  text=text.replace(",", "-STOP-");
        text=text.replace(".", "-STOP-");*/ //w jednej linijce. tak samo jak
        // mona uppercase().lengt itf. to nadal jest string tj obiekt
        text=text
                .replace(",", "-STOP-")
                .replace(".", "-STOP-");
        System.out.println(text);
    }
    //Z4----koniec----

    //Z5----START----

    static void Z5(String text,char c) {

         //walidacja if(input !=null && !input.isBlack())

         int licznik=0;
         for (int i=0;i<text.length();i++) {
             if (text.charAt(i)==c) {
                 licznik=licznik+1;
             }
         }
        System.out.println(licznik);
    }
    //Z5 ---- Koniec--------

    //Z5 tablica znakow

    static int Z5tbl(String text,char c)
    {
        int counter=0;
        char[] letters=text.toCharArray();
        for (char ci:letters) {
            if(ci ==c) {
                counter++;
            }
        }
        return counter;
    }
    //Z5 tablica koniwe

    //Z6 -- start

    static int Z6 (String input, char znak) {
        int licznik=0;
        for (int i=0;i<input.length();i++) {
            if (input.charAt(i)==znak) {
                return i;
/*                licznik=i;
                break;*/
            }
           // if (licznik==0) {
               /* licznik=-1*/;
          //  }
        }
         return -1;
    }
    //Z6 --  koniec

    //Z7 [poki co omijamy



    static void StringbuilderPzyklad () { //stringbuilder
/*        Przykład Input AlaKot
            ResultaLAkOT*/

        String str="ala";
        str+="cos";

        StringBuilder str2=new StringBuilder("kot");
        str2.append("kot2");

       // System.out.println(str + " "+ str2);
        System.out.println(str2);

        // wynik kotkot2

    }
    //Z8 ========= start ===========
    static String Z8(String input) {
         StringBuilder result=new StringBuilder();
        for (int i=0;i<input.length();i++) {
            char currentChar=input.charAt(i);//po asci
            //male litery 97 -122
            //wielkie litery  65 - 90
            //roznica 32
            if (currentChar<=90 && currentChar>=65) {
                result.append((char)(currentChar+32));

            } else if (currentChar<=122 && currentChar>90){
                result.append((char)(currentChar-32));
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

//Z11============start==========

    static void Z11(String word) {
         String drow=word;
         int len=word.length();

         for (int i=0; i<len;i++) {
            //drow.charAt(len-i)=word.charAt(i);
         }
    }

    static void Z11Builder(String word) {
         String strB=new StringBuilder(word).reverse().toString();
        System.out.println(strB);
         //i dalej porownanie
    }

//Z11========koniec========

    //Z13============start==========

    static void Z13() {
        Scanner sc=new Scanner(System.in);
        int[] tbl=new int[3];
        System.out.println();
        int i=0;
        int min=0;
        int max=0;
        int sum=0;

        while (i<tbl.length) {
            System.out.println("podaj liczbę");
            tbl[i]=sc.nextInt();

            if (i==0) {
                min=tbl[i];
                max=tbl[i];
            }
            if (tbl[i]>max) {
                max=tbl[i];
            } else if (tbl[i]<min) {
                min=tbl[i];
            }

            sum=sum+tbl[i];
            i++;
        }

        System.out.println("alternatywa arrays stream " + Arrays.stream(tbl).sum());
        //powyzsze mozna tez tbl.steam(inp

        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("sum " + sum);

       // w pętli puscic: Arrays.stream(tbl).filter(d -> d >10&&d<20).toArray());

    } //porownaj z wersjami trenera



    //Z13============koniec==========

    //Z14============start==========
/*  Napisz
    program, który dla zadanej tablicy int'ów policzy ile jest w niej liczb ujemnych
    Jeśli takie występują utworzy nową tablicę, do której przepisze tylko te ujemne liczby
    Przykład
    Input 12 7 19 5
    Result 7 5
    */
static void Z14() {
    int[] tbl1={12,-7,19,-5};
    //--potem do metody
    int ujemne=0;

    for(int i=0;i<tbl1.length;i++) {
        if (tbl1[i]<0) {
            ujemne=ujemne+1;
        }
    }
    //--potem do metody
    int[] tblU=new int[ujemne];
    int j=0;

    for(int i=0;i<tbl1.length;i++) {
        if (tbl1[i]<0) {
            tblU[j]=tbl1[i];
            j++;
        }
    }
    //wyswietlenie
    System.out.print("Input: ");
    for (int x: tbl1) {
        System.out.print(x + " ");
    }

    System.out.println();
    System.out.print("Result: ");

    for (int x: tblU) {
        System.out.print(x + " ");
    }

/*        for (int x : tablica) {
            System.out.println(x);
        }*/



}
//Z14============koniec==========

//Z15============start==========
/*    Napisz
    program, w którym zdefiniujesz dwie tablice przechowujące Stringi Napisz metodę,
    która porówna obie tablice i sprawdzi czy są one dokładnie takie same (takie same wartości
            i kolejności elementów)
    Przykład
            Input
    FirstArray
::" Ala"," ma","kota
    SecondArray
::" Ala"," kotaa
    Result
false*/

    static  boolean Z15Size(String[] tbl1, String[] tbl2) {
        boolean czyRowneRozmiary=true;

        if (tbl1.length!= tbl2.length) {
            czyRowneRozmiary=false;
        }
       return czyRowneRozmiary;
    }
    static void Z15 (String[] tbl1, String[] tbl2) {
        boolean czyRowne=Z15Size(tbl1, tbl2);
        if (czyRowne==true) {
            int size=tbl1.length;

            for (int i=0;i<size;i++) {
                if (!tbl1[i].equals(tbl2[i])) {
                    czyRowne=false;
                    break;
                }
            }
        }
        System.out.println(czyRowne);
    }
    //Z15============koniec==========

    //Z16============koniec==========

/*    Napisz
    program, który dla zadanej tablicy 3 int'ów zamieni miejscami pierwszy i trzeci element
    Przykład
    Input 12 7 19
    Result 19 7 12*/

    static void Z16a(int[] tbl, int el1 , int el2) {
        el1=el1-1;
        el2=el2-1;

        for (int x: tbl) {
            System.out.print(x +" ");
        }
        int temp=tbl[el1];
        tbl[el1]=tbl[el2];
        tbl[el2]=temp;

     /*   for (int x : tablica) {
            System.out.println(x);
        */
        System.out.println();
        for (int x: tbl) {
            System.out.print(x +" ");
        }

    }

/*    Napisz metodę, którą przyjmie tablicę int'ów o dowolnej długości, i
    odwróci kolejność jej elementów*/

    static void Z16b(int[] tbl) {
        int len= tbl.length;
        for (int x: tbl) {
            System.out.print(x +" ");
        }
        System.out.println();
        for (int i=(tbl.length)-1;i>=0;i--) {
            System.out.print(tbl[i] + " ");
        }
    }

    //Z16============koniec==========

    //Z17============start==========
/*    Napisz
    program, który pobierze od użytkownika 10 liczb (typu int Następnym krokiem powinno
            być zapisanie ich w tablicy, posortowanie jej rosnąco oraz wypisanie
            wyniku sortowania na ekran*/

    static  void Z17(int l1, int ... ln) { //jakby od usera pobierac to mozna dac licznk
        System.out.println();
        System.out.println("Zadanie 17");
        //System.out.println(ln.length);
        // System.out.println(ln[1]);

        for (int item : ln) {
            System.out.print(item + " ");
        }

        System.out.println();
        Arrays.sort(ln);

        for (int item : ln) {
            System.out.print(item + " ");
        }}

        //Z17============koniec==========

    //Z7============start==========

    static void Z7 (String text) {
        System.out.println("Zadanie 7");
        System.out.println(text);
        int counter=0;

        for (int i=0;i<text.length();i++) {
            if (Character.toString(text.charAt(i)).equals(" ")) {
                counter=counter+1;
            }
        }
        System.out.println("Liczba spacji: " + counter);
        System.out.println("Ogolna liczba znaków: " + text.length());
        System.out.println((counter/(float)text.length())*100);



    }

    //Z7============koniec==========

    //z9---------start===========

    static void Z9 () {
        Scanner scanner=new Scanner(System.in);
        String input="";
        String longest="";


        while (!input.equals("Enough")) {
            System.out.println();
            System.out.println("Please insert your text: ");
            input=scanner.nextLine();
            if (longest.length()<input.length() && !input.equals("Enough")){
                longest=input;
            } else if (input.equals("")) {
                System.out.print("No input ");

            }

        }

        System.out.println("najdluzszy " + longest);

    }


    //z9---------koniec----------


    //Z10 ------------ start ------

    static int Z10Ile () {
        Scanner scanner=new Scanner((System.in));
        System.out.println(" Ile słów: ");
        int input= scanner.nextInt();
        System.out.println("Do wprowadzenia " + input + " slow");
        return input;

    }

    static String Z10() { //3
        System.out.println("Zadanie 10");
        int amount=Z10Ile();
        Scanner scanner=new Scanner((System.in));
        int counter=0;
        String input="";
        String result="";

        while (counter<amount) {
            System.out.println("Insert " + (counter+1 + " word"));
            input=scanner.nextLine();
            result=result+Character.toString(input.charAt(input.length()-1));
            counter++;

        }

        return result;
    }

    //Z10--------koniec--------


    }

