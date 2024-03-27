import java.util.Scanner;

public class Quiz_4 {
    public static void main(String[] args) {


        /*
        // For Loop
        int result = 1;
        for (int i = 5; i > 0; i--) { result = result * i; }
        System.out.println(result);

        // While Loop
        int result = 1;
        int i = 5;
        while (i > 0) {
            result = result * i;
            i--;
        }
        System.out.println(result);
        */

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String output = "false";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) { // im not sure how to check if a char = $ so im just going to use the is letter or digit and not it
                if (i == 0 && str.length() == 1) { // this is needed so that the 7th input doesn't break the code
                    output = "true";
                    break; // ends the loop (not neccessary)
                } else if (i == 0 && str.length() != 1) {
                    // this is here because the 3rd input would break the code
                } else {
                    char previous = str.charAt(i - 1);
                    char after = str.charAt(i + 1);

                    if (previous == after) {
                        output = "true";
                    }
                }
            }
        }
        System.out.println(output);
    }
}
