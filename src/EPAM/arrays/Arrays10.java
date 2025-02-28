package EPAM.arrays;

import java.util.Scanner;

class Arrays10 {

    /**
     * @param a the given array, containing an even number of elements
     * @return max(a[0] + a[n - 1], ..., a[n / 2 - 1] + a[n / 2])
     */
    public static int getResult(int[] a) {
        //put your code here
        int maxValue = Integer.MIN_VALUE;
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int sumValue = a[i] + a[n - 1 - i];
            if (sumValue > maxValue) {
                maxValue = sumValue;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int result = getResult(arr);
    }
}