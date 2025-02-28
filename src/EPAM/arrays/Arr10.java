package EPAM.arrays;

import java.util.Scanner;

public class Arr10 {
    public static int getResult(int[] a) {
        //put your code here
        int maxValue = Integer.MIN_VALUE;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int sum = a[i] + a[n - 1 - i];
            if (sum> maxValue) {
                maxValue = sum;
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
        System.out.println(getResult(arr));
    }

}
