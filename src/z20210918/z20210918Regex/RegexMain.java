package z20210918.z20210918Regex;

public class RegexMain {

    public static void main(String[] args) {
        /*String correctEmailAddress="aaaa@com.pl";
        String inCorrectEmailAddress="aaaa";
        String inCorrectEmailAddress2="aaaa@com";
        System.out.println("correct " + RegexMetody.Zad6IsValidEmail(correctEmailAddress));
        System.out.println("incorrect " + RegexMetody.Zad6IsValidEmail(inCorrectEmailAddress));
        System.out.println("incorrect2 " +RegexMetody.Zad6IsValidEmail(inCorrectEmailAddress2));*/

        System.out.println("Poprawny: " + RegexMetody.Zad7IsValidAccount("PL24142413333226444454444444"));
        System.out.println("Niepoprawny: " + RegexMetody.Zad7IsValidAccount("4142412265"));
    }
    //---------Koniec main



    //----------Koniec klasy
}

