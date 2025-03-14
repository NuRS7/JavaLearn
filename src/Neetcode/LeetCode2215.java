package Neetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();

        // To hold the unique elements of nums1 and nums2
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add elements from nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Find unique elements in nums1 (in set1 but not in set2)
        List<Integer> uniqueToNums1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                uniqueToNums1.add(num);
            }
        }

        // Find unique elements in nums2 (in set2 but not in set1)
        List<Integer> uniqueToNums2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                uniqueToNums2.add(num);
            }
        }

        // Add the results to the result list
        res.add(uniqueToNums1);
        res.add(uniqueToNums2);

        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = findDifference(new int[]{1,2,3,4,5,6}, new int[]{2,7,8,4,3,1});
        System.out.println(result);  // Expected output: [[], []] (both arrays contain the same elements)
    }
}
