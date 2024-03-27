import java.util.Scanner;

public class temp2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        int count = 0;

        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if (ch == 5) {
                count++;
            }

        }

        System.out.println("word: " + word);
        System.out.println("count: " + count);
    }
}