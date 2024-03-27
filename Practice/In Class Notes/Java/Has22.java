public class Has22 {

    public static boolean has22(int[] nums) {
        for (int i = 1 ; i < nums.length ; i++) {
            if (nums[i] == 2 && nums[i - 1] == 2) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
