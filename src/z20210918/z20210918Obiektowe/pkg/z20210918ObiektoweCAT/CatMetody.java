package z20210918.z20210918Obiektowe.pkg.z20210918ObiektoweCAT;
public class CatMetody {



    private String catName;
    private String sound="Miau miau";
    private int mice;

    public CatMetody(String catName) { //kontruktor (nie ma zwracanego typu), nazwa taka sama
        //jak nazwa klasy
        this.catName = catName; //this z klasy, drugi wprowadzony
    }

    public CatMetody() {

    }



/*    private String CatName (String catName){
        this.catName=catName;
        return this.catName;
    }*/

    public void makeSound() {
        System.out.println(sound);
    }

    public void eatMice (int mice) {
        this.mice=mice;
        System.out.println("I ate "+ mice+ " mice");
    }

    public void print() {
        System.out.println("cat");
        System.out.println("imie kota: " + catName);
/*        makeSound();
        eatMice(5);*/
    }
//-----------------get/set
    public String getCatName(String catName) {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

}
