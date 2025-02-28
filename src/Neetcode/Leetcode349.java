package Neetcode;

import java.util.Arrays;

public class Leetcode349 {
    public static void main(String[] args) {
        int nums1[] = new int[]{1,2,2,1};
        int nums2[] = new int[]{2, 2};
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    System.out.println(Arrays.toString(new int[]{nums1[i], nums2[j]}));
                }
            }
        }
    }
}
