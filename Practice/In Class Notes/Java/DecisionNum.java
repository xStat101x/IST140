import java.util.Scanner;

public class DecisionNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        // suppose I want to test if word begins with a capital letter...
        // if it does, then print "Yes"
        // otherwise print: "No"

        //         01234
        // word = "Hello"
        char firstLetter = word.charAt(0);

        //int actualNum = Integer.parseInt(); (useful)

        if (Character.isUpperCase(firstLetter)) {
            System.out.println("Yes...");

        } else {
            System.out.println("No...");
        }
    }
}
