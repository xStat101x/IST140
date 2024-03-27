import java.util.Scanner;

public class ConcatenateStrings {

    public static String catStrings(String input1, String input2) {
        String shortStr = "";
        String longStr = "";

        if (input1.length() < input2.length()) {
            shortStr = input1;
            longStr = input2;
        } else {
            shortStr = input2;
            longStr = input1;
        }

        String output = shortStr + longStr + shortStr;
        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input1 = scan.next();
        String input2 = scan.next();

        System.out.println(catStrings(input1, input2));
    }
}
