import java.util.Scanner;

public class PA5TunaMeltdown {
    /**
     * First Checks length of input to make sure it has more than 9 letters in it.
     * Second it finds the index of the last letter of the first slice and stores it.
     * Then it finds the first letter of the second slice and stores it.
     * Then returns everything in between the two stored indexes.
     * @param input
     * @return input.substring of endSlice1 --> bedSlice2
     */
    public static String scrapeMiddle(String input) {
        //make sure the length can contain two slices
        if (input.length() < 10) {
            return "";
        }
        int endSlice1 = 0;
        int begSlice2 = 0;
        //finds the last index of the first slice
        for (int i = 0 ; i < input.length() ; i++) {
            String subInput = input.substring(i, i + 5);
            if (subInput.equals("slice")) {
                endSlice1 = i + 5;
                i = input.length();
            }
        }
        //finds the first index of the second slice
        for (int x = input.length() - 5; x > 0 ; x--) {
            String subInput2 = input.substring(x, x + 5);
            if (subInput2.equals("slice")) {
                begSlice2 = x;
                x = 0;
            }
        }
        //Gives everything between the two indexes
        return input.substring(endSlice1, begSlice2);
    }
    /*
        012345678901234567890
        slicetunatunaeggslice
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(scrapeMiddle(input));
    }
}
