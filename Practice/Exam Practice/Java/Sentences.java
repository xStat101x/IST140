import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class Sentences
{
    public static void main(String[] args)
            throws FileNotFoundException
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.nextLine();
        Scanner in = new Scanner(new File(inputFileName));

        PrintStream out = new PrintStream("sentences.txt");

        while (in.hasNext())
        {
            String word = in.next();
            char last = word.charAt(word.length() - 1);
            if (last == '.')
            {
                out.printf(word + "\n");
            }
            else
            {
                out.printf(word + " ");
            }
        }
    }
}