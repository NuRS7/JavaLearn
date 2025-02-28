package Neetcode;

import java.util.Arrays;

public class LeetCode1480 {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
