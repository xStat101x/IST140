import java.util.Scanner;

public class question9 {

    public static void barTitle(String s) {
        for (int i = 0 ; i < s.length() ; i++) {
            char subInput = s.charAt(i);
            if (i == s.length() - 1) {
                System.out.println(subInput);
            } else {
                System.out.print(subInput + " | ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        barTitle(input);
    }
}
