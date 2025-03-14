package Neetcode;

import java.util.*;

public class D2215 {
    public static List<List<Integer>> findUniqueNums(int[] nums1, int[] nums2) {
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();
        for (int num1 : nums1) {
            hashSet1.add(num1);
        }

        for (int num2 : nums2) {
            hashSet2.add(num2);
        }
        List<Integer> uniqueToNums1 = new ArrayList<>();
        for (int num : hashSet1) {
            if (!hashSet2.contains(num)) {
                uniqueToNums1.add(num);
            }
        }
            List<Integer> uniqueToNums2 = new ArrayList<>();
            for (int nums3 : hashSet2) {
                if (!hashSet2.contains(nums2)) {
                    uniqueToNums2.add(nums3);
                }
            }
        List<List<Integer>> result = new ArrayList<>();
        result.add(uniqueToNums1);
        result.add(uniqueToNums2);
        System.out.println(Arrays.toString(result.toArray()));
        return result;
    }

    public static void main(String[] args) {
        findUniqueNums(new int[]{1, 23, 4}, new int[]{4, 5, 6, 7});

    }
}