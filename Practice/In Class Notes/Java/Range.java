import java.util.Scanner;

public class Range {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // we'll read in two numbers ( a lower bound & upper bound)
        int lower = scan.nextInt();
        int upper = scan.nextInt();

        if (lower > upper) {
            System.out.println("Second integer can't be less than the first.");
        } else {
            // for-loop...
            for (int i = lower; i <= upper; i += 5) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
