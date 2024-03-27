import java.util.Scanner;

public class PA0DoubleNum {

    public static void main(String[] args) {

        //System.out.println("Please enter a number: ");

        // declare a scanner variable (for reading input)
        Scanner scan = new Scanner(System.in);

        int myNum = scan.nextInt();

        System.out.println(myNum + " doubled is: " + (myNum * 2));
    }
}
