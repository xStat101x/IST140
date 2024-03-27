import java.util.Scanner;

/**
 This program computes the time required to double an investment.
 */
public class temp
{
    public static void main(String[] args)
    {
        final double INITIAL_BALANCE = 10000;
        final double TARGET = 2 * INITIAL_BALANCE;

        double balance = INITIAL_BALANCE;
        int year = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Interest rate in percent: ");
        double rate = in.nextDouble();

        // TODO: Count the years required for the investment to double
        // but no more than 20 years

        while (year < 20 || TARGET > balance) {
            balance = (0.01 * rate) * balance;
            year++;
        }

        System.out.println("Year: " + year);
        System.out.printf("Balance: %.2f%n", balance);
    }
}