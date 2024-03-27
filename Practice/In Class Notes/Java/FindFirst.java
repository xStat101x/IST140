import java.util.Scanner;

public class FindFirst {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String key = scan.next();



        if (key.length() != 1) {
            System.out.println("invalid input");
        } else {

            int firstIndexFound = -1;

            for (int i = 0 ; i < str.length() ; i++) {
                // access tje i'th character of the str....
                String currLetter = str.substring(i , i + 1);
                if (currLetter.equals(key)) {
                    firstIndexFound = i;
                    break;
                }
            }
            System.out.println(firstIndexFound);
        }
    }
}
