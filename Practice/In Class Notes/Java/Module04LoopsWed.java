import java.util.Scanner;

public class Module04LoopsWed {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // example 1: we want to average numbers read in via the scanner...
        // (we'll use a while loop)

        double sum = 0.0;
        int count = 0;
        /*
        // declare a boolean flag
        boolean doneEntering = false;

        // if we see a negative number, then tht indicates we're done
        // entering values...

        while (!doneEntering) {
            // read in a number, add it to our sum, then increment count...
            double currNum = scan.nextDouble();

            if (currNum < 0) {
                doneEntering = true;
            } else {
                sum = sum + currNum;
                count++; // we've seen another number, so increment the count
            }
        }
        */

        // Version 2: break version

        while (true) { // "busy loop"
            double currNum = scan.nextDouble();

            if (currNum < 0) {
                break;
            }
            count++;
            sum = sum + currNum;
        }

        System.out.println("done...");
        if (count > 0) {
            System.out.println("here's the average: " + sum / count);
        } else {
            System.out.println("Can't compute the average");
        }





    }
}
