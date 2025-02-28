package EPAM.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr12 {
    public static void compress(int[] a) {
        //put your code here
        int n = a.length;
        int index = 0;
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                value[index++] = a[i];
            } else {
                value[index++] = 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        compress(arr);
        System.out.println(Arrays.toString(arr));
    }
}
