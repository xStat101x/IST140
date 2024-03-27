import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day02 {
    public static int attemptTwo() {
        String fileName = "input02.txt";
        String line = "";
        String tempString = "";

        int gameID = 0;
        int red = 0;
        int blue = 0;
        int green = 0;
        int total = 0;

        File myFile = new File(fileName);

        try (Scanner scan = new Scanner(myFile)) {
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                gameID++;
                for (int i = 0 ; i < line.length() ; i++) {
                    if (line.charAt(i) == ':') {
                        for (int x = i ; x < line.length() ; x++) {
                            if (line.charAt(x) == ',' || line.charAt(x) == ';') {
                                if (line.charAt(x - 3) == 'r') {
                                    tempString = line.substring(x - 6 , x - 4);
                                    for (int y = 0 ; y < tempString.length() ; y++) {
                                        if (Character.isWhitespace(tempString.charAt(y))) {
                                            tempString = tempString.substring(y+1);
                                            if (Integer.parseInt(tempString) > red) {
                                                red = Integer.parseInt(tempString);
                                            }
                                        } else {
                                            if (Integer.parseInt(tempString) > red) {
                                                red = Integer.parseInt(tempString);
                                            }
                                        }
                                    }
                                } else if (line.charAt(x - 4) == 'b') {
                                    tempString = line.substring(x - 7, x - 5);
                                    for (int y = 0 ; y < tempString.length() ; y++) {
                                        if (Character.isWhitespace(tempString.charAt(y))) {
                                            tempString = tempString.substring(y+1);
                                            if (Integer.parseInt(tempString) > blue) {
                                                blue = Integer.parseInt(tempString);
                                            }
                                        } else {
                                            if (Integer.parseInt(tempString) > blue) {
                                                blue = Integer.parseInt(tempString);
                                            }
                                        }
                                    }
                                } else if (line.charAt(x - 5) == 'g') {
                                    tempString = line.substring(x - 8, x - 6);
                                    for (int y = 0 ; y < tempString.length() ; y++) {
                                        if (Character.isWhitespace(tempString.charAt(y))) {
                                            tempString = tempString.substring(y+1);
                                            if (Integer.parseInt(tempString) > green) {
                                                green = Integer.parseInt(tempString);
                                            }
                                        } else {
                                            if (Integer.parseInt(tempString) > green) {
                                                green = Integer.parseInt(tempString);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (red <= 12 && blue <= 14 && green <= 13) {
                    total += gameID;
                    red = 0;
                    blue = 0;
                    green = 0;
                } else {
                    red = 0;
                    blue = 0;
                    green = 0;
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return total;
    }

    public static int partTwo() {
        String fileName = "input02.txt";
        String line = "";
        String tempString = "";

        int gameID = 0;
        int red = 0;
        int blue = 0;
        int green = 0;
        int total = 0;
        int tempTotal = 0;

        File myFile = new File(fileName);

        try (Scanner scan = new Scanner(myFile)) {
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                gameID++;
                for (int i = 0 ; i < line.length() ; i++) {
                    if (line.charAt(i) == ':') {
                        for (int x = i ; x < line.length() ; x++) {
                            if (line.charAt(x) == ',' || line.charAt(x) == ';') {
                                if (line.charAt(x - 3) == 'r') {
                                    tempString = line.substring(x - 6 , x - 4);
                                    for (int y = 0 ; y < tempString.length() ; y++) {
                                        if (Character.isWhitespace(tempString.charAt(y))) {
                                            tempString = tempString.substring(y+1);
                                            if (Integer.parseInt(tempString) > red) {
                                                red = Integer.parseInt(tempString);
                                            }
                                        } else {
                                            if (Integer.parseInt(tempString) > red) {
                                                red = Integer.parseInt(tempString);
                                            }
                                        }
                                    }
                                } else if (line.charAt(x - 4) == 'b') {
                                    tempString = line.substring(x - 7, x - 5);
                                    for (int y = 0 ; y < tempString.length() ; y++) {
                                        if (Character.isWhitespace(tempString.charAt(y))) {
                                            tempString = tempString.substring(y+1);
                                            if (Integer.parseInt(tempString) > blue) {
                                                blue = Integer.parseInt(tempString);
                                            }
                                        } else {
                                            if (Integer.parseInt(tempString) > blue) {
                                                blue = Integer.parseInt(tempString);
                                            }
                                        }
                                    }
                                } else if (line.charAt(x - 5) == 'g') {
                                    tempString = line.substring(x - 8, x - 6);
                                    for (int y = 0 ; y < tempString.length() ; y++) {
                                        if (Character.isWhitespace(tempString.charAt(y))) {
                                            tempString = tempString.substring(y+1);
                                            if (Integer.parseInt(tempString) > green) {
                                                green = Integer.parseInt(tempString);
                                            }
                                        } else {
                                            if (Integer.parseInt(tempString) > green) {
                                                green = Integer.parseInt(tempString);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                tempTotal = red * blue * green;
                total += tempTotal;
                red = 0;
                blue = 0;
                green = 0;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(attemptTwo());
        System.out.println(partTwo());
    }
}
