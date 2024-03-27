import java.util.Scanner;

public class ExclaimNameV2 {

    public static String exclaimN(String input, int input2) {
        for (int i = 0 ; i < input2 ; i++) {
            input += "!";
        }
        return input;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        int input2 = scan.nextInt();

        System.out.println(exclaimN(input, input2));

    }
}
