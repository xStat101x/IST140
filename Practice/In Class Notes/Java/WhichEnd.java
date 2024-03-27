import java.util.Scanner;

public class WhichEnd {

    public static String takeFrom(String input, boolean tf) {
        String output = "";
        if (tf) {
            output = input.substring(0, 1);
        } else {
            output = input.substring(input.length() - 1);
        }
        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input1 = scan.next();
        boolean input2 = scan.nextBoolean();

        System.out.println(takeFrom(input1, input2));
    }
}
