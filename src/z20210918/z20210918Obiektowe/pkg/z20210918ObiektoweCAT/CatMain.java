package z20210918.z20210918Obiektowe.pkg.z20210918ObiektoweCAT;

public class CatMain {

    public static void main(String[] args) {
        //CatMetody[] cats ={...};
        CatMetody cat1=new CatMetody("Wyplosz");
        cat1.print();
        cat1.makeSound();
        cat1.eatMice(5);

        System.out.println();
        CatMetody cat2=new CatMetody("Bikini");
        cat2.print();
        cat2.makeSound();
        cat2.eatMice(16);

        System.out.println();
        CatMetody cat3=new CatMetody("Kamikadze");
        cat3.print();
        cat3.makeSound();
        cat3.eatMice(2);

        System.out.println();
        cat1.setCatName("Zatoichi");
        cat1.print();






        //-----------
    }
}
