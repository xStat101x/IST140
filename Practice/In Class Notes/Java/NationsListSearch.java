import java.util.Scanner;
import java.util.ArrayList;

public class NationsListSearch {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> nationsList = new ArrayList<String>();
        int numNations;
        int i;

        numNations = scnr.nextInt();
        for (i = 0; i < numNations; ++i) {
            nationsList.add(scnr.next());
        }

        for (i = 1 ; i < nationsList.size() ; i += 2) {
            System.out.print(nationsList.get(i) + " ");
        }

        System.out.println();
    }
}