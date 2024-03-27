import java.util.Scanner;

public class PA5PassChecker {
    public static boolean isValidPass(String s) {
        boolean output = false;

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        if (s.length() >= 9) {
            flag1 = true;
        }
        for (int i = 0 ; i < s.length() ; i++) {

            char subInput = s.charAt(i);
            if (Character.isUpperCase(subInput)) {
                count1++;
            }
            if (!Character.isLetterOrDigit(subInput)) {
                count2++;
            }
            if (Character.isDigit(subInput)) {
                count3++;
            }
        }
        if (count1 >= 1) {
            flag2 = true;
        }
        if (count2 >= 2) {
            flag3 = true;
        }
        if (count3 >= 2) {
            flag4 = true;
        }
        if (flag1 && flag2 && flag3 && flag4) {
            output = true;
        }

        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (isValidPass(input)) {
            System.out.println("yes, the password is conformal");
        } else {
            System.out.println("no, the password is not conformal");
        }
    }
}
