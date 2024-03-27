import java.util.Scanner;

public class question8 {

    public static boolean sameCatAndDog(String input) {
        boolean isDog = false;
        boolean isCat = false;

        for (int i = 0 ; i < input.length() ; i++) {
            char subInput = input.charAt(i);
            if (subInput == 'd') {
                String subIn2 = input.substring(i, i + 3);
                if (subIn2.equals("dog")) {
                    isDog = true;
                }
            }
        }
        for (int i = 0 ; i < input.length() ; i++) {
            char subInput = input.charAt(i);
            if (subInput == 'c') {
                String subIn2 = input.substring(i, i + 3);
                if (subIn2.equals("cat")) {
                    isCat = true;
                }
            }
        }
        if (isDog && isCat) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        System.out.println(sameCatAndDog(input));
    }
}
