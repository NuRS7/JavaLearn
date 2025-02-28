package EPAM.arrays;

import java.util.Scanner;

public class Arr2 {


    public static int getResult(int[] a, int k) {
        int sum = 0;
        for (int num : a) {
            if (num % k == 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int[] arr = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            arr[i - 1] = Integer.parseInt(input[i]);
        }
        int result = getResult(arr, k);
        System.out.println(result);

    }
}
