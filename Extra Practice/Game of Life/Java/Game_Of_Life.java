import java.util.Scanner;

public class Game_Of_Life {
    /*
    public static void Generations(String input) {
        int i = 0;
        int cellcount = 0;
        while (i != input.length()) {
            cellcount++;
            i++;
            if (cellcount == input.length()) {

            }


        int cell1_1 = 0;
        int cell1_2 = 0;
        int cell1_3 = 0;
        int cell1_4 = 0;
        int cell1_5 = 0;
        int cell1_6 = 0;
        int cell1_7 = 0;
        int cell1_8 = 0;

        int cell2_1 = 0;
        int cell2_2 = 0;
        int cell2_3 = 0;
        int cell2_4 = 0;
        int cell2_5 = 0;
        int cell2_6 = 0;
        int cell2_7 = 0;
        int cell2_8 = 0;

        int cell3_1 = 0;
        int cell3_2 = 0;
        int cell3_3 = 0;
        int cell3_4 = 0;
        int cell3_5 = 0;
        int cell3_6 = 0;
        int cell3_7 = 0;
        int cell3_8 = 0;

        int cell4_1 = 0;
        int cell4_2 = 0;
        int cell4_3 = 0;
        int cell4_4 = 0;
        int cell4_5 = 0;
        int cell4_6 = 0;
        int cell4_7 = 0;
        int cell4_8 = 0;

        int cell5_1 = 0;
        int cell5_2 = 0;
        int cell5_3 = 0;
        int cell5_4 = 0;
        int cell5_5 = 0;
        int cell5_6 = 0;
        int cell5_7 = 0;
        int cell5_8 = 0;
    }

    public static String displayCells(String input) {
        Generations();

        }
    }
    */
    public static void displayStartGrid() {
        System.out.println("This is the Game of Life!");
        //                  12345678910
        System.out.println(".........."); // 1
        System.out.println(".........."); // 2
        System.out.println(".........."); // 3
        System.out.println(".........."); // 4
        System.out.println(".........."); // 5
        System.out.println(".........."); // 6
        System.out.println(".........."); // 7
        System.out.println(".........."); // 8
    } // Displays a blank Grid
    public static String intRow(String input) {

        String row = "";
            // checks what the user imputed and stores it into a variable
            for (int i = 0 ; i < input.length() ; i++) {
                char subInput = input.charAt(i);
                int x = subInput - '0'; // converts char to an int

                if (x % 2 == 1) {
                    row += "*";
                } else {
                    row += ".";
                }
            }
        return row;
    } // Only useful for the start of generations
    public static String startGenerations() {
        Scanner scan = new Scanner(System.in);
        String row1 = "";
        String row2 = "";
        String row3 = "";
        String row4 = "";
        String row5 = "";
        String row6 = "";
        String row7 = "";
        String row8 = "";

        // Determines What Message to print
        for (int i = 0; i != 8; i++) {
            if (i == 0) {
                System.out.println("Give me 10 Random Letters");
                //                      1234567890
                System.out.println("Ex: asdfjkewls");
                row1 = intRow(scan.nextLine());
            } else if (i == 1) {
                System.out.println("Again Please...");
                row2 = intRow(scan.nextLine());
            } else if (i == 2) {
                System.out.println("Again Please...");
                row3 = intRow(scan.nextLine());
            } else if (i == 3) {
                System.out.println("Again Please...");
                row4 = intRow(scan.nextLine());
            } else if (i == 4) {
                System.out.println("Again Please...");
                row5 = intRow(scan.nextLine());
            } else if (i == 5) {
                System.out.println("Again Please...");
                row6 = intRow(scan.nextLine());
            } else if (i == 6) {
                System.out.println("Again Please...");
                row7 = intRow(scan.nextLine());
            } else {
                System.out.println("Again Please...");
                row8 = intRow(scan.nextLine());
            }
        }
        return row1 + row2 + row3 + row4 + row5 + row6 + row7 + row8;
    } // Creates the first generation
    public static void displayGenerations(String input) {
        String row1 = input.substring(0,9);
        String row2 = input.substring(10,19);
        String row3 = input.substring(20,29);
        String row4 = input.substring(30,39);
        String row5 = input.substring(40,49);
        String row6 = input.substring(50,59);
        String row7 = input.substring(60,69);
        String row8 = input.substring(70,79);

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
        System.out.println(row6);
        System.out.println(row7);
        System.out.println(row8);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Start the game
        System.out.println("Type Start to Start...");
        String input = scan.nextLine();
        if (input.equals("Start")) {
            displayStartGrid();
            String gen = startGenerations();
            displayGenerations(gen);
            //Main Game
            boolean flag = true;
            while (flag) {
                System.out.println("Do you wish to cont?");
                System.out.println("If so type 'Yes'");
                System.out.println("If you wish to stop type 'Stop'");
                String userInput = scan.next();
                if (userInput.equals("Yes")) {
                    flag = true; // Needs more code not finished yet
                    // This will be the looping Game of life


                } else if (userInput.equals("Stop")) {
                    flag = false;
                    System.out.println("The Game of Life is Dead.");
                    displayStartGrid();
                }

            }
        } else {
            System.out.println("No You May Not Experience The Game of Life!!");
        }



    }
}
