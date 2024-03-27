import java.util.Scanner;

public class PA5CountNoOverlap {
    /**
     * Takes in the string converts it to lowercase in order to compare chars
     * then checks if the next two chars == the first one and increments the count
     * @param input
     * @return count
     */
    public static int ctNoOverlap(String input) {
        int count = 0;
        //converts everything to lower case so they can be compared with chars
        input = input.toLowerCase();
        for (int i = 0 ; i < input.length() - 2 ; i++) {
            //Makes sure there is three in a row of the same letter
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i + 2)) {
                count++;
                i += 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        System.out.println(ctNoOverlap(input));
    }
}
