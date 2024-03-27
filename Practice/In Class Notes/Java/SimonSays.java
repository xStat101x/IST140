import java.util.Scanner;

public class SimonSays {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        String simonPattern;
        String userPattern;
        int userScore;
        int i;

        userScore = 0;

        simonPattern = scnr.next();
        userPattern  = scnr.next();

        boolean flag = true;
        for (i = 0 ; i < simonPattern.length() && flag ; i++) {
            if (simonPattern.substring(i, i + 1).equals(userPattern.substring(i, i + 1))) {
                userScore++;
            } else {
                flag = false;
            }
        }

        System.out.println("userScore: " + userScore);

        return;
    }
}