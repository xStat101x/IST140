import java.util.Scanner;

public class PA5Repetitions {

    public static String rptLst(String input1, int input2) {
        String output = "";
        if (input2 > input1.length()) {
            for (int i = 0; i < input2; i++) {
                output += input1;
            }
        } else if (input2 < 0) {
            output = "";
        } else {
            String subInput = input1.substring(input1.length() - input2);
            for (int i = 0; i < input2; i++) {
                output += subInput;
            }
        }


        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int x = scan.nextInt();

        System.out.println(rptLst(s, x));
    }
}
