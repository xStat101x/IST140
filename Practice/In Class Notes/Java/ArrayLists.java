import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

    // todo: write a method, promptUserForNums, that takes no formal parameters
    //     and returns an ArrayList<Integers>

    /**
     * This is a very important method for the final and I should be able to do this without a thought
     * @return enteredNumbers
     */
    public static ArrayList<Integer> promptUserForNums() {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> enteredNumbers = new ArrayList<>(); // currently empty

        while (scan.hasNextInt()) {
            int currNum = scan.nextInt();
            enteredNumbers.add(currNum);
        }

        return enteredNumbers;
    }

    // todo: write a method that takes an ArrayList<Integer> and returns the
    //      sum of the numbers in the ArrayList

    public static int sumArrayList(ArrayList<Integer> aListNums) {
        int num = 0;
        for (int i = 0 ; i < aListNums.size() ; i++) {
            num += aListNums.get(i);
        }
        return num;
    }

    public static void main(String[] args) {



        // Declaring an (empty) arraylist of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("cindy");
        names.add("bob");

        String secondName = names.get(1);
        System.out.println("Here's the second name: " + secondName);
        // =============================================================

        String[] names2 = new String[5];
        names2[0] = "Cindy"; //

        ArrayList<Integer> nums = promptUserForNums();
        System.out.println(nums);

        int sumArray = sumArrayList(nums);
        System.out.println(sumArray);

    }
}
