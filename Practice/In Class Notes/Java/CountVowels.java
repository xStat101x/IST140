import java.util.Scanner;

public class CountVowels
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int count = 0;
        for (int i = 0 ; i < word.length() ; i++)
        {
            String ch = word.substring(i, i + 1);
            if ("aeiou".contains(ch))
            {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}