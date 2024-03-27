import java.util.Scanner;

public class LastVowel
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        int position = -1;
        String ch = word;
        boolean found = false;

        for (int i = word.length() ; i >= 1 && !found ; i--) {
            ch = word.substring(i - 1, i);
            if ("aeiou".contains(ch.toLowerCase())) {
                found = true;
                position = i;
            }
        }

        System.out.println("Position: " + position);
    }
}