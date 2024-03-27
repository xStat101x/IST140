import java.util.Scanner;

public class PA2AvgCalc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

        int avg1 = (num1 + num2 + num3 + num4) / 4;
        int mul1 = num1 * num2 * num3 *num4;
        double avg2 = (num1 + num2 + num3 + num4) / 4.0;
        double mul2 = (double) num1 * num2 * num3 * num4;

        System.out.println( mul1 + " " + avg1);
        System.out.printf("%.3f", mul2);
        System.out.print(" ");
        System.out.printf("%.3f\n", avg2);
    }
}
