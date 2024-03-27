import java.util.Scanner;

public class Week2Program {

    public static void main(String[] args) {

        System.out.println("Hello");

        // "declaring a variable x of type int (and initializing it to 50)"
        int x = 50;

        System.out.println("Here's x: " + x);

        //declaring a variable of type Scanner and initializing it
        // (the "System.in" means: "pull user input from the keyboard")
        Scanner scan = new Scanner(System.in);

        int myNum = scan.nextInt();
        System.out.println("here's the entered number: " + myNum);

    }
}
