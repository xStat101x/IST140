import java.util.Scanner;

public class MultiProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lower = scan.nextInt();
        int upper = scan.nextInt();
        int x = scan.nextInt(); // refer to instructions for int naming scheme

        int num = lower;
        int numMultiplesFound = 0;

        while (num <= upper) {
            if (num % x == 0) {
                numMultiplesFound ++;
            }
                num ++;


        }

        /*
        for (num = lower ; num <= upper ;  num++) {
            if (num % x  == 0) {
                numMultiplesFound++;
            }
        } */

        System.out.println(numMultiplesFound);

    }
}
