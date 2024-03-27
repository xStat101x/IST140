import java.util.Scanner;

public class StringChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inString;
        Boolean isValid;

        inString = scnr.nextLine();

        char let0 = inString.charAt(0);
        char let1 = inString.charAt(1);
        char let2 = inString.charAt(2);

        inString = scnr.nextLine();
        if ( ! (Character.isWhitespace(let0) || Character.isWhitespace(let2) || Character.isWhitespace(let1))) {
            isValid = Boolean.TRUE;
        } else {
            isValid = Boolean.FALSE;
        }


        if (isValid) {
            System.out.println("Good string");
        }
        else {
            System.out.println("Bad string");
        }
    }
}