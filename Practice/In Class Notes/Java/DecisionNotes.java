import java.util.Scanner;

public class DecisionNotes {
    public static void main(String[] args) {

        // write a basic program that reads in an int denoting a richter
        // value that measures the destructiveness of an earthquake...
        // 0 - No earthquake
        // 1 - Very minor earthquake
        // 2 - Still pretty minor e.q. (some property damage)
        // 3 - Houses shaking
        // 4 - Cracks in the street, shaking
        // 5 - Some structural damage (broken windows)
        // 6 - major damage some loss of life
        // 7 - major disaster
        // 8 - MAJOR MAJOR CATASTROPHE

        Scanner scan  = new Scanner(System.in);

        System.out.println("Please enter a magnitude for the earthquake (0-8)");

        int mag = scan.nextInt();
        /*
        if (mag >= 8) {
            System.out.println("MAJOR MAJOR CATASTROPHE");
        }
        else if (mag >= 7) {
            System.out.println("major disaster");
        }
        else if (mag >= 6) {
            System.out.println("major damage some loss of life");
        }
        else if (mag >= 5) {
            System.out.println("Some structural damage (broken windows)");
        }
        else if (mag >= 4) {
            System.out.println("Cracks in the street, shaking");
        }
        else if (mag >= 3) {
            System.out.println("Houses shaking");
        }
        else if (mag >= 2) {
            System.out.println("Still pretty minor e.q. (some property damage)");
        }
        else if (mag >= 1) {
            System.out.println("Very minor earthquake");
        }
        else if (mag >= 0) {
            System.out.println("No earthquake");
        } else {
            System.out.println("Not a number recognized on the richter scale");
        }
        */

        //switch statement
        switch (mag) {
            case 8 -> System.out.println("MAJOR MAJOR CATASTROPHE");
            case 7 -> System.out.println("major disaster");
            case 6 -> System.out.println("major damage some loss of life");
            case 5 -> System.out.println("Some structural damage (broken windows)");
            case 4 -> System.out.println("Cracks in the street, shaking");
            case 3 -> System.out.println("Houses shaking");
            case 2 -> System.out.println("Still pretty minor e.q. (some property damage)");
            case 1 -> System.out.println("Very minor earthquake");
            case 0 -> System.out.println("No earthquake");
            default -> System.out.println("Not a number recognized on the richter scale");
        }

        // write a program that converts a number 1-5 into its word counterpart
        // 1 -> "one"
        // 2 -> "two"
        // 3 -> "three"
        // 4 -> "four"
        // 5 -> "five"

        String wordForNum = switch (mag) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4, 5, 6 -> "four-five-sit";
            default -> "moooo";
        };

        System.out.println("Here's the word for the num: " + wordForNum);
    }
}
