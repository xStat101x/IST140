import java.util.Scanner;

public class CountingTheNo {

    public static int countNo(String input) {
        int output = 0;
        for (int i = 0 ; i < input.length() ; i++) {
            char subInput = input.charAt(i);
            if (Character.isLowerCase(subInput) && subInput == 'n') {
                i++;
                subInput = input.charAt(i);
                if (Character.isLowerCase(subInput) && subInput == 'o') {
                    output++;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(countNo(input));
    }
}
