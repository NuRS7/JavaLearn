package EPAM.arrays;

import java.util.Scanner;

public class Arr8 {
    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        return max;
    }
    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        return min;
    }

    public static int getResult(int[] a) {
        //put your code here
        int k1 =minElement(a);
        int k2 =maxElement(a);

        return k1 + k2;
    }

    public static void main(String[] args) {
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {
            String[] input = sc.nextLine().split(" ");
            arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
        }

        System.out.println(getResult(arr));
    }
}
