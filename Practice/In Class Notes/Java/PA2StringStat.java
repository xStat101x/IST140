import java.util.Scanner;

public class PA2StringStat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int n = str.length();
        String firstLet = str.substring(0, 1);
        String lastLet = str.substring(n - 1, n);

        System.out.println("entered string is: " + str);
        System.out.println("first char: " + firstLet);
        System.out.println("last char: " + lastLet);
        System.out.println("length: " + n);



    }
}
