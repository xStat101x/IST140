import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodParsing {

    public static String formattedLine(String input) {
        String output;
        String[] splitLine = input.split("\t");
        output = splitLine[1] + " (" + splitLine[0] + ") -- " + splitLine[2];
        return output;
    }

    public static ArrayList<String> readAllFoodLines(String fileName) {
        ArrayList<String> result = new ArrayList<>();
        // Use Scanner (for reading/scanning from text files)
        // Use PrintWriter (for writing to files)
        try (Scanner scan = new Scanner(new File(fileName))) {
            while (scan.hasNextLine()) {
                String currLine = scan.nextLine();
                if (currLine.endsWith("Available")) {
                    result.add(formattedLine(currLine));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("err: failed to read file");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodFileName  = scan.next();

        ArrayList<String> result = new ArrayList<>();
        result = readAllFoodLines(foodFileName);

        for (String s : result) {
            System.out.println(s);
        }

    }
}
