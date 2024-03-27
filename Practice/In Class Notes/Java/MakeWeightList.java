import java.util.Scanner;
import java.util.ArrayList;

public class MakeWeightList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numWeights;
        int i;
        ArrayList<Integer> weightList = new ArrayList<Integer>();

        numWeights = scnr.nextInt();
        for (i = 0 ; i < numWeights ; i++) {
            weightList.add(i, -99);
        }

        // Traversing a list using indexes
        for (i = 0; i < weightList.size(); ++i) {
            System.out.print(weightList.get(i) + " ");
        }
        System.out.println();
    }
}