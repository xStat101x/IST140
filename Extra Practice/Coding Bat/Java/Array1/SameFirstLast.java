package Array1;

public class SameFirstLast {

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int firstItem = nums[0];
        int lastItem = nums[nums.length - 1];

        if (firstItem == lastItem) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(sameFirstLast(new int[] {1, 2, 3})); // False
        System.out.println(sameFirstLast(new int[] {1, 2, 3, 1})); // True
        System.out.println(sameFirstLast(new int[] {1, 2, 1})); // True
    }
}
