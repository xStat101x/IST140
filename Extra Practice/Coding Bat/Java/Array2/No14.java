package Array2;

public class No14 {
    public static boolean no14(int[] nums) {
        int count4s = 0;
        int count1s = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 1) {
                count1s++;
            }
            if(nums[i] == 4) {
                count4s++;
            }
        }
        if (count4s == 0 || count1s == 0) {
            return true;
        }
        return false;
    }

}
