import java.util.Scanner;

public class RepeatFront {

    public static String repeatN(String input, int input2) {
        String output = "";
        for (int i = input2 ; i > 0; i--) {
            output += input.substring(0 , i);
        }
        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int input2 = scan.nextInt();

        System.out.println(repeatN(input, input2));
    }
}
