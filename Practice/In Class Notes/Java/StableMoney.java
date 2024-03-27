import java.util.Scanner;

public class StableMoney {

    public static boolean isStable(String input) {

        boolean isA = false;
        boolean output = false;
        for (int i = 0 ; i < input.length() ; i++) {
            char subInput = input.charAt(i);
            if (subInput == 'a') {
                isA = true;
                for (int x = i ; x < input.length() ; x++) {
                    subInput = input.charAt(x);
                    if (subInput != 'b') {
                        output = false;
                    } else {
                        output = true;
                    }
                }
            }

        }
        if (!isA) {
            output = true;
        }
        return output;
    }

    public static boolean allDollarsMatch(String input) {
        boolean output = false;
        for (int i = 0 ; i < input.length() ; i++) {
            char subInput = input.charAt(i);
            if (subInput == '$') {
                if (i == 0 || i == input.length()) {
                    output = true;
                }
                else if (input.charAt(i - 1) == input.charAt(i + 1)) {
                    output = true;
                } else {
                    return false;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(isStable(input));
    }
}
