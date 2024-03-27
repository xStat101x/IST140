package Array2;

import java.util.Scanner;

public class IsEveryWhere {

    public static boolean isEverywhere(int[] nums, int val) {
        int firstItem = 0;
        int secondItem = 0;
        for (int i = 0 ; i < nums.length - 1 ; i++) {
            firstItem = nums[i];
            secondItem = nums[i + 1];
            if (firstItem != val && secondItem != val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {



        System.out.println(isEverywhere(new int[] {1, 2, 1, 3}, 1));
    }
}
