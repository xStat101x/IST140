import java.util.Scanner;

public class PA3Change {
    public static void main(String[] args) {
        // Create a scanner
        Scanner scan = new Scanner(System.in);

        // input variable
        int input = scan.nextInt();

        // output variables
        int dollarOutput = 0; // dollars
        int qOutput = 0; // quarters
        int dOutput = 0; // dimes
        int nOutput = 0; // nickels
        int pOutput = 0; // pennies
        // leftover variable
        int leftover = 0; // This will be used over and over to store the remainders

        // Constant variables
        final int DOLLAR_AMOUNT = 100;
        final int QUARTER_AMOUNT = 25;
        final int DIME_AMOUNT = 10;
        final int NICKLE_AMOUNT = 5;

        // Math Logic branch
        if (input > 0) { // if it's greater than zero then find each amount
            dollarOutput = input / DOLLAR_AMOUNT; // set dollarOutput to the total divided by 100
            leftover = input % DOLLAR_AMOUNT; // set leftover to the remainder of input divided by 100
            qOutput = leftover / QUARTER_AMOUNT; // use leftover to find quarter amount and put in qOutput variable
            leftover = leftover % QUARTER_AMOUNT; // use leftover amount to find remainder after taking all quarters out
            dOutput = leftover / DIME_AMOUNT; // use that remainder to set dOutput
            leftover = leftover % DIME_AMOUNT; // same thing as above but for dimes to nickels
            nOutput = leftover / NICKLE_AMOUNT; // ....
            pOutput = leftover % NICKLE_AMOUNT; // ....
        } else { // if the input is zero...
            System.out.println("No change"); // ... Then output this
        }
        // Output logic for plural vs non plural
        if (dollarOutput > 1) { // if greater than 1 then...
            System.out.println(dollarOutput + " Dollars"); // ...print plural form
        }
        else if (dollarOutput > 0) { // if greater than zero but less than 2...
            System.out.println(dollarOutput + " Dollar"); // ...print non plural form
        } // each branch below is the same just for their respective coin type
        if (qOutput > 1) {
            System.out.println(qOutput + " Quarters");
        }
        else if (qOutput > 0) {
            System.out.println(qOutput + " Quarter");
        }
        if (dOutput > 1) {
            System.out.println(dOutput + " Dimes");
        }
        else if (dOutput > 0) {
            System.out.println(dOutput + " Dime");
        }
        if (nOutput > 1) {
            System.out.println(nOutput + " Nickels");
        }
        else if (nOutput > 0) {
            System.out.println(nOutput + " Nickel");
        }
        if (pOutput > 1) {
            System.out.println(pOutput + " Pennies");
        }
        else if (pOutput > 0) {
            System.out.println(pOutput + " Penny");
        }




    }
}
