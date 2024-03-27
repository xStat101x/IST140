import java.util.Scanner;

public class FirstVowel
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        boolean found = false;
        int position = 0;
        String ch = word;

        for (int i = 0 ; i < word.length() && !found ; i++) {
            ch = word.substring(i, i + 1);
            if ("aeiou".contains(ch.toLowerCase())) {
                found = true;
                position = i;
            }
        }

        if (found)
        {
            System.out.println("First vowel: " + ch);
            System.out.println("Position: " + position);
        }
        else
        {
            System.out.println("No vowels");
        }
    }
}