package Neetcode;

import java.util.Arrays;

public class D3 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 6};
        int target = 7;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(Arrays.toString(new int[]{nums[i], nums[j]}));
                }
            }
        }
    }
}
