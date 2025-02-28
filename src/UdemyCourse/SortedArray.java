package UdemyCourse;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        printArray(arr);
        return arr;
    }

    public static void printArray(int[] arr) {
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        getIntegers(arr);
    }
}
