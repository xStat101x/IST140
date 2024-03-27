import java.util.Scanner;

public class PA4StrMatch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input1 = scan.next();
        String input2 = scan.next();

        int count = 0;

        if (input1.length() > input2.length()){
            for (int i = 0; i < input2.length(); i++) {
                if (input1.substring(i, i + 1).equals(input2.substring(i, i + 1))) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < input1.length(); i++) {
                if (input1.substring(i, i + 1).equals(input2.substring(i, i + 1))) {
                    count++;
                }
            }
        }
        if (count > 1 || count == 0) {
            System.out.println(count + " characters match");
        } else {
            System.out.println(count + " character matches");
        }

    }
}
