package Neetcode;

import java.util.Arrays;

public class LeetCode1431 {
    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = findMaxValue(candies);
        boolean[] result = new boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {
            result[i] = (candies[i] + extraCandies) >= maxValue;

            }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int findMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 1, 3};;
        int k = 3;
        kidsWithCandies(arr, k);
    }
}
