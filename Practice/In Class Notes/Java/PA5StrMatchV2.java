import java.util.Scanner;

public class PA5StrMatchV2 {

    public static int countOverlapSites(String s1, String s2) {
        int output = 0;
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            char subInput = s1.charAt(i);
            char subInput2 = s2.charAt(i);

            if (subInput2 == subInput && i < s1.length() - 1 && i < s2.length() - 1) {
                subInput2 = s1.charAt(i + 1);
                subInput = s2.charAt(i + 1);

                if (subInput2 == subInput) {
                    output++;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();

        System.out.println(countOverlapSites(s1, s2));
    }
}
