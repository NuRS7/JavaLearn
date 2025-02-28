package Neetcode;

public class D1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        D1 obj = new D1();
        System.out.println(obj.hasDuplicate(nums));
    }
    public  boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;

    }
}

