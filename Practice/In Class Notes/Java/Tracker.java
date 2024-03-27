import com.sun.nio.sctp.SctpSocketOption;

import java.util.Scanner;

public class Tracker {
    public static int[] expandTracker(int[] temperatures, int numAdd) {
        int i;
        int[] copyArray = new int[temperatures.length + numAdd];

        for (i = 0 ; i < temperatures.length ; i++) {
            copyArray[i] = temperatures[i];
        }


        for (i = 0; i < temperatures.length; ++i) {
            copyArray[i] = temperatures[i];
        }

        return copyArray;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] degreesFahrenheit = new int[4];
        int input;
        int i;

        for (i = 0; i < degreesFahrenheit.length; ++i) {
            degreesFahrenheit[i] = scnr.nextInt();
        }

        // Read number of values to increase array size by
        input = scnr.nextInt();

        degreesFahrenheit = expandTracker(degreesFahrenheit, input);

        for (i = 0; i < degreesFahrenheit.length; ++i) {
            System.out.print(degreesFahrenheit[i] + " ");
        }
    }
}