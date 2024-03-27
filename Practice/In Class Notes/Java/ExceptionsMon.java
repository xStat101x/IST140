import javax.lang.model.type.ArrayType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionsMon {
    //Unchecked Exceptions

    /**
     * Computes the square root of the integer {@code n}
     * passed in
     * <p>
     *     <b>REQUIRES: </b> n >= 0
     * </p>
     * @param n
     * @return the square root of {@code n}
     * @throws IllegalArgumentException if n < 0
     */
    public static int sqrt(int n) {
        // "Defensive/validation check"
        // ("sanity check")
        if (n < 0) {
            throw new IllegalArgumentException("can't compute sqrt of a negative n");
        }
        double x = n * 1.0;
        int output = (int) Math.sqrt(x);
        return output;
    }

    // CHECKED Exceptions...
    // Reading-from and writing-to file

    /**
     * Write a new file named {@code fileName } to the projects root directory
     * @param fileName
     */
    public static void writeToFile(String fileName, ArrayList<String> data){


        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (String item : data) {
                writer.println(item);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: " + fnfe.getMessage());
        }
    }

    //Hint:
    //Scanner ---> scanning/reading-from files (pulling info from files)
    //PrintWriter ---> writing to files

    /**
     * Reads from the specified {@code filename} and returns the data.
     * @param fileName
     * @return
     */
    public static ArrayList<String> readFromFile(String fileName) {
        ArrayList<String> resultData = new ArrayList<>();
        try (Scanner scan = new Scanner(new File(fileName))) {
            while (scan.hasNextLine()) {
                String currLine = scan.nextLine();
                resultData.add(currLine);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return resultData;
    }
    public static void main(String[] args) {
        int s1 = sqrt(4);
        int s2 = sqrt(400);
        int s3 = sqrt(-3);

        ArrayList<String> food = new ArrayList<>();
        food.add("banana");
        food.add("apple");
        food.add("cherry");
        food.add("cashew");
        food.add("yogurt");
        writeToFile("food.txt", food);

        ArrayList<String> dataRead = readFromFile("food.txt");

        System.out.println("Here's the food data we read: ");
        for (String fooditem : dataRead) {
            System.out.println("here's a: " + fooditem);
        }

    }
}
