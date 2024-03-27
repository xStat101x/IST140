import java.sql.SQLOutput;
import java.util.Scanner;

public class Module2Week1 {

    public static void main(String[] args) {

        //write declarations for storing the following
        //quantities... chose between integer and floating point numbers
        //declare constants when appropriate:
        //a) number days per week
        //b) number of days until end of semester
        //c) number centimeters in an inch
        //d) height of tallest person in class...

        final int NUM_OF_DAYS_IN_WEEK = 7;

        //NUM_OF_DAYS_IN_WEEK = 9; //COMPILE TIME ERROR (since Num of days in final)

        //b)
        double numOfDaysUntil; //"variable declaration" (without initialization)

        numOfDaysUntil = 4; // assignment statement

        //c)
        final double CM_PER_INCH = 2.54;
        System.out.println(3 + CM_PER_INCH * numOfDaysUntil);

        int myNum = 54;

        //d)
        double tallestPerson = 5.9;

        int myNum2 = 5;

        //Stamps machine:

        //write a program that simulates a stamp machine that receives
        //$ bills and converts them to either:
        //1. penny stamps (1 cent stamps)
        //2. first-class stamps (55cent stamps)
        //A customer inserts some dollars and pushes a purchase button..
        //the vending machine gives out as many first class stamps as the
        //customer paid for (and gives back penny stamps in change)

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter some number of dollars: ");

        int dollarsEntered = scan.nextInt();

        int x;

        x = 5;
        
        System.out.println("here is x: " + x);


    }
}
