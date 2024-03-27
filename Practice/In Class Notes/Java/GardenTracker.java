import java.util.Scanner;

public class GardenTracker {
    public static String[] flowerReport(String[] oldArray) {

        String[] newArray = new String[oldArray.length];
        for (int i = 0 ; i < oldArray.length ; i++) {
            newArray[i] = oldArray[i] + " need water";
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] currentInventory = new String[4];
        String[] arr;
        int i;

        for (i = 0; i < currentInventory.length; ++i) {
            currentInventory[i] = scnr.next();
        }

        arr = flowerReport(currentInventory);

        for (i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "\n");
        }

        // Check if the array returned by flowerReport() is a copy of currentInventory
        if (arr == currentInventory) {
            System.out.println("\nA new array was not returned.");
        }
    }
}