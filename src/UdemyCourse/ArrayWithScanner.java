package UdemyCourse;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {
        readIntegers();
    }

    private static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers: ");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i].trim()); // trim() removes leading and trailing whitespaces

        }
        System.out.println(Arrays.toString(arr));
        finMin(arr);
        return arr;
    }

    private static int finMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        return min;
    }

}
