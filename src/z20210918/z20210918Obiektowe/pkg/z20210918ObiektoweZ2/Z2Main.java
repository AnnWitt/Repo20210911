package z20210918.z20210918Obiektowe.pkg.z20210918ObiektoweZ2;

public class Z2Main {
    public static void main(String[] args) {
        Author autor1=new Author("nazwisko","narodowosc");
        Author autor2=new Author("nazwisko2","narodowosc2");
        Author autor3=new Author("nazwisko3","narodowosc3");
        autor1.print();
        System.out.println("to string");
        System.out.println(autor1.toString());
        System.out.println("poem");
        Poem poem1=new Poem(autor1,30);
        Poem poem2=new Poem(autor2,330);
        Poem poem3=new Poem(autor3,10);
        System.out.println(poem1);
        //-------------------
        System.out.println("tablica wierszy");

/*        Poem[] drugiSposob=new Poem[3];
        drugiSposob[0]=new Poem(autor1,34 );*/


        Poem[] poems={poem1,poem2,poem3};
        for (Poem display:poems) {
   /*         if (max<display.) { // jak sie dobrac dostrophenum
                max=display;
            }*/
            System.out.println(display);
        }
        //getSurnameWithMax(poems); //metoda
        System.out.println(getSurnameWithMax(poems));


    }

    private static String getSurnameWithMax(Poem[] poems) {
        int max=0;
        String surnameAuthor=null;
        for (Poem displayIndex: poems) { //zamiast displayindeks uzywac poem // ładniej,, poki co
            //aby zapamietac
            //gramy aby max mial byc mneijszy

            if (max< displayIndex.getStropheNum())
            {max= displayIndex.getStropheNum();
                surnameAuthor=displayIndex.getCreator().getSurname(); //mam obiekt autor i robimy
                //operacje get surname
            }
        }
     return surnameAuthor;
    }

}
