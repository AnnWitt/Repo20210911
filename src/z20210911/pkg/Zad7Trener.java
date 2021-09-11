package z20210911.pkg;

import java.util.Scanner;

public class Zad7Trener {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decision;
        do {
            System.out.print("Please insert first digit: ");
            float firstDigit = scanner.nextInt();
            System.out.print("Please insert second digit: ");
            float secondDigit = scanner.nextInt();
            System.out.print("Please insert operator: ");
            scanner.nextLine(); //taki tam blad scnnera - inaczej pobierze pusty wiersz
            String operator = scanner.nextLine();
            //scanner.nextLine();

            calculate(firstDigit, secondDigit, operator);
            System.out.println(calculate(firstDigit, secondDigit, operator));
            System.out.println("New calculation or STOP?");
            decision = scanner.nextLine();
        } while (!"STOP".equalsIgnoreCase(decision));
    }

    private static float calculate (float firstdigit, float seconddigit, String operator) {
        float result=0;
        switch (operator) {
            case "+":
                result=firstdigit+seconddigit;
                break;
/*            switch (operator) {
                case "+":
                    return=firstdigit+seconddigit;
                    */ //break niepotrzebny
            case "-":
                result=firstdigit-seconddigit;
                break;
            case "*":
                result=firstdigit*seconddigit;
                break;
            case "/":
                if (seconddigit!=0) {
                result=firstdigit/seconddigit;
            }
                break;
            case "^":
                result = (float)Math.pow(firstdigit, seconddigit);
                break;
            case "sqrt":
                result=(float) Math.pow(firstdigit,(1/seconddigit) );
                break;
            default:
                System.out.println("operator not exist");
                System.exit(1);
               //  break; nhiepotrzebny
        }

        return result;
    }
}
