import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PracticeExam {

    public static int[] generateScores() {
        Random r = new Random();

        int[] output = new int[10];

        for (int i = 0 ; i < 10 ; i++) {
            int randNum = r.nextInt(0,5);
            output[i] = randNum;
        }
        return output;
    }
    public static String getTeamName() {
        System.out.println("Please enter a team name: ");
        Scanner scan = new Scanner(System.in);

        return scan.next();
    }
    public static int computeTotal(int[] scores) {
        int sum = 0;

        for (int i = 0 ; i < scores.length ; i++) {
            sum += scores[i];
        }

        return sum;
    }
    public static ArrayList<String> mungeScoreData(int[] scores) {
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0 ; i < scores.length ; i++) {
            if (scores[i] == 0) {
                output.add("x");
            } else {
                output.add(scores[i] + "");
            }
        }

        return output;
    }
    public static void writeResults(String t1, String t2,
                                    int s1, int s2,
                                    ArrayList<String> r1, ArrayList<String> r2) {

        try (PrintWriter printWriter = new PrintWriter(new File("results.txt"))) {
            printWriter.println("Please enter a team name:");
            printWriter.println(t1);
            printWriter.println("Please enter a team name:");
            printWriter.println(t2);
            printWriter.println("Inning  " + t1 + "  " + t2);
            for (int i = 0 ; i < r1.size() ; i ++) {
                printWriter.println("   " + i + "   " + r1.get(i) + "   " + r2.get(i));
            }
            printWriter.println("Total runs: " + s1 + " " + s2);
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String team1 = getTeamName();
        String team2 = getTeamName();

        int[] scoreT1 = generateScores();
        int[] scoreT2 = generateScores();

        int t1Total = computeTotal(scoreT1);
        int t2Total = computeTotal(scoreT2);

        ArrayList<String> cleanScoreDataT1 = mungeScoreData(scoreT1);
        ArrayList<String> cleanScoreDataT2 = mungeScoreData(scoreT2);

        writeResults(team1, team2, t1Total, t2Total, cleanScoreDataT1, cleanScoreDataT2);
    }
}
