package EPAM.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr5 {
    public static void swapMinAndMax(int[] a) {
        int maxIndex = 0;
        int minIndex = 0;
        if (a.length <2 ) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }

        }
        int temp = a[maxIndex];
        a[maxIndex] = a[minIndex];
        a[minIndex] = temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        sc.close();
        int[] arr = new int[input.length];
        for (int i = 0; i<input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        swapMinAndMax(arr);
        System.out.println(Arrays.toString(arr));
    }
}