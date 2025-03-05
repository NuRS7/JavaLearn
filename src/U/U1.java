package U;

import java.util.Arrays;
import java.util.Scanner;

public class U1 {
    public static int[] readInteger() {
        Scanner sc = new Scanner(System.in);
        String[] inputValue = sc.nextLine().split(" ");
        int[] array = new int[inputValue.length];

        for (int i = 0; i < inputValue.length; i++) {
            array[i] = Integer.parseInt(inputValue[i]);
        }
        findMin(array);
        findMax(array);
        reverseSorting(array);
        sortedArrays(array);
        System.out.println(Arrays.toString(array));

        return array;


    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        System.out.println("Min value + " + min);
        return min;
    }

    public static int findMax(int[] arrays) {
        int max = Integer.MIN_VALUE;
        int n = arrays.length;
        for (int i = 0; i < n; i++) {
            if (arrays[i] > max) {
                max = arrays[i];

            }
        }
        System.out.println("Max value + " + max);
        return max;
    }

    public static int[] reverseSorting(int[] array) {
        int n = array.length;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] sortedArrays(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        readInteger();
    }

}
