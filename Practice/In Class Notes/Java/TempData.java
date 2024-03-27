import java.util.Scanner;

public class TempData {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int ARR_LENGTH = 6;
        int[] hourlyTemps = new int[ARR_LENGTH];
        int i;

        for (i = 0 ; i < hourlyTemps.length ; i++) {
            hourlyTemps[i] = scnr.nextInt();
        }

        for (i = 0; i < hourlyTemps.length; ++i) {
            System.out.print(hourlyTemps[i] + " ");
        }

        System.out.println();
    }
}
/*
for (i = 0; i < hourlyTemps.length; ++i) {
        hourlyTemps[i] = scnr.nextInt();
        }
 */
