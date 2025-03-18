package Neetcode;

public class LeetCode724 {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int left = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            int right = totalSum - left - nums[i];
            if (right == left) {
                return i;
            }
            left += nums[i];


        }
        return -1;

        }
    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 6, 5, 6};
        pivotIndex(nums);

    }
}
