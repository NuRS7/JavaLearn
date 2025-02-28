package Neetcode;


public class LeetCode1672 {
    public static int maximumWealth(int[][] accounts) {
        int maxValue = 0;
        for (int[] custemer : accounts) {
            int currentCustomerWealth = 0;
            for (int bank : custemer) {
                currentCustomerWealth += bank;
            }
            maxValue = Math.max(maxValue, currentCustomerWealth);
        }
        System.out.println(maxValue);
        return maxValue;
    }



    public static void main(String[] args) {
        int[][] arr = new int[][]{{2,8,7}, {7,1,3},{1,9,5}};
        maximumWealth(arr);
    }
}
