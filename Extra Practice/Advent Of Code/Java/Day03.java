import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day03 {

    public static char[][] readFile(String fileName) {
        String line = "";

        int row = 0;
        int cols = 0;

        char[][] output;
        char[][] fail = new char[0][0];

        File myFile = new File(fileName);

        try (Scanner scan = new Scanner(myFile)) {
            line = scan.nextLine();
            row = line.length();
            cols = 10;
            output = new char[row][cols];
            for (int i = 0 ; i < row ; i++) {
                for (int j = 0 ; j < cols ; j++) {
                    output[i][j] = line.charAt(j);
                }
                while (scan.hasNextLine()) {
                    line = scan.nextLine();
                }
            }
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return fail;
    }

    public static int compute(char[][] input) {
        int output = 0;
        for (int i = 1 ; i < input.length - 1 ; i++) {
            for (int j = 1 ; j <input[i].length - 1 ; j++) {
                if (!(input[i][j] == '.')) {
                    if (Character.isDigit(input[i][j])) {
                        // todo: check for symbols around it
                        // todo: determine how big number is
                    } else {
                        // todo: check for numbers around it
                        // todo: determine how big number is
                    }

                }
            }
        }
        return output;
    }

    public static int callThis() {
        int output = compute(readFile("temp.txt"));
        return output;
    }

    public static void main(String[] args) {
        System.out.println(callThis());
    }
}
