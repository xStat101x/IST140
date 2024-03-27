public class Sum67 {

    public static int sum67(int[] nums) {
        int numSum = 0;
        boolean isSix = false;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 6) {
                isSix = true;
            }
            if (!isSix) {
                numSum += nums[i];
            }
            if (nums[i] == 7) {
                isSix = false;
            }
        }
        return numSum;
    }
    public static void main(String[] args) {

    }
}
