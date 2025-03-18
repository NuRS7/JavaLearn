package Neetcode;

class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i ++)
            sum += nums[i];
        int maxSum = sum;
        for(int i = k; i < nums.length; i ++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
        return (double)maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {13, 4, 54, 5};
        int k = 3;
        findMaxAverage(nums, k);
    }
}
