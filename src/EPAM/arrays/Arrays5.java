package EPAM.arrays;

import java.util.Arrays;

public class Arrays5 {
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
        int[] arr = new int[]{2, 4, -1, 0, -5};
        swapMinAndMax(arr);
        System.out.println(Arrays.toString(arr));
    }
}