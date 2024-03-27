import java.util.Scanner;

public class question7 {

    public static boolean isFun(String str) {

        for (int i = 0 ; i < 2 ; i++) {
            char subInput = str.charAt(i);
            if (subInput == 'f') {
                String subIn2 = str.substring(i, i + 3);
                if (subIn2.equals("fun")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        System.out.println(isFun(input));
    }
}
