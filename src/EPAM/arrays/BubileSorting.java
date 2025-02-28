package EPAM.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BubileSorting {
    public static void sort(int[] a, int k) {
        //put your code here
        int swaps = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean checking = false;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swaps++;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    checking = true;
                    System.out.println(Arrays.toString(a));

                    if (swaps == k) {
                        return;
                    }
                }
            }

        }



    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String[] input = sc.nextLine().split(" ");
            int k = Integer.parseInt(input[0]);
            int[] arr = new int[input.length - 1];
            for (int i = 1; i<input.length; i++) {
                arr[i - 1] = Integer.parseInt(input[i]);
            }

            sort(arr, k);

        }
    }
}
