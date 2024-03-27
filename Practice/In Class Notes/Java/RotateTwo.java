import java.util.Scanner;

public class RotateTwo {

    public static String rotate(String input) {
        String output = "";
        if (input.length() <= 2) {
            return input;
        } else {
            for (int i = 2 ; i < input.length() ; i++) {
                output += input.substring(i , i + 1);
            }
            output += input.substring(0 , 2);
            return output;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        System.out.println(rotate(input));
    }
}
