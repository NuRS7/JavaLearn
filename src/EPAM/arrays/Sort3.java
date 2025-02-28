package EPAM.arrays;

import java.util.Scanner;

public class Sort3 {
    public static void sort(int[] a, int k) {
        //put your code here
        int  swaps = 0;

        for (int i = 0; i < a.length - 1; i++) {
            boolean swapped = false;
            if (a[i]<a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i + 1] = temp;
                swaps++;
                swapped = true;

            }
            if (swaps == k) {
                return;
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);

        int[] arr = new int[input.length - 1];
        for (int i = 0; i < input.length; i++) {
            arr[i - 1] = Integer.parseInt(input[i]);
        }
        sort(arr, k);

    }
}
