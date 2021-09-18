package z20210918.z20210918Obiektowe.pkg.z20210918ObiektoweZ2;

public class Author {
    private String surname;
    private String nationality;

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public void print() {
        System.out.println(surname);
        System.out.println(nationality);
    }

    //to String


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Author " + surname  +
                ", nationality= " + nationality; //to w zasadzie powinno byc w princie
    }
}
