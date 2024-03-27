import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalTest {
    public static void main(String[] args) {

        // declare a scanner for the console
        Scanner scan = new Scanner(System.in);

        // prompt the user then store in goal
        System.out.println("Please enter a daily step goal: ");
        int goal = scan.nextInt();

        // read the step data and store it in data
        ArrayList<Integer> data = readSteps("stepData.txt");

        int[] goalSummary = getGoalSummary(data, goal); // store the goal summary in goal
        ArrayList<Integer> matching = matchingSteps(data); // store the matchingSteps in matching
        writeAnalysis(data, goalSummary, matching, goal); // write everything to the file
    }

    /**
     * reads from file name and stores each daily step count in the arraylist
     * @param fileName the name storing the step data
     * @return arraylist of step counts from each day
     */
    public static ArrayList<Integer> readSteps(String fileName) {
        ArrayList<Integer> output = new ArrayList<>(); // initialize the returned arraylist

        File myfile = new File(fileName); // initialize the file object

        try (Scanner scan = new Scanner(myfile)) { // initialize the scanner that scans from the file object above
            while (scan.hasNextInt()) { // for every int in the file it gets stored in the output arraylist
                output.add(scan.nextInt());
            }
        } catch (FileNotFoundException ex) { // catch a file not found error
            System.out.println("Error: " + ex.getMessage());
        }
        return output;
    }

    /**
     * takes in the step data and determines if the data is above less then or equal to the goal
     * then returns an array with the number for each less than equal or greater in that order
     * @param data the step data
     * @param goal the step goal
     * @return int[] {less than goal, equal to goal, more than goal}
     */
    public static int[] getGoalSummary(ArrayList<Integer> data, int goal) {
        // initialize these variables to be counted and stored
        int less = 0;
        int equal = 0;
        int more = 0;

        // for every number in the data check if its greater equal or less than the goal
        // then increment the associated variable
        for (int i = 0 ; i < data.size() ; i++) {
            if (data.get(i) < goal) {
                less++;
            } else if (data.get(i) > goal) {
                more++;
            } else {
                equal++;
            }
        }

        int[] output = {less, equal, more}; // initialize the output with the three int variables
        return output;
    }

    /**
     * takes in the data and finds data points that are the same as the next day
     * @param data step data
     * @return an arraylist with each number that was equal to the next day
     */
    public static ArrayList<Integer> matchingSteps(ArrayList<Integer> data) {
        ArrayList<Integer> output = new ArrayList<>();

        // find and store the matching numbers in the step data
        for (int i = 0 ; i < data.size() - 1 ; i++) {
            if (data.get(i).equals(data.get(i + 1))) {
                output.add(data.get(i));
            }
        }
        return output;
    }

    /**
     * This method prints to a file "analysis.txt"
     * @param data step data
     * @param goalSummary an int[] = {less than goal, equal to goal, more than goal}
     * @param matching an arraylist of the number of steps that are the same as the next day
     * @param goal the step goal
     */
    public static void writeAnalysis(ArrayList<Integer> data, int[] goalSummary,
                                     ArrayList<Integer> matching, int goal) {
        String fileName = "analysis.txt";
        double average = 0;
        int total = 0;

        File myFile = new File(fileName); // initialize the file object

        try (PrintWriter writer = new PrintWriter(myFile)) { // initialize the PrintWriter associated with the file object

            // calculate the total
            for (int i = 0 ; i < data.size() ; i ++) {
                total += data.get(i);
            }

            // then find the average below and store it
            average = 1.0 * total / data.size() ;

            // print everything to the file using the PrintWriter
            writer.println("Daily step goal: " + goal);
            writer.println("Days under step goal: " + goalSummary[0]);
            writer.println("Days at step goal: " + goalSummary[1]);
            writer.println("Days over step goal: " + goalSummary[2]);
            writer.print("average steps: ");
            writer.printf("%.2f\n", average);
            writer.println("matching steps: " + matching.size());
        } catch (FileNotFoundException ex) { // catch a file not found error
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
