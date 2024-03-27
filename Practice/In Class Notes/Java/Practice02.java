import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {

        // %n = 'n as in newline'
        // %d = 'd as in decimal (whole number)
        // %f = 'f' as om a fractional number
        // %s = 's' as in string
        // %b = 'b' as a boolean (true or false)

        // (40, 50, 60)
        // System.out.printf("(%d, %d, %s)\n", 40, 50, "cat" );
        // System.out.println("(" + 40 + ", " + 50 + ", " + 60 + ")");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        int dif = num1 - num2;
        int prod = num1 * num2;
        double avg = sum / 2.0;
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        System.out.printf("%-15s%d\n", "sum:", sum);
        System.out.printf("%-15s%d\n", "difference:", dif);
        System.out.printf("%-15s%d\n", "product:", prod);
        System.out.printf("%-15s%.2f\n", "average:", avg);
        System.out.printf("%-15s%d\n", "max:", max);
        System.out.printf("%-15s%d\n", "min:", min);

    }
}
