import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        // first: we need to read in two strings...
        Scanner scan = new Scanner(System.in);

        // declaring two String variables.... (and initializing them using the scanner)
        String str1 = scan.next();
        String str2 = scan.next();

        // if the length of str1 is Greater Than (>) the length of str2, then print str1
        if (str1.length() > str2.length()) {
            System.out.println(str1);
        } else { // str1.length() <= str2.length()
            System.out.println(str2);
        }

        /*

        // FANCY SOLUTION (ternary if)

        String result = (str1.length() > str2.length()) ? str1 : str2;

         */
    }
}
