import java.util.Scanner;

public class SatisfiesLy {

    public static boolean endsInLy(String input) {
        int length = input.length();
        if (length == 0) {
            return false;
        }
        String lastTwo = input.substring(input.length() - 2);
        if (lastTwo.equals("ly")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(SatisfiesLy.endsInLy(input));

    }
}
