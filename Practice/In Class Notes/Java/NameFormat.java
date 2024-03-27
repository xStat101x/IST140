import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //pull in the entire line (whitespace and all)
        String inputLine = scan.nextLine();
        // 012345678910
        // Julia Clark
        int firstWsIndex = inputLine.indexOf(' ');

        int lastWsIndex = inputLine.lastIndexOf(' ');

        if (firstWsIndex == lastWsIndex) {
            // This means there is only two words in the inputLine string...
            String first = inputLine.substring(0, firstWsIndex);
            String second = inputLine.substring(firstWsIndex + 1);

            System.out.println(second + ", " + first.charAt(0) + ".");
        } else {
            String first = inputLine.substring(0, firstWsIndex);
            String second = inputLine.substring(firstWsIndex + 1, lastWsIndex);
            String third = inputLine.substring(lastWsIndex + 1);

            System.out.println(third + ", " + first.charAt(0) + "." + second.charAt(0) + ".");

        }
    }
}
