package z20210918.z20210918Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetody {
    static boolean Zad6IsValidEmail(String email) { //Is - konwencja aby boolean
        System.out.print("Zadanie 6 - walidacja emaila");

       // String regex=""; //tu wpiszemy jak ma byc
        String regex="[A-Za-z0-9_.-]+\\@[a-z]+\\.[a-z]+"; //tu wpiszemy jak ma byc
        // + jeden lub wiele, * zero lub wiecej, ? - zero lub jeden
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(email);
    return matcher.matches();
    }

    static boolean Zad7IsValidAccount(String account) {
        System.out.print("Zad 7 - walidacja IBAN ");
        //[A-Z]{2} -- dwa znaki
        String regex="PL[0-9]{26}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(account);
        return matcher.matches();
        //mozna tez
       // return pattern.matcher(account).matches();
    }

/*    \d – jakakolwiek cyfra [0-9],
            \D – jakikolwiek znak, który nie jest cyfrą [^0-9],
            \w – znak używany w słowach [a-zA-Z0-9_] (zauważ, że mamy tu znak _),
            \W – jakikolwiek znak, który nie jest używany w słowach [^a-zA-Z0-9_],
            \s – tak zwane białe znaki czyli znak spacji czy tabulacji [ \t\n\r\f\x0B]. Możesz je opisać jako znaki, które nie są widoczne podczas wydruku,
\S – negacja grupy \s czyli [^ \t\n\r\f\x0B].*/

static boolean Z8IsValidNumber(String number){
    String regex="[-]?[0-9]+[,]?[0-9]+";
    String regex2="-?\\d+(,\\d+)?)"; //podobny
    Pattern pattern=Pattern.compile(regex);
    Matcher matcher=pattern.matcher(number);
    return matcher.matches();
}


    //----------koniecRegexMetody
}
