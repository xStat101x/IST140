import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sales {
    public static int[] generateSales() {
        Random rand = new Random();
        /*
        int rand_int1 = rand.nextInt(1, 101);
        int rand_int2 = rand.nextInt(1, 101);
        int rand_int3 = rand.nextInt(1, 101);
        int rand_int4 = rand.nextInt(1, 101);
        int rand_int5 = rand.nextInt(1, 101);
        int rand_int6 = rand.nextInt(1, 101);
        int rand_int7 = rand.nextInt(1, 101);
        int rand_int8 = rand.nextInt(1, 101);
        int rand_int9 = rand.nextInt(1, 101);
        int rand_int10 = rand.nextInt(1,101);

        int[] list = {rand_int1,rand_int2,rand_int3,rand_int4,rand_int5,rand_int6,rand_int7,rand_int8,rand_int9,rand_int10};
         */
        int[] list = new int[10];
        for (int i = 0 ; i < list.length ; i++) {
            int r = rand.nextInt(1, 100);
            list[i] = r;
        }
        System.out.println(Arrays.toString(list));
        return list;
    }

    public static String writeToFile(int[] data) {
        String fName = "numbers.txt";

        // step 1: create a file object
        File myFile = new File(fName);

        // Step 2: we want to CONNECT to myFile
        try (PrintWriter writer = new PrintWriter(myFile)) {
            for (int i = 0 ; i < data.length ; i++) {
                writer.println(data[i]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return fName;
    }

    public static ArrayList<Integer> readNumbers(String fileName) {

        ArrayList<Integer> output = new ArrayList<>();

        // step 1: create a file object
        File myFile = new File(fileName); // same thing as creating a scanner object

        // step 2: we want to CONNECT to myFile
        try (Scanner scan = new Scanner(myFile)) {
            while (scan.hasNextInt()) {
                int num = scan.nextInt();
                output.add(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return output;
    }

    public static void main(String[] args) {
        int [] salesData = generateSales();

        System.out.println(Arrays.toString(salesData));

        String saveFileName = writeToFile(salesData);

        ArrayList<Integer> dataRead = readNumbers(saveFileName);

        System.out.println("Here are the numbers:");
        for (int x : dataRead) {
            System.out.println(x);
        }
    }
}
