import java.util.Scanner;

public class PrintRev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean doneEnterStrings = false;

        while (!doneEnterStrings) {
            String currStr = scan.nextLine();
            if (currStr.equals("Done") || currStr.equals("done") || currStr.equals("d")) {
                doneEnterStrings = true;
            } else {
                /*
                for (int i = currStr.length() - 1; i <= currStr.length(); i--) {
                    String output += currStr.charAt(i);
                }*/
            }

        }
    }
}
