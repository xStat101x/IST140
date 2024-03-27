import java.util.Scanner;
import java.util.ArrayList;

public class WidthListModification {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> widthList = new ArrayList<Integer>();
        int numWidths;
        int i;

        numWidths = scnr.nextInt();
        for (i = 0; i < numWidths; ++i) {
            widthList.add(scnr.nextInt());
        }

        for (i = 1 ; i < numWidths ; i += 2) {
            widthList.set(i, -1 * widthList.get(i));
        }

        for (i = 0; i < widthList.size(); ++i) {
            System.out.print(widthList.get(i) + " ");
        }
        System.out.println();
    }
}