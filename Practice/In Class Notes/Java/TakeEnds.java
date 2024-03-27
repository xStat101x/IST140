import java.util.Scanner;

public class TakeEnds {

    public static String chipChop(String input) {
        if (input.length() < 3) {
            return input;
        } else {
            String output ="";
            for (int i = 1 ; i < input.length() - 1 ; i++) {
                output = output.concat(input.substring(i, i + 1));
            }
            return output;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(chipChop(input));
    }
}
