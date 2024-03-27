import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 This program reads a file with numbers, and writes the numbers to another
 file, lined up in two columns, and followed by the total.
 */
public class Total
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Prompt for the input and output file names
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        String outputFileName = "out.txt";

        // Construct the Scanner and PrintWriter objects for reading and writing
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        // Read the input and write the output
        double total = 0;
        int count = 0;

        while (in.hasNextDouble() && in.hasNextDouble())
        {
            count++;
            double value = in.nextDouble();
            double value2 = in.nextDouble();
            total = total + value;
            System.out.printf("%15.2f\n", value + value2);
        }

        out.printf("Total: %6.2f\n", total);
        in.close();
        out.close();
    }
}