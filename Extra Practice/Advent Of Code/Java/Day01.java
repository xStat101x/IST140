import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Day01 {

    public static int computeEachLine(String input) {
        int first = 0;
        int last = 0;
        char subInput;
        boolean flag = false;
        String tempInput = "";

        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        String six = "six";
        String seven = "seven";
        String eight = "eight";
        String nine = "nine";

        for (int i = 0 ; i < input.length() && !flag; i++) {
            subInput = input.charAt(i);
            tempInput = tempInput + subInput;
            if (Character.isDigit(subInput)) {
                first = subInput - '0';
                flag = true;

            }
            if (tempInput.endsWith(one)) {
                first = 1;
                flag = true;
            } else if (tempInput.endsWith(two)) {
                first = 2;
                flag = true;
            } else if (tempInput.endsWith(three)) {
                first = 3;
                flag = true;
            } else if (tempInput.endsWith(four)) {
                first = 4;
                flag = true;
            } else if (tempInput.endsWith(five)) {
                first = 5;
                flag = true;
            } else if (tempInput.endsWith(six)) {
                first = 6;
                flag = true;
            } else if (tempInput.endsWith(seven)) {
                first = 7;
                flag = true;
            } else if (tempInput.endsWith(eight)) {
                first = 8;
                flag = true;
            } else if (tempInput.endsWith(nine)) {
                first = 9;
                flag = true;
            }
        }
        flag = false;
        tempInput = "";
        for (int i = input.length() ; i > 0 && !flag ; i--) {
            subInput = input.charAt(i - 1);
            tempInput = subInput + tempInput;
            if (Character.isDigit(subInput)) {
                last = subInput - '0';
                flag = true;
            }
            if (tempInput.startsWith(one)) {
                last = 1;
                flag = true;
            } else if (tempInput.startsWith(two)) {
                last = 2;
                flag = true;
            } else if (tempInput.startsWith(three)) {
                last = 3;
                flag = true;
            } else if (tempInput.startsWith(four)) {
                last = 4;
                flag = true;
            } else if (tempInput.startsWith(five)) {
                last = 5;
                flag = true;
            } else if (tempInput.startsWith(six)) {
                last = 6;
                flag = true;
            } else if (tempInput.startsWith(seven)) {
                last = 7;
                flag = true;
            } else if (tempInput.startsWith(eight)) {
                last = 8;
                flag = true;
            } else if (tempInput.startsWith(nine)) {
                last = 9;
                flag = true;
            }
        }
        return (first * 10) + last;
    }

    public static void writeToFile() {
        String fName = "input01.txt";

        Scanner scan = new Scanner(System.in);

        // step 1: create a file object
        File myFile = new File(fName);

        // Step 2: we want to CONNECT to myFile
        try (PrintWriter writer = new PrintWriter(myFile)) {
            while (scan.hasNextLine()) {
                writer.println(scan.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static ArrayList<Integer> readFile(String fileName) {

        ArrayList<Integer> output = new ArrayList<>();

        // step 1: create a file object
        File myFile = new File(fileName); // same thing as creating a scanner object

        // step 2: we want to CONNECT to myFile
        try (Scanner scan = new Scanner(myFile)) {
            while (scan.hasNextLine()) {
                int num = computeEachLine(scan.nextLine());
                output.add(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fName = "input01.txt";
        ArrayList<Integer> nums = new ArrayList<>();
        int total = 0;


        nums = readFile(fName);

        for (int i = 0 ; i < nums.size() ; i++) {
            total += nums.get(i);
        }
        System.out.println(total);
    }
}
