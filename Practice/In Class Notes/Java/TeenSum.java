import java.util.Scanner;

public class TeenSum {

    public static int noTeenSum(int input1, int input2, int input3) {
        if (input1 <= 19 && input1 >= 13 && input1 != 15 && input1 != 16) {
            input1 = 0;
        }
        if (input2 <= 19 && input2 >= 13 && input2 != 15 && input2 != 16) {
            input2 = 0;
        }
        if (input3 <= 19 && input3 >= 13 && input3 != 15 && input3 != 16) {
            input3 = 0;
        }
        int output = input1 + input2 + input3;
        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        int input3 = scan.nextInt();

        System.out.println(noTeenSum(input1, input2, input3));
    }
}
