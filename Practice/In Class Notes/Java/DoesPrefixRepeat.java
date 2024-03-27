import java.util.Scanner;

public class DoesPrefixRepeat {

    public static boolean doesRepeat(String input, int x) {
        boolean output = false;
        char ogSubInput = input.charAt(x - 1);
        for (int i = x ; i < input.length() ; i++) {
            if (ogSubInput == input.charAt(i) || output) {
                output = true;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        int x = scan.nextInt();

        System.out.println(doesRepeat(input, x));
    }
}
