import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {
        // Declare a scanner
        Scanner scan = new Scanner(System.in);
        // Initialize all variables needed
        String input = scan.next(); // Ask the user to input their string
        String output = ""; // Initialize the output variable to be used at the end

        // If branch for logic
        if (input.length() >= 3) { // If string is larger than 3 continue by checking the letters are correct
            String second2Let = input.substring(1,3); // set the 2nd and 3rd letters to the variable second2Let
            if (second2Let.equals("ax")) { // If second2Let variable has ax stored then set output to "ok"
                output = "ok";
            } else { // this sets the output equal to "not ok" since the 2nd two characters aren't "ax"
                output = "not ok";
            }
        } else { // Since string isn't longer or equal to 3 set output to "not ok"
            output = "not ok";
        }
        System.out.println(output); // print the output variable
    }
}
