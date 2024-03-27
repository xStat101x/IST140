import java.util.Scanner;

public class ReallyPosQ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt(); // read in a number (and store it in num variable)

        String output = "";

        if (num > 0) {
            // System.out.println("the number is positive!");
            output = "the number is positive!";
            if (num > 5) {
                // System.out.println("(REALLY)");
                output = output + " (REALLY)";
            }
        }
        else if (num == 0) {
            // System.out.println("the number is equal to zero!");
            output = "the number is equal to zero!";
        } else {
            // System.out.println("the number is negative!");
            output = "the number is negative!";
            if (num < -5) {
                // System.out.println("(REALLY)");
                output = output + " (REALLY)";
            }
        }
        System.out.println(output);

    }
}
