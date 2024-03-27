import java.util.Scanner;

public class Practice_Quiz_2 {
    public static void main(String[] args) {

        System.out.println("Please type in a number (0 - 6 only):");

        Scanner scan = new Scanner(System.in);
        String names = "SunMonTueWedThuFriSat";

        int theNum = scan.nextInt();
        int startPas = 3 * theNum;

        String extractedDay = names.substring(startPas, startPas + 3);

        System.out.println("The day is: " + extractedDay);
    }
}
