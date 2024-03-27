import java.util.Scanner;

public class PA5Acronym {

    public static String createAcronym(String input) {
        String output = "";

        for (int i = 0 ; i < input.length() ; i++) {
            char subInput = input.charAt(i);
            if (Character.isUpperCase(subInput)) {
                output += subInput + ".";
                for (int x = i ; !Character.isWhitespace(subInput) && x < input.length() ; x++) {
                    subInput = input.charAt(x);
                    i = x;
                }
            } else {
                for (int x = i ; !Character.isWhitespace(subInput) && x < input.length() ; x++) {
                    subInput = input.charAt(x);
                    i = x;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(createAcronym(input));
    }
}
