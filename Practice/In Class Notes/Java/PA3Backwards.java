import java.util.Scanner;

public class PA3Backwards {
    public static void main(String[] args) {

        // Create a Scanner
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next(); // store input 1 in this variable
        String str2 = scan.next(); // store input 2 in this variable


        // If logic branch
        if (str1.length() != 3 || str2.length() != 3) { // if they aren't 3 char. long...
            System.out.println("Invalid input"); // ...print "Invalid input"
        } else { // since they have to be 3 long...
            System.out.println("The two strings you entered are: " + str1 + " " + str2); // Print this...

            String rev1 = "" + str1.charAt(2) + str1.charAt(1) + str1.charAt(0); // Reverse str1 one letter at a time
            String rev2 = "" + str2.charAt(2) + str2.charAt(1) + str2.charAt(0); // Reverse str2 one letter at a time

            System.out.println("The two strings in reverse are: " + rev2 + " " + rev1); // Print this...
        }




    }
}
