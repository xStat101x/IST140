import java.util.Scanner;

public class Satisfaction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String inputString = scan.next();

        // first: we want to test if the input string has 4 letters
        boolean isStringIsLength4 = inputString.length() == 4;

        // condition 2:
        char firstLet = inputString.charAt(0);
        boolean doesBeginWithCap = Character.isUpperCase(firstLet);

        // condition 3:
        char LastLet = inputString.charAt(inputString.length() - 1);

        boolean endsWithDigitOrCap = Character.isDigit(LastLet) || Character.isUpperCase(LastLet);

        String output = "";
        if (isStringIsLength4 && doesBeginWithCap && endsWithDigitOrCap) {
            // System.out.println("Input string satisfies");
            output = "Input string satisfies";
        } else {
            // System.out.println("Input string disappoints :-( ...");
            output = "Input string disappoints :-( ...";
        }
        System.out.println(output);



    }
}
