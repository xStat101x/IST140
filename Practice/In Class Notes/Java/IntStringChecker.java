import java.util.Scanner;

public class IntStringChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        for (int i = 0 ; i < input.length() ; i++) {
            char subInput = input.charAt(i);
            if (!Character.isDigit(subInput)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
