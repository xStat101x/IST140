import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HockeyPracticeFinal {
    public static int[] generateScoresArray() {
        Random r = new Random();
        int[] output = new int[3];

        for (int i = 0 ; i < output.length ; i++) {
            output[i] = r.nextInt(1,6);
        }

        return output;
    }
    public static String writeToFile(int[] scores) {
        String fileName = "score.txt";
        File myFile = new File(fileName);

        try (PrintWriter print = new PrintWriter(myFile)) {
            for (int i = 0 ; i < scores.length ; i++) {
                print.println(scores[i] );
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return fileName;
    }
    public static ArrayList<Integer> readFile(String fileName) {
        File myFile = new File(fileName);
        ArrayList<Integer> output = new ArrayList<>();

        try (Scanner scan = new Scanner(myFile)) {
            while (scan.hasNextInt()) {
                output.add(scan.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return output;
    }
    public static void printChart(ArrayList<Integer> score) {
        System.out.println("Period  Goals");
        int highScore = 0;
        int periodHS = 0;
        for (int i = 0 ; i < score.size() ; i ++) {
            System.out.print((i + 1) + "       ");
            for (int j = 0 ; j < score.get(i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (score.get(i) > highScore) {
                highScore = score.get(i);
                periodHS = i + 1;
            }
        }
        System.out.println();
        System.out.println("Period " + periodHS + " has the highest number of goals scored.");
    }

    public static void main(String[] args) {
        int[] scoreVals = generateScoresArray();
        String fileName = writeToFile(scoreVals);
        ArrayList<Integer> dataVals = readFile(fileName);
        printChart(dataVals);
    }
}
