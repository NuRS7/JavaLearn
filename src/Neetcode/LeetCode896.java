package Neetcode;

public class LeetCode896 {
    public static boolean isMonotonic(int[] nums) {
        int direction = 0;

        if (nums.length < 2) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (direction == 0) {
                    direction = 1;
                } else if (direction == -1) {
                    return false;
                }


            } else if (nums[i] < nums[i - 1]) {
                if (direction == 0) {
                    direction = -1;
                } else if (direction == 1) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 5};
        System.out.println(isMonotonic(nums));

    }
}
