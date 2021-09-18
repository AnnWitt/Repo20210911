package z20210918.z20210918Regex;

public class RegexTest {

    static void Z8IsValidNumber(){
        System.out.println("Zad 8 - czy poprawny format liczbowy");
        System.out.println("222,22 " + RegexMetody.Z8IsValidNumber("222,22"));
        System.out.println("222a22 " + RegexMetody.Z8IsValidNumber("222a22"));
        System.out.println("22 " + RegexMetody.Z8IsValidNumber("22"));
        System.out.println("-22 " + RegexMetody.Z8IsValidNumber("-22"));
        System.out.println("-22,33,55 " + RegexMetody.Z8IsValidNumber("-22,33,55"));
        System.out.println("-,33 " + RegexMetody.Z8IsValidNumber("-,33"));
    }

    static void Zad6IsValidEmail() {
        System.out.println("Z6 - czy poprawny email");
        String correctEmailAddress="aaaa@com.pl";
        String inCorrectEmailAddress="aaaa";
        String inCorrectEmailAddress2="aaaa@com";
        System.out.println("correct " + RegexMetody.Zad6IsValidEmail(correctEmailAddress));
        System.out.println("incorrect " + RegexMetody.Zad6IsValidEmail(inCorrectEmailAddress));
        System.out.println("incorrect2 " +RegexMetody.Zad6IsValidEmail(inCorrectEmailAddress2));
    }

    static void Zad7IsValidAccount() {
        System.out.println("Zad 7 Czu poprawny IBAN");
        System.out.println("Poprawny: " + RegexMetody.Zad7IsValidAccount("PL24142413333226444454444444"));
        System.out.println("Niepoprawny: " + RegexMetody.Zad7IsValidAccount("4142412265"));
    }

}
