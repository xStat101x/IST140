import java.util.Scanner;

public class PA3Pairs {
    public static void main(String[] args) {

        // Create a scanner
        Scanner scan = new Scanner(System.in);

        // Int Variables...
        int int1 = scan.nextInt(); // store input 1 in this variable
        int int2 = scan.nextInt(); // store input 2 in this variable
        int int3 = scan.nextInt(); // store input 3 in this variable
        int int4 = scan.nextInt(); // store input 4 in this variable

        // String Variables...
        String output = ""; // Initialize and set the output variable to nothing (set it to nothing to avoid errors)
        String success = "two pairs!"; // Initialize a success variable and store the success message (to save time)
        String fail = "not two pairs!"; // Initialize a failure variable and store the fail message (to save time)

        // If logic Branch
        if (int1 == int2) { // if int1 = int2
            if (int3 == int4) { // and int3 = int4 // could have done with && but this looks more logical to me
                output = success; // success so set output to success
            } else { // must be fail
                output = fail; // set output to fail
            }
        }
        else if (int1 == int3) { // check for a pair with the other ints
            if (int2 == int4) { // nested if in place of &&
                output = success; // success so set output to success
            } else { // must be a fail
                output = fail; // set output to fail
            }
        }
        else if (int1 == int4) { // same thing as above just for the last int
            if (int2 == int3) { //....
                output = success; //....
            } else { //....
                output = fail; //....
            }
        } else { // this is basically if all else fails it means nothing matches
            output = fail; // since nothing matches set output to fail
        }
        System.out.println(output); // print the output


        /* Truth Table / Logic Table
        p   q   r     (p && q)     (p && q) || !r
        --------------------------------------------
        F   F   F         F              T
        F   F   T         F              F
        T   F   F         F              T
        T   F   T         F              F
        F   T   F         F              T
        F   T   T         F              F
        T   T   F         T              T
        T   T   T         T              T
        */
    }
}
