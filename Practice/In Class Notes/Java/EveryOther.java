import java.util.Scanner;

public class EveryOther {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();


        for (int i = 0; i < input.length() ; i += 2) {
            System.out.print(input.charAt(i));
        }
        /*
        int i = 0;

        while (i < input.length()) {
            System.out.print(input.charAt(i));
            i += 2;
        } */
        System.out.println();
    }
}
