import java.util.Scanner;

public class IllogicalSum {
    public static void main(String[] args) {

        // first: we need to pull in the input... (two numbers -- n1 and n2)

        Scanner scan = new Scanner(System.in);

        // reads in the first number....
        int n1 = scan.nextInt();

        // read in the second number:
        int n2 = scan.nextInt();

        // now we want to test to see if both n1 and n2 are in range 1..5 (inclusive)
        // System.out.println("here is the first: " + n1);
        // System.out.println("here is the second: " + n2);

        String output = "";

        if ((n1 >= 1 && n1 <= 5) && (n2 >= 1 && n2 <= 5)) {
            output = "both are in range";
            if (n1 + n2 >= 8) {
                output = output + " Illogical sum: 20";
            }
        }
        else if ((n1 < 1 || n1 > 5) && (n2 < 1 || n2 > 5)) { // if n1 is out of range 1..5
            output = "both are out of range";
        }
        else if (n1 < 1 || n1 > 5) { // if n1 is out of range 1..5
            output = " is out of range";
        }
        else if (n2 < 1 || n2 > 5) { // if n2 is out of range 1..5
            output = " is out of range";
        }

        System.out.println(output);
    }
}
