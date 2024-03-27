import java.util.Scanner;

public class SumOfInputs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int input;
        System.out.print("Enter values, 0 to quit: ");

        input = in.nextInt();
        while (input != 0) {
            sum = sum + input;
            input = in.nextInt();
        }

        System.out.println("Sum: " + sum);
    }
}